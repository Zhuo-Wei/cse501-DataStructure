import cse131.ArgsProcessor;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		System.out.println("Day     Type       amount     balance");
		double balance=4000.00;
		double amount=0.00;
	    for(int i=0;i<30;i++) {
	    	double x=Math.random();
	    	int day=i+1;
	    	if(x>0.5) {
				balance=balance+200.50;
				amount=200.50;
				
			}
			else { amount=100.00;
			balance= balance-100.00;
			}
			if(i<9) { 
				if(amount==200.50) {
						System.out.println(day+"     Deposit      $"+ amount+"     $"+balance);
				}     
				else System.out.println(day+"     Withdraw     $"+ amount+"     $"+balance);
			}
			else {
				if(amount==200.50) {
					System.out.println(day+"    Deposit      $"+ amount+"     $"+balance);
			}     
				else System.out.println(day+"    Withdraw     $"+ amount+"     $"+balance);
				
			}
	    }
          // Interest earned: 122.17
              //Money after one month\'s interest: 6230.67
	     double interest= balance*0.02;
	     balance= balance+ interest;
	     System.out.println("Interest earned: " + interest +"\n"
	     		+ "Money after one month\'s interest: "+ balance);
	     
	}

}
