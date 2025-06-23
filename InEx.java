package inheritance;
class dad{
	int a=1000;
}
class son extends dad{
	int my_salary=1001;
}
public class InEx {
	public static void main(String[] args) {
		son d1=new son();
		System.out.println(d1.a);
		System.out.println(d1.my_salary);
	}
}
