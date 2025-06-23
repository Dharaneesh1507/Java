package inheritance;
class grandfather {
	void Land1() {
		System.out.println("Land1");
	}
}
class father extends grandfather{
	void Land2() {
		System.out.println("Land2");
	}
}
class dhar extends father{
	void Land3() {
		System.out.println("Land3");
	}
}
public class Multi {
	public static void main(String[] args) {
		dhar a=new dhar();
		a.Land3();
		a.Land2();
		a.Land1();
	}
}
