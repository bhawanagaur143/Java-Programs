package switchStatements;
import java.util.Scanner;
public class CalculatorUsingSwitchCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no. :");
		int a=sc.nextInt();
		System.out.println("Enter second no. :");
		int b=sc.nextInt();
		System.out.println("Enter the opertaion: ");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		int result =0;
		switch(operation) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("No operation found");
		}
	     System.out.println("Operation result: "+result);
		}

	}


