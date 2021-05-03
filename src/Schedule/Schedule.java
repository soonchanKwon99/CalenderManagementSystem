  package Schedule;

import java.util.Scanner;

public class Schedule {
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

	public void setDate(String date) {
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
	
	public void printInfo() {
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
		System.out.println("***Schedule Searched***" + "\nType: " + type + "\nName: " +this.name + "\nDate: " +this.date + "\nTime: " +this.time + "\nLocation: " +this.location);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Schedule Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Schedule Date (ex: 20MAR21):");
		String date = input.next();
		this.setDate(date);
		
		System.out.print("Schedule Time (ex: 2400):");
		int time = input.nextInt();
		this.setTime(time);
		
		System.out.print("Schedule Location:");
		String location = input.next();
		this.setLocation(location);
	}
	

}
