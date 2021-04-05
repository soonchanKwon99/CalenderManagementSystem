import java.util.Scanner;

public class CalendarManager {
	Calendar calendar;
	Scanner input;
	CalendarManager(Scanner input) {
		this.input = input;
	}
	
	public void addSchedule() {
		calendar = new Calendar();
		System.out.println("Schedule Name:");
		calendar.name = input.next();
		System.out.println("Schedule Date (DDMMMYY / ex: 20MAR21):");
		calendar.date = input.next();
		System.out.println("Schedule Time (24hour-clock / ex: 1300):");
		calendar.time = input.nextInt();
		System.out.println("Schedule Location:");
		calendar.location = input.next();
	}
	
	public void delSchedule() {
		System.out.println("Schedule Name:");
		String ScheName = input.next();
		if (calendar.equals(null)) {
			System.out.println("*The schedule has not been registered*");
			return;
		}
		if (calendar.name.equals(ScheName)) {
			calendar = null;
			System.out.println("the schedule is deleted");
		}
	}
	
	public void editSchedule() {
		System.out.println("Schedule Name:");
		String ScheName = input.next();
		System.out.println("Schedule Date:");
		String ScheDate = input.next();
		if (calendar.name.equals(ScheName) && calendar.date.equals(ScheDate)) {
			System.out.println("The Schedule to be edited is " +ScheDate +ScheName);
		
		}
	}
	
	public void viewSchedule() {
		System.out.println("Schedule Name:");
		String ScheName = input.next();
		if (calendar.name.equals(ScheName)) {
			calendar.printInfo();
		}
	}

}	