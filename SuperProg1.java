package superkeyword;
class Person{
	String name;
	Person(String name){
		this.name=name;
	}
}
class Employee extends Person{
	Employee(String name){
		super(name);
	}
	void disp() {
		System.out.println(name);
	}
}
public class SuperProg1 {
	public static void main(String[] args) {
		Employee emp=new Employee("Dharaneesh");
		emp.disp();
	}
}
