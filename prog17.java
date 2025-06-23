package acc_prog;

import java.util.Scanner;

public class prog17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		for (int i = num; i >= 1; i--) {
			for (int s = 1; s <= num-i; s++) {
				System.out.print(" ");
			}
			for (int j = i;j <= 2*i-1;j++) {
				System.out.print("* ");
			}
			for (int j = 0;j <i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
			scan.close();
		}
	}
}
