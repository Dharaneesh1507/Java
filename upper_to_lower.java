package if_else;
import java.util.Scanner;
public class upper_to_lower {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=scan.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println((char)(ch+32));
			scan.close();
		}
	}
}
