package looping;

import java.util.Scanner;

public class persquare {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=scan.nextInt();
		int i=1;
		while(i*i<num) {
			i++;
		}
		if(i*i==num) {
		System.out.println(num +" is the per square");
		}
		else {
			System.out.println("Not a per square");
		}
		scan.close();
	}
	
}
