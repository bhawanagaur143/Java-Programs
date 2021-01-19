package array;
import java.util.Scanner;
public class AverageMarkesOfStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students: ");
		int n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter the markes now: ");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			
		}
		int avgMarks=0;
		for(int i=0;i<n;i++) {
			avgMarks +=marks[i];
		}
		avgMarks/=n;
		System.out.println("The avg markes are :"+avgMarks);

	}

}
