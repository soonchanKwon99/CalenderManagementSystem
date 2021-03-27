import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("***Calendar Management System***");
			System.out.println("1. Add Schedule");
			System.out.println("2. Delete Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedule");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			if (num == 1) {
				addSchedule();
			}	
			else if (num == 2) {
				delSchedule();
			}
			else if (num == 3) {
				editSchedule();
			}
			else if (num == 4) {
				viewSchedule();
			}
		}
	}
	public static void addSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.println("Schedule Name:");
		String ScheName = input.nextLine();
		System.out.println(ScheName);
		System.out.println("Schedule Date (DDMMMYY / ex: 20MAR21):");
		String ScheDate = input.nextLine();
		System.out.println(ScheDate);
		System.out.println("Schedule Time (24hour-clock / ex: 1300):");
		String ScheTime = input.nextLine();
		System.out.println(ScheTime);
		System.out.println("Schedule Location:");
		String ScheLoca = input.nextLine();
		System.out.println(ScheLoca);
	}
	public static void delSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.println("Schedule Name:");
		String ScheName = input.nextLine();
	}
	public static void editSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.println("Schedule Name:");
		String ScheName = input.nextLine();
		System.out.println(ScheName);
	}
	public static void viewSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.println("Schedule Name:");
		String ScheName = input.nextLine();
		System.out.println(ScheName);
	}
}	
