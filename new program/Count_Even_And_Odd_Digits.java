// count of even & odd digits in a number

class Count_Even_And_Odd_Digits{
public static void main(String []args)
{
  int num=1234;
  int even_count=0;
  int odd_count=0;

  while(num>0)
  {
    int rem=num%10;
    if(rem%2==0)
    {
    even_count++;
    }
    else
    {
       odd_count++;
       }
       num=num/10;

     }
    System.out.println("Number of Even Number" +even_count);
    System.out.println("Number of Odd Number" +odd_count);
     }
 }