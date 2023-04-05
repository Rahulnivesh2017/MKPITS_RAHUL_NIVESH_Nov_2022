// Largest of 3 Number

import java.util.*;

 class Largest_Of_3_Number{
 public static void main(String []args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter first number");
	 int a=sc.nextInt();

	 System.out.print("Enter second number");
	 int b=sc.nextInt();

	 System.out.print("Enter Third number");
     int c=sc.nextInt();

     if(a>b && a>c)
     {
		 System.out.println(a+" is  Largest Number");
     }
     else if (b>a && b>c)
     {
		 System.out.println(b+ "is  Largest Number");
	 }
	 else{
		 System.out.println(c+ "is  Largest Number");

	 }
	 int largest1=a>b?a:b;
	 int largest2=c>largest1?c:largest1;


     System.out.println(largest2+"is Largest Number");
     }
     }
