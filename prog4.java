package prog;

import java.util.*;

public class prog4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b=sc.next();
		System.out.println(verify(b));
		sc.close();
	}
	public static boolean verify(String a) {
		if(a==null)return false;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(!(ch>='0'&&ch<='9'))return false;
			
			
		}
		return true;
	}
}
