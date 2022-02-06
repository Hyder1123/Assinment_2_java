package Assignment2;
import java.util.Scanner;

public class SumOfDigiteOf3num {

	public static void main(String[] args) {
		int f1,f2,sum=0;
		// TODO Auto-generated method stub.
		Scanner s =new Scanner(System.in);
		System.out.print("enter the 3 digite number :" );
		int n=s.nextInt();
		f1=n/100;
		n=n%100;
		f2=n/10;
		n=n%10;
		sum=f1+f2+n;
		System.out.println("sum of three digits are : " +sum);
		
		

	}

}
