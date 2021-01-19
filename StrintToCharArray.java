package example;

import java.util.Scanner;

public class StrintToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string=sc.nextLine();
		char[] stringArray;
		stringArray=string.toCharArray();
		for(int i=0;i<=stringArray.length;i++) {
			char c=stringArray[i];
			System.out.print(c+" ");
		}


	}

}
