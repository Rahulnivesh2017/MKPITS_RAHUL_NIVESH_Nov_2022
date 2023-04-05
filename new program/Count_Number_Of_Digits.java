// count Number of Digits in a Number

class Count_Number_Of_Digits{
public static void main(String []args)
{
  int num=123456;
  int count=0;
  
  while(num>0)
  {
    num=num/10;
    count ++;
    }
     System.out.println("Number of Digits" +count);
     }
     }