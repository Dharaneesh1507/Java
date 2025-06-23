package array;

import java.util.Scanner;

public class userarray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of the array:");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("Enter a element:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Output");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		scan.close();
	}
}
