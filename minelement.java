package array;
import java.util.Scanner;
public class minelement {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of the array:");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("Enter a element:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int mine =min(a);
		System.out.println("Min element:"+mine);
		scan.close();
	}
	public static int min(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
}