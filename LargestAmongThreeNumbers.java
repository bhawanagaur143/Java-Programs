package example;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		System.out.println("Three numbers are : "+n1+" "+n2+" "+n3);
		if(n1>n2 && n1>n3) {
			System.out.println("Largest no. is : "+n1);
		}
		else if(n2>n1 && n2>n3){
			System.out.println("Largest no. is : "+n2);
		}
		else {
			System.out.println("Largest no. is : "+n3);
		}

	}

}
