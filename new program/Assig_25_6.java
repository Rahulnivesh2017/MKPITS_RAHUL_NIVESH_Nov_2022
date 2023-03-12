/*Write a Java  program to print on screen the output of adding,
subtracting, multiplying and dividing of two numbers which will
be entered by the user. */

import java.util.Scanner;
class Assig_25_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2=sc.nextInt();
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
}


