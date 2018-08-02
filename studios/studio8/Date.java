package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	private final int month;
	private final int day;
	private final int year;
	private final boolean holiday;
	

	public Date(int month, int day, int year, boolean holiday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}

	



	public boolean isHoliday() {
		return holiday;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + (holiday ? 1231 : 1237);
		result = prime * result + month;
		result = prime * result + year;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (holiday != other.holiday)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + "]";
	}





	public static void main(String[] args) {

		System.out.println(new Date(7,4,2017,true));
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(0, new Date(4,4,2018,false));
		list.add(1, new Date(8,1,2018,false));
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(new Date(7,30,2018,true));
		set.add(new Date(6,5,2011, false));
		set.add(new Date(6,5,2011, false));
		System.out.println(set);
	}

}
