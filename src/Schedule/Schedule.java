package Schedule;

import java.util.Scanner;

public class Schedule {
	protected ScheduleKind kind = ScheduleKind.TimeSchedule;
	protected String name;
	protected String date;
	protected int time;
	protected String location;
	
	public Schedule() {
	}
	
	public Schedule(String name) {
		this.name = name;
	}
	
	public Schedule(String name, String date, int time, String location) {
		this.name = name;
		this.date = date;
		this.time = time;
		this.location = location;
	}
	
	public ScheduleKind getKind() {
		return kind;
	}

	public void setKind(ScheduleKind kind) {
		this.kind = kind;
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
		System.out.println("***Schedule Searched*** \nName: " +this.name + "\nDate: " +this.date + "\nTime: " +this.time + "\nLocation: " +this.location);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Schedule Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Schedule Date:");
		String date = input.next();
		this.setDate(date);
		
		System.out.print("Schedule Time:");
		int time = input.nextInt();
		this.setTime(time);
		
		System.out.print("Schedule Location:");
		String location = input.next();
		this.setLocation(location);
	}
	

}
