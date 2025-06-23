package acc_prog;

import java.util.Scanner;

public class prog12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		int count=1;
		int k=0;
		for (int i = 1; i <= num; i++,k=0) {
			for (int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			while(k!=2*i-1) {
				System.out.print(count+" ");
				count++;
				k++;
			}
			System.out.println();
			scan.close();
		}
	}
}
