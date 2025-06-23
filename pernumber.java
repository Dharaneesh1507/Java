package looping;
import java.util.Scanner;
public class pernumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		int a = 1;
		int sum = 0;
		while (a < num) {
			if (num % a == 0) {
				sum += a;
			}
			a++;
		}
		if (sum == num) {
			System.out.println(num + " is per number");
		} else
			System.out.println(num + " is not a per number");
		scan.close();
	}
}
