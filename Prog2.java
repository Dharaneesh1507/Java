package methods;

public class Prog2 {
	public static void main(String[] args) {
		System.out.println(spChar('@'));
	}
	public static String spChar(char ch) {
		return ('A'>=ch && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9')? "Special Char":"Not a Special char";
		
	}
}
