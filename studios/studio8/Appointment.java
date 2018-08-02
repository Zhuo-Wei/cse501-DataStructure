package studio8;

public class Appointment {
	private String name;
	private Date d;
    private Time t;
    
    
	
	public Appointment(String name, Date d, Time t) {
		super();
		this.name = name;
		this.d = d;
		this.t = t;
	}





	public Date getD() {
		return d;
	}





	public void setD(Date d) {
		this.d = d;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Time getT() {
		return t;
	}





	public void setT(Time t) {
		this.t = t;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
