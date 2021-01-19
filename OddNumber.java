package example;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter initial Number : ");
		int initialNo=sc.nextInt();
		System.out.println("");
		System.out.print("Enter Final Number : ");
		int finalNo=sc.nextInt();
		System.out.println("");
		System.out.println("List of even numbers between "+initialNo+" to "+finalNo);
		for(int i=initialNo;i<=finalNo;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}

	}

}
