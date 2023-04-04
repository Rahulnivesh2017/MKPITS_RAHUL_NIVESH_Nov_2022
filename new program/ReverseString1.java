


class ReverseString1{

public static void main(String []args)
{

  String str="ABCD";

  String rev=" ";

  //Using Character class

  char a[]=str.toCharArray();
  int len=a.length ;//4
  for(int i=len-1;i>=0;i--)
  {
  rev=rev+a[i];
  }

   System.out.println("Reverse String is"+rev);
   }
}