package looping;

import java.util.Scanner;

public class sum_of_30prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int range = scan.nextInt();
		int sum = 0;
		for (int j = 1; range >= j; j++) {
			int count = 0;
			for (int i = 1; i <= range; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(j);
				sum += j;
			}
			scan.close();
		}
		System.out.println("Sum to prime num:"+sum);
	}
}
