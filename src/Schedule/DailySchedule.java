package Schedule;

import java.util.Scanner;

public class DailySchedule extends Schedule{
	
	public void getUserInput(Scanner input) {
		System.out.print("Schedule Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Schedule Date (DDMMMYY / ex: 20MAR21):");
		String date = input.next();
		this.setDate(date);
		
		
//		char answer = 'x';
//		while (answer != 'w' && answer != 'W' && answer != 't' && answer != 'T') {
//			System.out.print("Whole Day Schedule or Time Schedule? (W/T)");
//			answer = input.next().charAt(0);
//			if (answer == 'w' || answer == 'W') {
//				break; 
//			}
//			else if (answer == 't' || answer == 'T') {
//				this.setTime(time);
//				break;
//			}
//			else {
//				System.out.print("Select the number for Schedule Kind between 1 and 2:");
//			}
//		}
//		Daily Schedule�̶�� ���� �������� ������ �ð��� �Է¹��� �ʿ䰡 ������. �Ϸ������� �����̱� ������ �ð��� �Է¹��� �ʿ䰡 ����.
		
		
		
		System.out.print("Schedule Location:");
		String location = input.next();
		this.setLocation(location);
	}

}
