package acc_prog;

import java.util.Scanner;

public class a2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println();
		int num=scan.nextInt();
		int sq=num*num;
		int sumof=0;
		while(sq>0) {
			sumof+=sq%10;
			sq/=10;
		}
		if(sumof==num) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		scan.close();
	}

}
