package if_else;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = scan.nextInt();
		leap(year);
		scan.close();
	}

	public static void leap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " is a leap year");
			return;
		}
		System.out.println("Not a leap year");
	}
}
