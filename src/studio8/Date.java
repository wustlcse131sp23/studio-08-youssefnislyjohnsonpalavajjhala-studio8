package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;

	/*
	m = month of date
	d = day of date
	y = year of date
	h = true if date is holiday, false if not holiday
	 */
	public Date(int m, int d, int y, boolean h) {
		month = m;
		day = d;
		year = y;
		holiday = h;
	}
	
	public String toString() {
		if(holiday) {
			return month + "/" + day + "/" + year + " (holiday)";
		}
		else {
			return month + "/" + day + "/" + year;
		}
	}
	
    @Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
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
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
    	Date birthday = new Date(7, 6, 2004, false);
    	Date christmas = new Date(12, 25, 2023, true);
    	Date july6th = new Date(7, 6, 2004, false);
    	Date schoolEnd = new Date(5, 11, 2023, false);
    	Date july4th = new Date(7, 4, 1776, true);
    	System.out.println(birthday.equals(christmas));
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(birthday);
    	list.add(christmas);
    	list.add(july6th);
    	list.add(schoolEnd);
    	list.add(july4th);
    	System.out.println(list);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(birthday);
    	set.add(christmas);
    	set.add(july6th);
    	set.add(schoolEnd);
    	set.add(july4th);
    	System.out.println(set);
    }

}
