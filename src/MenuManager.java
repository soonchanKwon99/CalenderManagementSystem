import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
		System.out.println("1. Add Schedule");
		System.out.println("2. Delete Schedule");
		System.out.println("3. Edit Schedule");
		System.out.println("4. View Schedule");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6: ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Schedule Name: ");
			String ScheName = input.nextLine();
			System.out.println("Schedule Date(DDMMMYY): ");
			String ScheDate = input.nextLine();
			break;
		case 2:
			System.out.println("Schedule Name: ");
			String ScheName2 = input.nextLine();
			System.out.println("Schedule Date(DDMMMYY): ");
			String ScheDate2 = input.nextLine();
			break;
		case 3:
			System.out.println("Schedule Name: ");
			String ScheName3 = input.nextLine();
			System.out.println("Schedule Date(DDMMMYY): ");
			String ScheDate3 = input.nextLine();
			break;
		case 4:
			System.out.println("Schedule Name: ");
			String ScheName4 = input.nextLine();
			System.out.println("Schedule Date(DDMMMYY): ");
			String ScheDate4 = input.nextLine();
			break;
		case 5:
			System.out.println("Show the menu.");
			break;
		case 6:
			System.out.println("Exit the program, Thank you.");
			break;
			}
		}
	}
}
