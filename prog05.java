package acc_prog;

import java.util.Scanner;

public class prog05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		scan.close();
		for (int i = 0; i < num; i++) {
			for (int j = num-i; j >1; j--) {
				System.out.print(" ");
			}
			for (int j =0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
