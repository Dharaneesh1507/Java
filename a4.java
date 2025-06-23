package acc_prog;
import java.util.Scanner;

public class a4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println();
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
		scan.close();
	}
}
