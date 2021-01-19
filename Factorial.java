package example;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Fact(n);

	}
	static int Fact(int num) {
		int Fact=1;
		for(int i=1;i<=num;i++) {
			Fact=Fact*i;
		}
		System.out.println(Fact);
		return Fact;
	}


}
