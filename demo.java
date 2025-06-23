package shadow;

public class demo {
	public static void main(String[] args) {
		parent Parent=new child();
		child Child=(child) Parent;
		System.out.println(Child.i);
	}
}
