package array;

import java.util.Scanner;

public class maxelement {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of the array:");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("Enter a element:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int maxi =max(a);
		System.out.println("Min element:"+maxi);
		scan.close();
	}
	public static int max(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
}
