package inheritance;
class Animal0{
	String name;
	int age;
	void madeSound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog0 extends Animal0{
	String breed;
	void madeSound() {
		System.out.println("Dog barks");
	}
	void fetch() {
		System.out.println("Dog is fetching");
	}
}
class Cat0 extends Animal0{
	String color;
	void madeSound() {
		System.out.println("Meow...");
	}
	void climb() {
		System.out.println("Cat is climbing");
	}
}
public class In1 {
	public static void main(String[] args) {
		Dog0 dog0=new Dog0();
		dog0.name="Dob";
		dog0.age=10;
		dog0.breed="pom";
		dog0.madeSound();
		dog0.fetch();
		
		Cat0 d=new Cat0();
		d.name="tom";
		d.age=4;
		d.color="white";
		d.madeSound();
		d.climb();
	}
}
