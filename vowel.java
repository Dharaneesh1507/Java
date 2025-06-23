package if_else;
import java.util.Scanner;
public class vowel {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=scan.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch+" is a vowel");
		}
		else {
			System.out.println(ch+" is a consentants");
		}
		scan.close();
	}
}
