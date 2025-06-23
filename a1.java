package acc_prog;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double []week=new double[7];
		for(int i=0;i<7;i++) {
			System.out.println();
			double temp=scan.nextDouble();
			week[i]=temp;
		}
		double ht=week[0];
		int dht=1;
		for(int i=1;i<7;i++) {
			if(week[i]>ht) {
				ht=week[i];
				dht=i+1;
			}
		}
		System.out.println(dht);
		scan.close();
	}
}
