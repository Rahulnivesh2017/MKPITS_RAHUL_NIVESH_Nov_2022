
// write a program to display sum of 1 to N number
import java.util.*;
class sumnum
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of N");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum+=i;
     }
     System.out.println(sum);
     }
     }