package example;
import java.util.*;
public class cbsePercentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("marks of One subject : ");
		int tm=sc.nextInt();
		System.out.print("Marks in Mathematics : ");
		int m=sc.nextInt();
		System.out.print("Marks in Chemistry : ");
		int c=sc.nextInt();
		System.out.print("Marks in Physics : ");
		int p=sc.nextInt();
		System.out.print("Marks in English : ");
		int e=sc.nextInt();
		System.out.print("Marks in Physical Education/ Music : ");
		int pm=sc.nextInt();
		int totalMarks=m+c+p+e+pm;
		System.out.println("Total marks obtain by student in all subjects : "+totalMarks);
		int overallMarks=tm*5;
		System.out.println("Overall Marks of 5 subjects : "+overallMarks);		
		float percentage = (totalMarks/500)*100;
		System.out.println("Percentage of Student : "+percentage+" %");
		

	}

}
