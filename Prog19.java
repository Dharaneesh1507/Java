package prog;

import java.util.Scanner;

public class Prog19 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int [][]arr1= new int[m][n];
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		int a=scan.nextInt();
		int b=scan.nextInt();
		int [][]arr2= new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr2[i][j]=scan.nextInt();
			}
		}
		while((m==a) && (n==b)) {
			int [][]arr=new int[m][n];
			add(arr1,arr2,arr,m,n);
			tran(arr1,arr2,m,n);
			}
		System.out.println("The index is not equal");
	    scan.close();
	}
	public static void add(int arr1[][],int arr2[][],int arr[][],int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void tran(int arr1[][],int arr2[][],int m,int n) {
		int arrto[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arrto[i][j]=arr1[j][i]+arr2[j][i];
				System.out.print(arrto[i][j]+" ");
			}
			System.out.println();
		}
	}
}
