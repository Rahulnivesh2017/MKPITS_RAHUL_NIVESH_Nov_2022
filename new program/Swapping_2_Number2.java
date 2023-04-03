class Swapping_2_Number2{
public static void main(String []args)
{
  int a=10,b=20;
  System.out.println("Befor swapping values are"+a+ " "+b);
  //logic-3-use * & / without third variable
  // here a & b values should not be zero
  a=a*b;
  b=a/b;
  a=a/b;
   System.out.println("After swapping values are"+a+ " "+b);
   }
   }