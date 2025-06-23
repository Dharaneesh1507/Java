package inheritance;

class Vehicle{
	String brand;
	int year;
	void startEngine() {
		System.out.println("Start");
	}
}
class Car extends Vehicle{
	String fualTypr;
	void startEngine() {
		System.out.println("Car engine starts");
	}
	void drive() {
		System.out.println("Car is driving");
	}
}
class Trunk extends Vehicle{
	int loadCapacity;
	void startEngine() {
		System.out.println("Truck engine stars");
	}
	void haul() {
		System.out.println("Trunk is hauling");
	}
}
public class In2 {
	public static void main(String[] args) {
		Vehicle z=new Vehicle();
		z.startEngine();
		Car a=new Car();
		a.brand="BMW";
		a.year=2022;
		a.fualTypr="petrol";
		a.startEngine();
		a.drive();
		Trunk b=new Trunk();
		b.brand="Tata";
		b.year=2020;
		b.loadCapacity=10;
		b.startEngine();
		b.haul();
	}
}
