package example;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No. of line you want to be printed: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			   for(int j=1;j<=n-i+1;j++) {
				   System.out.print("* ");
			   }
			System.out.println();
		}
		
		

	}

}
