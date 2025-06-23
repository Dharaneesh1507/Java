package if_else;
import java.util.Scanner;
public class employe {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a salary:");
		int salary=scan.nextInt();
		System.out.println("Enter a year:");
		int year=scan.nextInt();
		if(salary<=10000) {
			double s=salary*0.2+salary*0.8+salary;
			System.out.println(s);
			if(year>3) {
				System.out.println(s+2500);
		}
			else {
				System.out.println("NO bonus");
			}
		}
		else if(salary<=20000) {
			double s=salary*0.25+salary*0.9+salary;
			System.out.println(s);
			if(year>3) {
				System.out.println(s+2500);
		}
			else {
				System.out.println("NO bonus");
			}
		}
		else if(salary>20000) {
			double s=salary*0.3+salary*0.95+salary;
			System.out.println(s);
			if(year>3) {
				System.out.println(s+2500);
		}
			else {
				System.out.println("NO bonus");
				
			}
		}
		scan.close();
	}
}
