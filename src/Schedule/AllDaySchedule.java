package Schedule;

import java.util.Scanner;

public class AllDaySchedule extends Schedule implements ScheduleInput{
	
	public AllDaySchedule(ScheduleType type) {
		super.type = type;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Schedule Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Schedule Date (ex: 20MAR21):");
		String date = input.next();
		this.setDate(date);
			
		System.out.print("Schedule Location:");
		String location = input.next();
		this.setLocation(location);
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

}
