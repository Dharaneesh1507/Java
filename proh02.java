package acc_prog;

import java.util.Scanner;

public class proh02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		tri(num);
		scan.close();
	}
	public static void tri(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 2 * num - 1; j++) {
				if (i>=j||i+j>=num*2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
