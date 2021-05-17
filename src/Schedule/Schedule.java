package Schedule;

import java.util.Scanner;

import Exceptions.DateFormatException;

public abstract class Schedule implements ScheduleInput {
	protected ScheduleType type = ScheduleType.TimeSchedule;
	protected String name;
	protected String date;
	protected int time;
	protected String location;
	
	public Schedule() {
	}
	
	public Schedule(ScheduleType type) {
		this.type = type;
	}
	
	public Schedule(String name, String date) {
		this.name = name;
		this.date = date;
	}
	
	public Schedule(String name, String date, int time, String location) {
		this.name = name;
		this.date = date;
		this.time = time;
		this.location = location;	
	}
	
	public Schedule(ScheduleType type, String name, String date, int time, String location) {
		this.type = type;
		this.name = name;
		this.date = date;
		this.time = time;
		this.location = location;
	}	
	
	public ScheduleType getType() {
		return type;
	}

	public void setType(ScheduleType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) throws DateFormatException {
		if (!date.contains("JAN") && !date.contains("FEB") && !date.contains("MAR") && !date.contains("APR") && !date.contains("MAY") && !date.contains("JUN") && !date.contains("JUL") && !date.contains("AUG") && !date.contains("SEP") && !date.contains("OCT") && !date.contains("NOV") && !date.contains("DEC")) {
			throw new DateFormatException();
		}
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public abstract void printInfo();
	
	public void setScheduleName(Scanner input) {
		System.out.print("Schedule Name:");
		String name = input.next();
		this.setName(name);	 
	}

	public void setScheduleDate(Scanner input) {
		String date = " ";
		while (!date.contains("JAN") && !date.contains("FEB") && !date.contains("MAR") && !date.contains("APR") && !date.contains("MAY") && !date.contains("JUN") && !date.contains("JUL") && !date.contains("AUG") && !date.contains("SEP") && !date.contains("OCT") && !date.contains("NOV") && !date.contains("DEC")) {
			System.out.print("Schedule Date (ex: 20MAR21):");
			date = input.next();
			try {
				this.setDate(date);
			} 
			catch (DateFormatException e) {
				System.out.println("Incorrect Date Format. Put the Date that contains Proper Month");
			}
		}
	}

	public void setScheduleTime(Scanner input) {
		System.out.print("Schedule Time:");
		int time = input.nextInt();
		this.setTime(time);
	}
	
	public void setScheduleLocation(Scanner input) {
		System.out.print("Schedule Location:");
		String location = input.next();
		this.setLocation(location);
	}

	public String getTypeString() {
		String type = "none";
		switch(this.type) {
		case AllDaySchedule:
			type = "Whole Day Schedule";
			break;
		case TimeSchedule:
			type = "Time Schedule";
			break;
		case AnnualHoliday:
			type = "Anniversary";
			break;
		default:
		} 
		return type;
	}

}
