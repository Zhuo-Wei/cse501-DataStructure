package studio8;



public class Time {
	
	private final int hour;
	private final int minute;
	
	
	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}


	public int getHour() {
		return hour;
	}


	public int getMinute() {
		return minute;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}
	


	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + "]"+ " This is 24 hours format";
	}


	public static void main(String[] args) {
		System.out.println(new Time(4,33));
		 
		
	}

}
