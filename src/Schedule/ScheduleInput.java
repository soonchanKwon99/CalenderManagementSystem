package Schedule;

import java.util.Scanner;

import Exceptions.DateFormatException;

public interface ScheduleInput {

	public String getName();
	
	public void setName(String name);
	
	public void setDate(String date) throws DateFormatException;
	   
	public void setTime(int time);
	 
	public void setLocation(String location);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setScheduleName(Scanner input);
	
	public void setScheduleDate(Scanner input);
	
	public void setScheduleTime(Scanner input);
	
	public void setScheduleLocation(Scanner input);
}
