package Assignment2;
import java.util.Scanner;
public class AddFirstForthdigite {

	public static void main(String[] args) {
		int f1=0,f2,f3,f4=0,f5,rem,sum=0;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter a 5 digite number :");
		int n=s.nextInt();
		
			 f1=n/10000;
		     rem=n%10000;
		     f2=rem/1000;
		     rem=rem%1000;
		     f3=rem/100;
		     rem=rem%100;
		     f4=rem/10;
		     rem=rem%10;
		
	     sum=f1+f4;

	     System.out.println(" sum of 1st and 4th digite of given num is :" +sum);
		
			

	}

}
