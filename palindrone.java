package looping;

import java.util.Scanner;

public class palindrone {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		int temp=rev;
		if(temp==rev) {
			System.out.println("Yes, It is a palindrome");
		}
		else
			System.out.println("No, It is not a palindrome");
		scan.close();
	}
	
}
