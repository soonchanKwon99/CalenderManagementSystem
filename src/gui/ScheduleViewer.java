package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Schedule.ScheduleInput;
import manager.CalendarManager;

public class ScheduleViewer extends JPanel {
	
	WindowFrame frame;
	
	CalendarManager calendarManager;

	public CalendarManager getCalendarManager() {
		return calendarManager;
	}

	public void setCalendarManager(CalendarManager calendarManager) {
		this.calendarManager = calendarManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("DATE");
		model.addColumn("TIME");
		model.addColumn("LOCATION");

		for (int i = 0; i < calendarManager.size(); i++) {
			Vector row = new Vector();
			ScheduleInput si = calendarManager.get(i);
			row.add(si.getName());
			row.add(si.getDate());
			row.add(si.getTime());
			row.add(si.getLocation());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

	public ScheduleViewer(WindowFrame frame, CalendarManager calendarManager) {
		this.frame = frame;
		this.calendarManager = calendarManager;
		
		System.out.println("***" + calendarManager.size() + "***");
		
	}

}
