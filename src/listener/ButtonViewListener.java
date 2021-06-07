package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.ScheduleViewer;
import gui.WindowFrame;
import manager.CalendarManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ScheduleViewer scheduleViewer = frame.getScheduleviewer();
		CalendarManager calendarManager = getObject("calendarmanager.ser");
		scheduleViewer.setCalendarManager(calendarManager);
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(scheduleViewer);
		frame.revalidate();
		frame.repaint();

	}
	
	public static CalendarManager getObject(String filename) {
		CalendarManager calendarManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			calendarManager = (CalendarManager) in.readObject();

			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return calendarManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return calendarManager;
	}

}
