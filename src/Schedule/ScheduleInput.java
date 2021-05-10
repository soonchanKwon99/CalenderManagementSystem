package Schedule;

import java.util.Scanner;

public interface ScheduleInput {

	public String getName();
	
	public void setName(String name);
	
	public void setDate(String date);
	
	public void setTime(int time);
	
	public void setLocation(String location);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
}
