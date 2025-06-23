package array;

import java.util.Scanner;

public class gnpre {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of the array:");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("Enter a element:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter a num to find:");
		int find=scan.nextInt();
		fd(a,find);
		scan.close();
	}
	public static void fd(int []a,int find) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==find) {
				System.out.println(i);
				break;
			}	
		}
	}
}
