package looping;
import java.util.Scanner;
public class primenum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+", It is a prime number");
		}
		else {
			System.out.println(num+", It is not a prime number");
		}
		scan.close();
	}
}