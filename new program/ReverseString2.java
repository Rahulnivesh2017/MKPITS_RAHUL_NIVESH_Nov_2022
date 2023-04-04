


class ReverseString2{
public static void main(String []args)
{
  String str="ABCD";
  String rev=" ";

  //Using stringBuiler class

  StringBuilder sb=new StringBuilder(str);
  System.out.println(sb.reverse());

   System.out.println("Reverse String is"+rev);
   }
}