package studio8;

import java.util.LinkedList;

public class Calender {
	
    private LinkedList<Appointment> list= new LinkedList<Appointment>();
    
    
	
	public Calender(LinkedList<Appointment> list) {
		
		this.list = list;
	}
	
	public void addAppointment(Appointment a) {
		list.add(a);

	}
	
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
