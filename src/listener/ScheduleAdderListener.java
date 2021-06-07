package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exceptions.DateFormatException;
import Schedule.ScheduleInput;
import Schedule.ScheduleType;
import Schedule.TimeSchedule;
import manager.CalendarManager;

public class ScheduleAdderListener implements ActionListener {
	JTextField fieldName;
	JTextField fieldDate;
	JTextField fieldTime;
	JTextField fieldLocation;
	
	CalendarManager calendarManager;
	
	public ScheduleAdderListener(
			JTextField fieldName, 
			JTextField fieldDate, 
			JTextField fieldTime,
			JTextField fieldLocation,
			CalendarManager calendarManager) {
		this.fieldName = fieldName;
		this.fieldDate = fieldDate;
		this.fieldTime = fieldTime;
		this.fieldLocation = fieldLocation;
		this.calendarManager = calendarManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		ScheduleInput schedule = new TimeSchedule(ScheduleType.TimeSchedule);
		try {
			schedule.setName(fieldName.getText());
			schedule.setDate(fieldDate.getText());
			schedule.setTime(Integer.parseInt(fieldTime.getText()));
			schedule.setLocation(fieldLocation.getText());
			calendarManager.addSchedule(schedule);
			putObject(calendarManager, "calendarmanager.ser");
			schedule.printInfo();
		} catch (DateFormatException e1) {
			e1.printStackTrace();
		}
	}
	public static void putObject(CalendarManager calendarManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(calendarManager);

			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}

}
