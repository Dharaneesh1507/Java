package if_else;

import java.util.Scanner;

public class company_working {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a starting time:");
		double start=scan.nextInt();
		System.out.println("Enter a end time:");
		double end=scan.nextInt();
		if(start<=2&&end>=3) {
			System.out.println("Highly efficient");
		}
		else if(start<=3&&end>=4) {
			System.out.println("Improve speed");
		}
		else if(start<=4&&end>=5) {
			System.out.println("Training to improve speed");
		}
		else /*if(start<=5)*/{
			System.out.println("Leave the company");
		}
		scan.close();
	}
}
