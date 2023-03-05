// write a java program to print an screen the output of adding,subtracting,multiplying
  // and dividing of two number which will be enter by the user.

   import java.util.*;

   class Array_addition{

   public static void main(String []args){

   Scanner sc=new Scanner(System.in);

   System.out.print("Integer First number");
   int num1=sc.nextInt();

   System.out.print("Integer second number");
   int num2=sc.nextInt();

   System.out.println(num1+"+"+num2+"="+(num1+num2));

   System.out.println(num1+"-"+num2+"="+(num1-num2));

   System.out.println(num1+"*"+num2+"="+(num1*num2));

   System.out.println(num1+"/"+num2+"="+(num1/num2));

   }
   }


