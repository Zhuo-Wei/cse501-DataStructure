package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
	int s1 = ap.nextInt("What is the speed limit?");
	int	s0 = s1 +10;	
	int s2 = ap.nextInt("What is the actual speed ?");
    int s3 = s2- s1;
	int s4 = (s3 > 0) ? s3 : 0;
	int f0 = 50 + (s2- s0)* 10 ;
	
	int f = (s2 > s0) ? f0 : 0;
	//You reported a speed of 85 MPH for a speed limit of 60 MPH. 
	//You went 25 MPH over the speed limit. Your fine is $200. 
	System.out.println("You reported a speed of "+ s2 +" MPH for a speed limit of " +s1 +" MPH\n"
	+ "You went "+ s4 +" MPH over the speed limit. Your fine is $" +f		);
	
	}

}
