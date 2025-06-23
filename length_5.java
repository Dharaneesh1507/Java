package looping;

import java.util.Scanner;

public class length_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int rev = 0;
		int count = 0;
		int temp = 5;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
			if (temp == rem) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}
