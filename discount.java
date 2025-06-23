package if_else;
import java.util.Scanner;
public class discount {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a orginal price of the item:");
		double op=scan.nextDouble();
		price(op);
		scan.close();
	}
	public static void price(double dp) {
		if(dp>1000&&dp<3000) {
			double a=dp*0.1;
			double p=dp-a;
			System.out.println("The 10% discount price of the item:"+p);
		}
		else if(dp>=3000&&dp<6000) {
			double a=dp*0.2;
			double p=dp-a;
			System.out.println("The 20% discount price of the item:"+p);
		}
		else if(dp>=6000) {
			double a=dp*0.4;
			double p=dp-a;
			System.out.println("The 40% discount price of the item:"+p);
		}
		else {
			System.out.println("no discount"+dp);
		}
		
	}
}
