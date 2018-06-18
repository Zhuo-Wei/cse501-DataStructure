package arrays;
import cse131.ArgsProcessor;

public class Birthday {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);	
	int N = ap.nextInt("How many people?");
	int[][]cal= new int[12][31];
			for(int i= 0; i<N; i++) {
				int m =(int)(Math.random()*12);
				int d =(int)(Math.random()*31);
			    cal[m][d]=cal[m][d]+ 1;    
			}
	int sum=0;
	double f = 1.0;
	for(int i=0;i<12;i++) {
		sum=0;
		for(int j=0;j<31;j++) {
			sum = cal[i][j] +sum;
			f=(double)sum/(double)N;
		}
	    int m=i+1;
	    if(m==1) {
	    	System.out.println(f +" persent people born in the "+ m+"st month. ");}
	    else 
	    	if(m==2) {
	    		System.out.println(f +" persent people born in the "+ m+"nd month. ");
	    	}
	    	else
	    		if (m==3) {
	    			System.out.println(f +" persent people born in the "+ m+"rd month. ");
	    		}
	    		else System.out.println(f +" persent people born in the "+ m+"th month. ");
	    		
	}
	//
	double averageM= Math.round(1.0/12.0*1000d)/1000d;
	System.out.println("the average of the 12 fraction values is "+averageM);
	//
	
	int[][] calD=new int[31][12];
	for(int a=0; a<31;a++) {
		for(int b=0;b<12;b++) {
			calD[a][b]=cal[b][a];
		}
	}
	for(int a=0; a<31;a++) {
		sum=0;
		for(int b=0;b<12;b++) {
			sum = calD[a][b] +sum;
			f=(double)sum/(double)N;
		}
	    int d=a+1;
	    if(d==1||d==21||d==31) {
	    	System.out.println(f +" persent people born in the "+ d+"st day. ");}
	    else 
	    	if(d==2||d==22) {
	    		System.out.println(f +" persent people born in the "+ d+"nd day. ");
	    	}
	    	else
	    		if (d==3||d==13||d==23) {
	    			System.out.println(f +" persent people born in the "+ d+"rd day. ");
	    		}
	    		else System.out.println(f +" persent people born in the "+ d+"th day. ");
	}
	//
	double averageD= Math.round(1.0/31.0*1000d) /1000d;
	System.out.println("the average of the 31 fraction values is "+averageD);
	
	////
	for(int i=0;i<12;i++) {
		for(int j=0;j<31;j++) {
			if (j>0&&i>0) {
				if (cal[i][j]<=cal[i][j-1]) {
					cal[i][j]=cal[i][j-1];
				}
				else 
					if (cal[i][j]<=cal[i-1][j]) {
						cal[i][j]=cal[i-1][j];
					}
					else cal[i][j]=cal[i][j];
			}
		}
	}
	int x=cal[11][30];
	System.out.println(x);	
		
	
	
	}

	}
