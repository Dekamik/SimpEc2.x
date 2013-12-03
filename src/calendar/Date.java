package calendar;

public class Date {
	
	private int year, month, day;
	private int[] numberOfDays;
	
	public Date(int year, int month, int day) {
		if (!isValid())
			throw new IllegalArgumentException();
		this.year = year;
		this.month = month;
		this.day = day;
		checkNumberOfDays();
	}
	
	private void checkNumberOfDays() {
		numberOfDays = new int[13];
		for (int i = 1; i < 12; i++) {
			if (i == 2) {
				if (!checkLeapYear()) {
					numberOfDays[i] = 28;
				}
				else {
					numberOfDays[i] = 29;
				}
			}
			else if (i % 2 == 1) {
				numberOfDays[i] = 31;
			}
			else {
				numberOfDays[i] = 30;
			}
		}
	}
	
	public boolean checkLeapYear() {
		if (year % 400 == 0)
			return true;
		else if (year % 100 == 0)
			return false;
		else if (year % 4 == 0)
			return true;
		else
			return false;
	}
	
	private boolean isValid() {
		if (month < 1 || month > 12 || day < 1)
			return false;
		if (month == 2) {
			if (checkLeapYear())
				if (day > 29)
					return false;
			else
				if (day > 28)
					return false;
		}
		else if (month % 2 == 1) {
			if (month <= 7)
				if (day > 31)
					return false;
			else
				if (day > 30)
					return false;
		}
		else {
			if (month <= 7)
				if (day > 30)
					return false;
			else
				if (day > 31)
					return false;
		}
		return true;
	}
	
	public void gotoTomorrow() {
		day++;
		if(!isValid()) {
			month++;
			day = 1;
			if (!isValid()) {
				year++;
				month = 1;
				checkNumberOfDays();
				day = 1;
			}
		}
	}
	
	public void gotoYesterday() {
		day--;
		if(!isValid()) {
			month--;
			day = numberOfDays[month];
			if (!isValid()) {
				year--;
				month = 12;
				checkNumberOfDays();
				day = numberOfDays[month];
			}
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String toString() {
		return year + "-" + month + "-" + day;
	}
}