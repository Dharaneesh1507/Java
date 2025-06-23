package prog;

import java.util.*;

public class Prog10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int c=0;
		try {
			int a=scan.nextInt();
			int b=scan.nextInt();
			c=a/b;
		}
		catch(InputMismatchException d) {
			System.out.println("enter a correct value");
		}
		catch(ArithmeticException e) {
			System.out.println("Don't give the b as 0");
		}
		System.out.println(c);
		scan.close();

	}

}
