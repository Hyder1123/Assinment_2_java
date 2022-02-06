package Assignment2;
import java.util.Scanner;

public class ReverseOfThreedigite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1,f2;
		Scanner s =new Scanner(System.in);
		System.out.print("enter a Three digite numbe : ");
		int n=s.nextInt();
		f1=n%10;//123-3
		n=n/10;//12
		f2=n%10;//2
		n=n/10;//1
		System.out.print(+ f1 + " " + f2 + " " +n);
		

	}

}
