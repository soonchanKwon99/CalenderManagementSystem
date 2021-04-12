import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalendarManager calendarManager = new CalendarManager(input);		
		
		int num = -1;
		while (num != 5) {
			System.out.println("***Calendar Management System***");
			System.out.println("1. Add Schedule");
			System.out.println("2. Delete Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedules");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1-5:");
			num = input.nextInt();
			if (num == 1) {
				calendarManager.addSchedule();
			}	
			else if (num == 2) {
				calendarManager.delSchedule();
			}
			else if (num == 3) {
				calendarManager.editSchedule();
			}
			else if (num == 4) {
				calendarManager.viewSchedules();
			}
			else {
				System.out.println("Exit the Program");
			}
		}
	}
}	