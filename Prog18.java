package prog;

import java.util.Scanner;

public class Prog18 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		name=name.trim();
		String a[]=name.split("[ ]+");
		System.out.println(big(a));
		scan.close();
	}
	public static String big(String a[]) {
		String name="";
		for(int i=1;i<a.length;i++) {
			String na=a[i-1];
			if(na.length()<a[i].length()) {
				name=a[i];
			}
		}
		return name;
	}
}
