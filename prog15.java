package acc_prog;

import java.util.Scanner;

public class prog15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		char letter='A';
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				
				if(j==i) {
					System.out.print(letter+ " ");
					letter++;
					}
				else if(i==1) {
					System.out.print(j+1+" ");
				}
				else {
					int k=j+2;
					System.out.print(k+" ");
				}
			}
			System.out.println();
			scan.close();
		}
	}
}
