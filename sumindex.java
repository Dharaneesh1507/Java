package array;

import java.util.Scanner;

public class sumindex {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of the array:");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("Enter a element:");
		for(int index=0;index<a.length;index++) {
			a[index]=scan.nextInt();
		}
		int total=sum(a);
		System.out.println("Sum of the array:"+total);
		scan.close();
	}
		public static int sum(int a[]) {
			int num=0;
			for(int index=0;index<a.length;index++) {
				num=num+a[index];
			}
			return num;
	}
}
