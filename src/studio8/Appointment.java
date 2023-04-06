package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date d, Time t) {
		date = d;
		time = t;
	}

	public String toString() {
		return date + " @ " + time;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	public static void main(String[] args) {
		Date birthday = new Date(7, 6, 2004, false);
    	Date christmas = new Date(12, 25, 2023, true);
    	Date july6th = new Date(7, 6, 2004, false);
    	Date schoolEnd = new Date(5, 11, 2023, false);
    	Date july4th = new Date(7, 4, 1776, true);
    	Time alarm = new Time(7, 45, true);
		Time deadline = new Time(20, 00, false);
		Time event = new Time(20, 00, false);
		Appointment test = new Appointment(birthday, alarm);
		Appointment test2 = new Appointment(christmas, event);
		Appointment test3 = new Appointment(schoolEnd, deadline);
		Appointment test4 = new Appointment(july4th, event);
		Appointment test5 = new Appointment(july4th, deadline);
		HashSet<Appointment> set = new HashSet<Appointment>();
    	set.add(test);
    	set.add(test2);
    	set.add(test3);
    	set.add(test4);
    	set.add(test5);
    	System.out.println(set);
	}
}
