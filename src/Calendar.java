
public class Calendar {
	String name;
	String date;
	int time;
	String location;
	
	public Calendar() {
	}
	
	public Calendar(String name) {
		this.name = name;
	}
	
	public Calendar(String name, String date, int time, String location) {
		this.name = name;
		this.date = date;
		this.time = time;
		this.location = location;
	}
	
	public void printInfo() {
		System.out.println("Name: " +this.name + "\nDate: " +this.date + "\nTime: " +this.time + "\nLocation: " +this.location);
	}
}