package Schedule;

import java.util.Scanner;

public class AnnualHoliday extends Schedule {
		
	protected String HolidayName;
	protected String HolidayDate;
		
	public AnnualHoliday(ScheduleType type) {
		super.type = type;
	}
		
	public void getUserInput(Scanner input) {
		System.out.print("Schedule Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Schedule Date (ex: 20MAR21):");
		String date = input.next();
		this.setDate(date);
			
	}


	public void printInfo() {
		String type = "none";
		switch(this.type) {
		case AllDaySchedule:
			type = "Time Schedule";
			break;
		case TimeSchedule:
			type = "All Day Schedule";
			break;
		case AnnualHoliday:
			type = "Annual Holiday";
			break;
		default:
		}
		System.out.println("***Schedule Searched***" + "\nType: " + type + "\nName: " +this.name + "\nDate: " +this.date);
	}
}