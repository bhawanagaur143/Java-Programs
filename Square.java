package loop;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int power=1;
		for(int i=0;i<y;i++) {
			power*=x;
		}
		System.out.println(power);
		

	}

}
