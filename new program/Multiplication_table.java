// write a java program that takes a number as input and print its multiplication table

import java.util.*;

class Multiplication_table{

public static void main(String []args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number you want for multiplication number");
int n=sc.nextInt();

System.out.println("multiplication table of "+n);
for (int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+(n*i));
}
}
}