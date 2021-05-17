package Schedule;

import java.util.Scanner;

public class AllDaySchedule extends Schedule {
	
	public AllDaySchedule(ScheduleType type) {
		super(type);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleName(input); 
		setScheduleDate(input);
		setScheduleLocation(input);
	}
	
	public void printInfo() {
		String type = getTypeString();
		System.out.println("***Schedule Searched***" + "\nType: " + type + "\nName: " +this.name + "\nDate: " +this.date + "\nTime: " +this.time + "\nLocation: " +this.location);
	}

}
