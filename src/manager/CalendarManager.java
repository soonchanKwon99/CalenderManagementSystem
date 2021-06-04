package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Schedule.AllDaySchedule;
import Schedule.AnnualHoliday;
import Schedule.Schedule;
import Schedule.ScheduleInput;
import Schedule.ScheduleType;
import Schedule.TimeSchedule;

public class CalendarManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 986863961563611926L;
	
	ArrayList<ScheduleInput> schedules  = new ArrayList<ScheduleInput>();
	transient  Scanner input;
	CalendarManager(Scanner input) {
		this.input = input;
	}
	
	public void addSchedule() {
		int Type = 0;
		ScheduleInput scheduleInput;
		while (Type < 1 || Type > 3) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please put an ineger between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				Type = -1; 
			}
		}
	}
	
	public void delSchedule() {
		System.out.print("Schedule Name:");
		String ScheName = input.next();
		int index = findIndex(ScheName);
		for (int i = 0; i < schedules.size(); i++) {
			if (schedules.get(i).getName().equals(ScheName)) {
				index = i;
				break;
			}
		}
		removeformSchedules(index, ScheName);

	} 
	
	public int findIndex(String ScheName) {
		int index = -1;
		for (int i = 0; i < schedules.size(); i++) {
			if (schedules.get(i).getName().equals(ScheName)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removeformSchedules(int index, String scheName) {
		if (index >= 0) {
			schedules.remove(index);
			System.out.println("The schedule "+scheName+" has deleted.");
			return 1;
		}
		else {
			System.out.println("*The schedule has not been registered*");
			return -1;
		}
	}
	
	public void editSchedule() {
		System.out.print("Schedule Name:");
		String ScheName = input.next();
		for (int i = 0; i < schedules.size(); i++) {
			ScheduleInput schedule = schedules.get(i);
			if (schedule.getName().equals(ScheName)) {
				int num = -1;
				while (num!= 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
						case 1:
							schedule.setScheduleName(input);
							break;	
						case 2:
							schedule.setScheduleDate(input);
							break;
						case 3:
							schedule.setScheduleTime(input);
							break;
						case 4:
							schedule.setScheduleLocation(input);
							break;
						default:
							continue;
						}
					}//else
				}//while	
				break;
			} //if
		} //for
	
	public void viewSchedules() {
//		System.out.println("Schedule Name:");
//		String ScheName = input.next();
		for (int i = 0; i < schedules.size(); i++) {
			schedules.get(i).printInfo();
		}
	}
	
	public int size() {
		return schedules.size();
	}
	
	public ScheduleInput get(int index) {
		return (Schedule) schedules.get(index);
	}

	
	public void showEditMenu() {
		System.out.println("***Schedule Info Edit Menu***");
		System.out.println(" 1. Edit Schedule Name");
		System.out.println(" 2. Edit Schedule Date");
		System.out.println(" 3. Edit Schedule Time");
		System.out.println(" 4. Edit Schedule Location");
		System.out.println(" 5. Exit");
		System.out.println(" Select one number between 1-5:");
	}
}	