package looping;

import java.util.Scanner;

public class reversenum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=scan.nextInt();
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		scan.close();
	}
}