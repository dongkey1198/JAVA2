package car_Abstract_Practice;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void carWash() {}
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		carWash();
	}
}
