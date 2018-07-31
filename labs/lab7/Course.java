package lab7;

public class Course {
	//Name
	//Credits
	//Number of seats
	//Roster of Students
	private String Name;
	private int Credits, Seats, RemainingSeats;
	private String[] rStudent  ;
	private double aveGPA;
	
	
	
	public Course(String name, int credits, int seats) {
		
		Name = ""+ name;
		Credits = credits;
		Seats = seats;
		RemainingSeats= Seats;
	
		rStudent= new String[Seats];
		
	}
	public String getName() {
		return Name;
	}
	

	
	
	public int getRemainingSeats() {
		return RemainingSeats;
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

	
	public boolean addStudent(Student n) {
		
		if(RemainingSeats==0) {
				return false;
			}	 
		
		rStudent[Seats- RemainingSeats]=n.getName();
		aveGPA= aveGPA+ n.getGPA(); 
		RemainingSeats= RemainingSeats-1;
		return true;
		
		
	}
	public double averageGPA() {
		return aveGPA/(Seats- RemainingSeats);
	}
	@Override
	
	public String toString() {
		return "Course [Name=" + Name + ", Credits=" + Credits + "]";
	}
	

	
	



}
