package Schedule;

import java.util.Scanner;

public class AnnualHoliday extends Schedule {
		
	protected String HolidayName;
	protected String HolidayDate;
		
	public AnnualHoliday(ScheduleType type) {
		super(type);
	} 
		
	public void getUserInput(Scanner input) {
		setScheduleName(input); 
		setScheduleDate(input);
	}
	
	public void printInfo() {
		String type = getTypeString();
		System.out.println("***Schedule Searched***" + "\nType: " + type + "\nName: " +this.name + "\nDate: " +this.date);
	}

}