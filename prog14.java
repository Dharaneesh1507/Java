package acc_prog;

import java.util.Scanner;

public class prog14 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==3||j==3) {  
					System.out.print("*");}
				if(i==3&&j==3) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");}
			}
			System.out.println();
		}
		scan.close();
	}
}
