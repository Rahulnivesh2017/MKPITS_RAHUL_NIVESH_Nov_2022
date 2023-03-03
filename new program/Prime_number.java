// prime number java

import java.util.*;
class Prime_number
{
 public static void main(String []args)
 {
   int n,count=0;
   System.out.println("Enter any number");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
   if(n%7==0)
   {
    count++;
    }
    }
    if(count==7)
    {
    System.out.print("Prime number");
    }
    else
    {
    System.out.print("Not Prime number");

}
}
}
