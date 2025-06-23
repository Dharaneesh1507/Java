package acc_prog;

import java.util.Scanner;

public class a3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println();
		int size=scan.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println();
			int temp=scan.nextInt();
			arr[i]=temp;
		}
		int fmin=arr[0];
		int smin=-1;
		for(int i=1;i<size;i++) {
			if(arr[i]<fmin) {
				smin=fmin;
				fmin=arr[i];
			}
			else if(arr[i]>fmin&&(smin==1||arr[i]<smin)) {
				smin=arr[i];
			}
		}
		if(smin==-1) {
			System.out.println();
		}
		else {
			System.out.println(smin);
		}
		scan.close();
	}
}
