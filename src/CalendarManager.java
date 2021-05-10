import java.util.ArrayList;
import java.util.Scanner;

import Schedule.AllDaySchedule;
import Schedule.AnnualHoliday;
import Schedule.Schedule;
import Schedule.ScheduleInput;
import Schedule.ScheduleType;
import Schedule.TimeSchedule;

public class CalendarManager {
	ArrayList<ScheduleInput> schedules  = new ArrayList<ScheduleInput>();
	Scanner input;
	CalendarManager(Scanner input) {
		this.input = input;
	}
	
	public void addSchedule() {
		int Type = 0;
		ScheduleInput scheduleInput;
		while (Type != 1 && Type != 2) {
			System.out.println("1 for Time Schedule");
			System.out.println("2 for All Day Schedule");
			System.out.println("3 for Annual Holiday Schedule");
			System.out.println("Select the number for Schedule Type between 1 and 3:");
			Type = input.nextInt();
			if (Type == 1) {
				scheduleInput = new TimeSchedule(ScheduleType.TimeSchedule);
				scheduleInput.getUserInput(input);
				schedules.add(scheduleInput);
				break;
			}
			else if (Type == 2) {
				scheduleInput = new AllDaySchedule(ScheduleType.AllDaySchedule);
				scheduleInput.getUserInput(input);
				schedules.add(scheduleInput);
				break;
			}
			else if (Type == 3) {
				scheduleInput = new AnnualHoliday(ScheduleType.AnnualHoliday);
				scheduleInput.getUserInput(input);
				schedules.add(scheduleInput);
				break;
			}
			else {
				System.out.print("Select the number for Schedule Type:");
			}
		}	
	}
	
	public void delSchedule() {
		System.out.print("Schedule Name:");
		String ScheName = input.next();
		int index = -1;
		for (int i = 0; i < schedules.size(); i++) {
			if (schedules.get(i).getName().equals(ScheName)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			schedules.remove(index);
			System.out.println("The schedule "+ScheName+" has deleted.");
		}
		else {
			System.out.println("*The schedule has not been registered*");
			return;
		}

	}
	
	public void editSchedule() {
		System.out.print("Schedule Name:");
		String ScheName = input.next();
		for (int i = 0; i < schedules.size(); i++) {
			ScheduleInput scheduleInput = schedules.get(i);
			if (scheduleInput.getName().equals(ScheName)) {
				int num = -1;
				while (num!= 5) {
					System.out.println("***Schedule Info Edit Menu***");
					System.out.println(" 1. Edit Schedule Name");
					System.out.println(" 2. Edit Schedule Date");
					System.out.println(" 3. Edit Schedule Time");
					System.out.println(" 4. Edit Schedule Location");
					System.out.println(" 5. Exit");
					System.out.println(" Select one number between 1-5:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Schedule Name:");
						String name = input.next();
						scheduleInput.setName(name);
					}	
					else if (num == 2) {
						System.out.print("Schedule Date:");
						String date = input.next();
						scheduleInput.setDate(date);
					}
					else if (num == 3) {
						System.out.print("Schedule Time:");
						int time = input.nextInt();
						scheduleInput.setTime(time);
					}
					else if (num == 4) {
						System.out.print("Schedule Location:");
						String location = input.next();
						scheduleInput.setLocation(location);
					}
					else {
						continue;				
					}//else
				}//while	
				break;
			} //if
		} //for
	}
	public void viewSchedules() {
//		System.out.println("Schedule Name:");
//		String ScheName = input.next();
		for (int i = 0; i < schedules.size(); i++) {
			schedules.get(i).printInfo();
		}
	}
}	