package example;
import java.util.Scanner;
public class NewPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No. of line you want to be printed: ");
		int n=sc.nextInt();
//		int no=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			   for(int j=1;j<=i;j++) {
//				   System.out.print(no+"  ");
//				   no+=1;
//			   }
//			System.out.println();
//		}
//		
//		
		System.out.println("*");
		for(int i=2;i<=n-1;i++) {
			System.out.print("* ");
			for(int j=1;j<=i-2;j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			System.out.println();
		}
		if(n>1) {
		   for(int i=1;i<=n;i++) {
			  System.out.print("* ");
		}
				
		}

	}

}
