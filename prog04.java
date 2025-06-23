package acc_prog;

import java.util.Scanner;

public class prog04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		tri(num);
		scan.close();
	}
	public static void tri(int num) {
		for (int i = 1; i < num ; i++) {
			for (int j = 1; j <= 2 * num ; j++) {
				if(j>2*num-i|| i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = num;i>=1 ; i--) {
			for (int j = 1; j <= 2 * num ; j++) {
				if(i>=j||j>2*num-i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
