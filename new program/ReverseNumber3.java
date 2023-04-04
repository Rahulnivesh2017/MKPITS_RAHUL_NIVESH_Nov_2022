import java.util.*;


class ReverseNumber3{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter a Number");
  int num=sc.nextInt();

  //Using stringBuiler class

  StringBuilder sb1=new StringBuilder();
  sb1.append(num);
  

  StringBuilder rev=sb1.reverse();


   System.out.println("Reverse Number is"+rev);
   }
}