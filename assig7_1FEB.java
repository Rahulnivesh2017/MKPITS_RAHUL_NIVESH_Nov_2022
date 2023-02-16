/*Write a Java program to convert from celsius degrees to Kelvin and
Fahrenheit. */
import java.util.Scanner;
class assig7_1FEB
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  temperature in Celsius");
		float tem=sc.nextFloat();
		float F=((tem*9)/5)+32;
		double K=tem+273.15;
		System.out.println("celsius degrees to Kelvin : "+K);
		System.out.println("celsius degrees to Fahrenheit : "+F);
	}
}