package acc_prog;

import java.util.Scanner;

public class prog5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		int count=1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(count<10) {
					System.out.print("0"+count+" ");
				}
				else {
					System.out.print(count + " ");}
				count++;
			}
			System.out.println();
			scan.close();
		}
	}
}
