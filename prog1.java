package prog;
import java.util.Scanner;
public class prog1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a size of a array: ");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("Enter a element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		temp(a);
		scan.close();

	}
	public static void temp(int a[]) {
		for(int i=1;i<a.length;i++) {
			if((a[i])>=a[i-1]+5) {
				System.out.println("Day "+i);}
			
			else {
				System.out.println("Day "+i+" false");
			}
		}
	}
}
