package prog;
import java.util.*;
public class Prog11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int err=0;
		int c=0;
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			c=a/b;
		}
		catch(InputMismatchException d) {
			System.out.println("enter a correct value");
		}
		catch(Exception e){
			err=1;
		}
		finally {
			if(err==1) System.out.println("Error");
			else System.out.println("No Error , The output is "+c);
		}	
		sc.close(); 
	}
}
