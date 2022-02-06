package Assignment2;
import java.util.Scanner;

public class power_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter the base value :");
		int b=s.nextInt();
		System.out.print("enter the exponent value :");
		int e=s.nextInt();
		System.out.println(Math.pow(b, e));
		//System.out.println(Math.pow(7, 5));

	}

}
