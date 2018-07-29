package lab7;

public class Student {
	
		// Name (first and last)
	    //Student ID
	    //Credits
	    //GPA
		private String fName,sName;
		private int StudentID,Credits;
		private double GPA;
		
		
		
        public Student(String fName, String sName, int studentID) {
			super();
			this.fName = fName;
			this.sName = sName;
			StudentID = studentID;
			Credits=0;
			GPA=0.00;
					
		}

		public String getName() {
			return fName+sName;
		}

		

		public double getGPA() {
			return GPA;
		}

		public void setGPA(double gPA) {
			GPA = gPA;
		}

		public int getCredits() {
			return Credits;
		}

		public void setCredits(int credits) {
			Credits = credits;
		}

		public double submitGrade(double grade, int gCredit) {
			double qs= this.getGPA()* this.getCredits();
			this.Credits=this.Credits+gCredit;
			this.GPA=Math.round(( qs+ grade*gCredit)/this.Credits*1000d)/1000d;
        	return this.GPA;
        }
		public String getClassStanding() {
			if (Credits<30) {
				return "Freshman";
			}
			else {
				if (Credits<60) {
					return "Sophomore";
				}
				else {
					if(Credits<90) {
						return "Junior";
					}
					else return "Senior";
				}
			}
		
		}





		public static void main(String[] args) {
	}

}
