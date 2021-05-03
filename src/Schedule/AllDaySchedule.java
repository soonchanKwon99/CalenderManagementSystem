package Schedule;

import java.util.Scanner;

public class AllDaySchedule extends Schedule{
	
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
}
