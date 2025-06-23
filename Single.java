package inheritance;
class Animal{
	void eat() {
		System.out.println("The animal eats");
	}
}
class Dog extends Animal{
	void barks() {
		System.out.println("The dog barks");
	}
}
public class Single {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.barks();
	}
}
