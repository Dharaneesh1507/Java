package prog;
class Person{
	public String name;
	protected int age;
	private String ssnumber;
	String address;
	Person(String name,int age,String ssn,String address){
		this.name=name;
		this.age=age;
		this.ssnumber=ssn;
		this.address=address;
	}
}
class Employee extends Person{
	Employee(String name,int age,String ssn,String address){
		super(name,age,ssn,address);
		System.out.println("Hello Employee");
	}
	
}
public class Prog5 {
	public static void main(String[] args) {
		Employee e1=new Employee("Dharaneesh",20,"EC595","Chennai");
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.address);
	}
}
