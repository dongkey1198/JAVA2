package chapter8_Question1;

public class Date {
	private int year;
	private int month;
	private int day;
	private boolean isValid; // default 값은 false이다.!!!
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public boolean isValid() {
		
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			if(day<0 ||day > 31) {
				isValid = false;
			}
			else {
				isValid = true;
			}
		case 2:
			if(day<0 || day > 29) {
				isValid = false;
			}
			else if(year%4 != 0) {
				if((year%100 == 0 || year%400 != 0) && day == 29) {
					isValid = false;
				}
			}
			else {
				isValid = true;
			}
		case 4: case 6: case 9: case 11:
			if(day <0 || day>30) {
				isValid = false;
			}
			else {
				isValid = true;
			}
		}
		
		return isValid;
	}

	public void showInfo() {
		System.out.println(year+"/"+month+"/"+day);
	}

}
