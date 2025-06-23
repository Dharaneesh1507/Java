package array;

import java.util.Scanner;

public class swap2element {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of the array:");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("Enter a element:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		print(a);
		System.out.println("");
		swap(a,1,2);
		print(a);
		scan.close();
	}
	public static int [] swap(int []a,int i1,int i2) {
		int temp=a[i1];
		a[i1]=a[i2];
		a[i2]=temp;
		return a;
	}
	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
