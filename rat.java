package acc_prog;
import java.util.Scanner;
public class rat {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Size:");
		int size=scan.nextInt();
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println();
			arr[i]=scan.nextInt();
		}
		int find=14;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>=find) {
				System.out.println(i+1);
				break;
			}
		}
		scan.close();
	}

}
