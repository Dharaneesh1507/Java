package prog;

import java.util.Scanner;

public class Prog17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		name=name.trim();
		String a[]=name.split("[ ]+");
		rev(a);
		scan.close();
	}
	public static void rev(String a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
