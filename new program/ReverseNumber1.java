import java.util.*;


class ReverseNumber1{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter a Number");
  int num=sc.nextInt();

  //Using stringBuffer class

  StringBuffer sb=new StringBuffer(String.valueOf(num));

  StringBuffer rev=sb.reverse();


   System.out.println("Reverse Number is"+rev);
   }
}