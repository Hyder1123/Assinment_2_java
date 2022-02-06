package Assignment2;
import java.util.Scanner;
public class ConvertFahrenheitCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("enter the  Fahrenheit :");
		float f=s.nextFloat();
		float celsius=(f-32)*5/9;
		System.out.println("  Fahrenheit into Celsius is : " +celsius);

	}

}
