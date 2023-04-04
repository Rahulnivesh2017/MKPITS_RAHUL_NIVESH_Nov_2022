


class ReverseString{

public static void main(String []args)
{

  String str="ABCD";

  String rev=null;

  int len=str.length();//4

  for(int i=len-1;i>=0;i--)
  {
  rev=rev+str.charAt(i);
  }

   System.out.println("Reverse String is"+rev);
   }
}