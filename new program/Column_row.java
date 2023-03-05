// write a java program that takes a number as input and then display
//a rectangle of 3 column wide and 5 row all using that digit.

import java.util.*;

class Column_row{

public static void main(String []args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the integer numbers");
int n=sc.nextInt();

System.out.println();

for (int i=0;i<=5;i++)
{
if (i==0 || i==4)
{
System.out.println(" "+n+" "+n+" "+n);
}
else 
{
System.out.println(" "+n+" "+n);
}
}
System.out.println();
}
}