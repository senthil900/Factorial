package basictraining;
import java.util.*;

public class Factorial {
	public static void main(String args[]) {
		System.out.println("Enter a number :");
		Scanner s=new Scanner(System.in);
        int c=1;
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			c=c*i;
			
		}
		System.out.println(c);
	}

}
