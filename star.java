package looping;

import java.util.Scanner;

public class star {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				//if(i>=j) {
				if(i+j<=num+1) {
				//if(i<=j) {
				//if(i+j>=num+1) {
				//if(i==1||j==1||i==5||j==5) {   //square
				//if(i+j==num+1||i==j) {	     //x
				//if(i==3||j==3) {               //+
				//if(i==1||i==num||j==num/2) {   //I
					System.out.print("*");}
				else {
					System.out.print(" ");}
			}
			System.out.println();
		}
		scan.close();
	}
}
