package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Log.EventLogger;
import gui.WindowFrame;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt"); 
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		CalendarManager calendarManager = getObject("calendarmanager.ser");
		if (calendarManager == null) {
			calendarManager = new CalendarManager(input);
		}

		WindowFrame frame = new WindowFrame(calendarManager);
		selectMenu(input, calendarManager);
		putObject(calendarManager, "calendarmanager.ser");
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
					logger.log("add a Schedule");
					break;
				case 2:
					calendarManager.delSchedule();
					logger.log("delete a Schedule");
					break;
				case 3:
					calendarManager.editSchedule();
					logger.log("edit a Schedule");
					break;
				case 4:
					calendarManager.viewSchedules();
					logger.log("view a list of Schedule");
					break;
				case 5:
					System.out.println("Exit the Program");
					break;
				default:
					continue;
				}	
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
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
	
	public static CalendarManager getObject(String filename) {
		CalendarManager calendarManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			calendarManager = (CalendarManager) in.readObject();

			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return calendarManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return calendarManager;
		
	}
	
	public static void putObject(CalendarManager calendarManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(calendarManager);

			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}
}