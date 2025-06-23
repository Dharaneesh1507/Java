package looping;
import java.util.Scanner;
public class armstrong_num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		int count = 0;
		int temp = num;
		int temp1 = num;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			int pow = count;
			int prod = 1;
			while (pow > 0) {
				prod = prod * rem;
				pow--;
			}
			temp /= 10;
			sum += prod;
		}
		if (sum == temp1) {
			System.out.println(temp1 + " is a Armstrong number");
		} else {
			System.out.println(temp1 + ", Its is not a armstrong number");
		}
		scan.close();
	}
}