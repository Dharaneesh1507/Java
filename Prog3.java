package methods;

public class Prog3 {
	public static void main(String[] args) {
		System.out.println(mul(8));
		System.out.println(mul(17));
	}
	public static String mul(int a) {
		return (a%4==0)?"Mul of 4":"Not a Mul of 4";
	}

}
