package looping;
import java.util.Scanner;
public class length {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=scan.nextInt();
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Length of the num:"+count);
		scan.close();
	}
}
