package prog;

import java.util.*;

public class Prog16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String a[] = new String[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.next();
		}
		String[] b1 = pal(a);
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		scan.close();
	}

	public static String[] pal(String a[]) {
		int c = co(a);
		String b[] = new String[c];
		int z = 0;
		for (int i = 0; i < a.length; i++) {
			String rec = a[i];
			String name = "";
			for (int j = rec.length() - 1; j >= 0; j--) {
				char ch = rec.charAt(j);
				name += ch;
			}
			if (name.equals(a[i])) {
					b[z++] = a[i];
			}
		}
		return b;
	}

	public static int co(String a[]) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			String rec = a[i];
			String name = "";
			for (int j = rec.length() - 1; j >= 0; j--) {
				char ch = rec.charAt(j);
				name += ch;
			}
			if (name.equals(a[i])) {
				c++;
			}
		}
		return c;
	}
}