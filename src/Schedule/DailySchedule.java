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
//		Daily Schedule이라는 것이 정해졌기 때문에 시간을 입력받을 필요가 없었음. 하루종일의 일정이기 때문에 시간을 입력받을 필요가 없음.
		
		
		
		System.out.print("Schedule Location:");
		String location = input.next();
		this.setLocation(location);
	}

}
