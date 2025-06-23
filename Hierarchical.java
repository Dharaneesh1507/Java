package inheritance;
class Animal1{
	void eat() {
		System.out.println("The animal eats");
	}
}
class Dog1 extends Animal1{
	void barks() {
		System.out.println("The dog barks");
	}
}
class Cat extends Animal1{
	void cat() {
		System.out.println("I am cat");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		Cat cats=new Cat();
		dog.eat();
		dog.barks();
		cats.eat();
		cats.cat();
	}
}
