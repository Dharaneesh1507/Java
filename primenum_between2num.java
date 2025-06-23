package looping;

import java.util.Scanner;

public class primenum_between2num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a from range");
		int from_range = scan.nextInt();
		System.out.println("Enter a end range");
		int end_range=scan.nextInt();
		for (  ; end_range >= from_range;from_range++) {
			int count = 0;
			for (int i = 1; i <= end_range; i++) {
				if (from_range % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(from_range);
			}
			scan.close();
		}
	}
}

