package prog;

import java.util.*;

public class Prog15 {
	public static void rc(String a[], int num) {
		for(int i=0;i<num;i++) {
			String name=a[i];
			int count=0;
			for(int j=0;j<name.length();j++) {
				char ch=name.charAt(j);
				if(ch>='A'&&ch<='Z') {
					count++;
					}
				}
			if(count==name.length()) { 			
				System.out.println(name);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		String a[]=new String[num];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.next();
		}
		rc(a,num);
		scan.close();
	}
}
