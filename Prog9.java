package prog;
abstract class Vehicle{
	final void starEngine() {
		System.out.println("Engine started");
	}
	static String getVehicalType() {
		return "Generic Vehical";
	}
	abstract void drive();
}
class car extends Vehicle{
	void drive() {
		System.out.println("Drive a car");
	}
}
class bike extends Vehicle{
	void drive() {
		System.out.println("Drive a bike");
	}
}
public class Prog9 {
	public static void main(String[] args) {
		car c1=new car();
		c1.starEngine();
		c1.drive();
		System.out.println(Vehicle.getVehicalType());
		bike b1=new bike();
		b1.starEngine();
		b1.drive();
		System.out.println(Vehicle.getVehicalType());
	}

}
