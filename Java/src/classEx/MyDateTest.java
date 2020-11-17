package classEx;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate dmy = (MyDate)obj;
			if(this.day == dmy.day) {
				if(this.month == dmy.month) {
					if(this.year == dmy.year) {
						return true;
					}
				}
				else {
					return false;
				}
			}
			else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return day + month + year;
	}
	
}

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(10, 12, 2020);
		MyDate date2 = new MyDate(10, 12, 2020);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());s
	}

}
