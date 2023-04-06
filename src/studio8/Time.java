package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean format;
	
	/*
	h = hour of time
	m = minute of time
	f = true if 24-hour format, false if 12-hour format
	 */
	public Time (int h, int m, boolean f) {
		hour = h;
		minute = m;
		format = f;
	}
	
	public String toString() {
		if(format) {
			return (hour % 12) + ":" + minute;
		}
		else {
			return hour + ":" + minute;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(format, hour, minute);
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
		return format == other.format && hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time alarm = new Time(7, 45, true);
		Time deadline = new Time(20, 00, false);
		Time event = new Time(20, 00, false);
		System.out.println(deadline.equals(event));
    }

}