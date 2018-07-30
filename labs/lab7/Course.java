package lab7;

public class Course {
	//Name
	//Credits
	//Number of seats
	//Roster of Students
	private String Name;
	private int Credits, Seats, RemainingSeats, sNumber;
	private String[] rStudent= new String[Seats] ;
	
	
	
	public Course(String name, int credits, int seats) {
		
		Name = ""+ name;
		Credits = credits;
		Seats = seats;
		RemainingSeats= Seats-sNumber;
		sNumber=0;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String[] getrStudent() {
		return rStudent;
	}
	public void setrStudent(String[] rStudent) {
		this.rStudent = rStudent;
	}

	
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int credits) {
		Credits = credits;
	}
	public int getSeats() {
		return Seats;
	}
	public void setSeats(int seats) {
		Seats = seats;
	}
	
	
	public int getRemainingSeats() {
		return RemainingSeats;
	}
	public void setRemainingSeats(int remainingSeats) {
		RemainingSeats = remainingSeats;
	}
	
	public boolean addStudent(Student n) {
		for(int i=0; i<sNumber; i++) {
			if(rStudent[i]==n.getName()) {
				return false;
			}	 
		}
		
		rStudent[sNumber]=n.getName();
		sNumber=sNumber +1;
		RemainingSeats= RemainingSeats-1;
		return true;
		
		
	}
	public double averageGPA() {
		double sum=0;
		if(int i=0;i< this.getSeats(); i ++) {
			sum= sum+ 
		}
	}
	



}
