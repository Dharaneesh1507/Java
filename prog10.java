package acc_prog;

import java.util.Scanner;

public class prog10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		int count=1;
		char letter='A';
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if(i%2!=0) {
				System.out.print(count + " ");
				count++;
				}
				else {
					System.out.print(letter + " ");
					letter++;
				}
			}
			System.out.println();
			scan.close();
		}
	}
}
