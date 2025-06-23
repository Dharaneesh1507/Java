 package array;

import java.util.Scanner;

public class assorded {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a length of the array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter a element:");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Before sorting");
		print(a);
		ass(a);
		scan.close();
	}

	public static void ass(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting");
		print(a);
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
