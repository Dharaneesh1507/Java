package inheritance;
class Animal2{
	void eat() {
		System.out.println("The animal eats");
	}
}
class Dog2 extends Animal2{
	void barks() {
		System.out.println("The dog barks");
	}
}
class Puppy extends Dog2{
	void puppy() {
		System.out.println("I am puppy");
	}
}
class Cat1 extends Animal2{
	void cat() {
		System.out.println("I am cat");
	}
}
public class Hybrid {
	public static void main(String[] args) {
		Puppy a=new Puppy();
		a.barks();
		a.eat();
		Cat1 b=new Cat1();
		b.cat();
		b.eat();
		
	}
}
