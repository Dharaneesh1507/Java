package looping;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=scan.nextInt();
		int temp=num;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		int pow = count/2;
		int val = 10;
		int prod=1;
		while (pow>0) {
			prod = prod * val;
			pow--;
					
		}
		int last =temp%prod;
		temp/=prod;
		String res= last + ""+temp;
		System.out.println(res);
		scan.close();
	}
}


