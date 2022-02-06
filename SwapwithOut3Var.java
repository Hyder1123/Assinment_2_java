package Assignment2;
import java.util.Scanner;

public class SwapwithOut3Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter a value for a : ");
		int a=s.nextInt();
		System.out.print("enter a value for b : ");
		int b=s.nextInt();
		//int a=6;
		//int b=8;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is : " +a + " b is : " +b);

	}

}
