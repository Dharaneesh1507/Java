package acc_prog;

import java.util.Scanner;

public class prog13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(i>=j) {
				System.out.print(i + " ");}
			}
			System.out.println();
			scan.close();
		}
	}
}
