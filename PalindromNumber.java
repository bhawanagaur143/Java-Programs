package example;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp,rem,sum=0;
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("This is a palindrom number");
		}
		else {
			System.out.println("This is a not palindrom number");
		}

	}

}
