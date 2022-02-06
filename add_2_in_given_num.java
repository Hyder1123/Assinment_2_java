package Assignment2;
import java.util.Scanner;

public class add_2_in_given_num {

	public static void main(String[] args) {
		int f1,f2,f3,f4;
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("enetr a four digite number : ");
		int n=s.nextInt();
		f1=n/1000;
		n=n%1000;
		f2=n/100;
		n=n%100;
		f3=n/10;
		f4=n%10;
		
		System.out.println(+ (f1+2)*1000+(f2+2)*100 +(f3+2)*10+(f4+2));
		
		
		

	}

}
