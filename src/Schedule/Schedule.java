package Schedule;

import java.util.Scanner;

public abstract class Schedule {
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
	
	public abstract void printInfo();
}