package array;

import java.util.Scanner;

public class findenteredno {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("size:");
		int size=scan.nextInt();
		int []a=new int[size];
		for (int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("ta:");
		int target=scan.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]+a[j]==target) {
					count++;
				}
			}
		}
		System.out.println(count);
		scan.close();
	}
}
