package Assignment2;
import java.util.Scanner;

public class fatoial_continue {

	public static void main(String[] args) {
		int i=1,fact=1;
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		//System.out.print("if you want to continue enter 'yes' :"  );
		//String str =s.nextLine();
		System.out.print("enter a number :");
		int n=s.nextInt();
		do {
			 
				fact=fact*i;
				 i++;
			 
			
		}while(i<=n);
		System.out.print("factorial of a number is :" +fact);
		System.exit(1);

	}

}
