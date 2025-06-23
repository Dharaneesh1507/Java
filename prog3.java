package prog;

import java.util.*;

public class prog3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];	
		}
		sum=sum/size;
		for(int i=0;i<a.length;i++) {
			if(a[i]<sum) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
