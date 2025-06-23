package prog;
import java.util.*;
public class Prog12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Lower(L)/Upper(U):");
		String ch=sc.next();
		if(ch.equals("L"))System.out.println(toLower(s));
		else if(ch.equals("U"))System.out.println(toUpper(s));
		else System.out.println("Enter correct letter");
		sc.close();
		
	}
	public static String toLower(String str) {
		if(str==null||str.length()<1) return null;
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch+=32;
				res+=ch;
			}
			else
				res+=ch;
		}
		return res;
	}
	public static String toUpper(String str) {
		if(str==null||str.length()<1) return null;
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				ch-=32;
				res+=ch;
			}
			else
				res+=ch;
		}
		return res;
	}
}
