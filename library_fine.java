package if_else;
import java.util.Scanner;
public class library_fine {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a days:");
		int days=scan.nextInt();
		fine(days);
		scan.close();
	}
	public static void fine(int a) {
		if(a>0&&a<=5) {
			System.out.println("Your fine to pay is 50 paise");
		}
		else if(a>5&&a<=10) {
			System.out.println("Your fine to pay is one Rupee");
		}
		else if(a>10&&a<=30) {
			System.out.println("Your fine to pay is 5 Rupee");
		}
		else if(a>30) {
			System.out.println("Your membership is cancelled for late return");
		}
		else{
			System.out.println("No fine");
		}
	}
}
