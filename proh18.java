package acc_prog;

import java.util.Scanner;

public class proh18 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr a num:");
		int num=scan.nextInt();
		char letter='A';
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==j) {
					System.out.print(letter+" ");
					letter++;
				}
				else {
					System.out.print(i+j+" ");
				}
			}
			System.out.println(" ");
			scan.close();
		}
	}
}
