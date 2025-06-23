package prog;
abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	abstract void makesound();
}
class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	void makesound(){
		System.out.println("i am dog");
	}
}
class Cat extends Animal{
	Cat(String name){
		super(name);
		
	}
	void makesound() {
		System.out.println("i am cat");
	}
}

public class Prog8 {
	public static void main(String[] args) {
		Dog dog=new Dog("boby");
		Cat cat=new Cat("pona");
		dog.makesound();
		System.out.println(dog.name);
		cat.makesound();
		System.out.println(cat.name);
	}
}
