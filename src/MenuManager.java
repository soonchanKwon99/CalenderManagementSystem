import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalendarManager calendarManager = new CalendarManager(input);
		
		selectMenu(input, calendarManager);
	}
	
	public static void selectMenu(Scanner input, CalendarManager calendarManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					calendarManager.addSchedule();
					break;
				case 2:
					calendarManager.delSchedule();
					break;
				case 3:
					calendarManager.editSchedule();
					break;
				case 4:
					calendarManager.viewSchedules();
					break;
				case 5:
					System.out.println("Exit the Program");
					break;
				default:
					continue;
				}	
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an ineger between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;

			}
		}
	}
	
	public static void showMenu() {
		System.out.println("***Calendar Management System***");
		System.out.println("1. Add Schedule");
		System.out.println("2. Delete Schedule");
		System.out.println("3. Edit Schedule");
		System.out.println("4. View Schedules");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5:");	
	}
}