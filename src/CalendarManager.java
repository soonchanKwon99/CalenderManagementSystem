import java.util.ArrayList;
import java.util.Scanner;

import Schedule.AllDaySchedule;
import Schedule.AnnualHoliday;
import Schedule.Schedule;
import Schedule.ScheduleType;

public class CalendarManager {
	ArrayList<Schedule> schedules  = new ArrayList<Schedule>();
	Scanner input;
	CalendarManager(Scanner input) {
		this.input = input;
	}
	
	public void addSchedule() {
		int Type = 0;
		Schedule schedule;
		while (Type != 1 && Type != 2) {
			System.out.println("1 for Time Schedule");
			System.out.println("2 for All Day Schedule");
			System.out.println("3 for Annual Holiday Schedule");
			System.out.println("Select the number for Schedule Type between 1 and 3:");
			Type = input.nextInt();
			if (Type == 1) {
				schedule = new Schedule(ScheduleType.TimeSchedule);
				schedule.getUserInput(input);
				schedules.add(schedule);
				break;
			}
			else if (Type == 2) {
				schedule = new AllDaySchedule(ScheduleType.AllDaySchedule);
				schedule.getUserInput(input);
				schedules.add(schedule);
				break;
			}
			else if (Type == 3) {
				schedule = new AnnualHoliday(ScheduleType.AnnualHoliday);
				schedule.getUserInput(input);
				schedules.add(schedule);
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
			Schedule schedule = schedules.get(i);
			if (schedule.getName().equals(ScheName)) {
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
						schedule.setName(name);
					}	
					else if (num == 2) {
						System.out.print("Schedule Date:");
						String date = input.next();
						schedule.setDate(date);
					}
					else if (num == 3) {
						System.out.print("Schedule Time:");
						int time = input.nextInt();
						schedule.setTime(time);
					}
					else if (num == 4) {
						System.out.print("Schedule Location:");
						String location = input.next();
						schedule.setLocation(location);
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