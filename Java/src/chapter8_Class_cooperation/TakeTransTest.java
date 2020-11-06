package chapter8_Class_cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJ = new Student("James", 5000);
		Student studentP = new Student("Thomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		
		Taxi taxiA = new Taxi("28루 3507");
		
		studentJ.takeBus(bus100);
		studentP.takeSubway(subwayGreen);
		studentJ.takeTaxi(taxiA);
		
		studentJ.showInfo();
		studentP.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSyInfo();
		taxiA.showInfo();
	}

}
