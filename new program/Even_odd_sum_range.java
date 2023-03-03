
import java.util.*;

class Even_odd_sum_range
{

public static void main(String [] argus){

   int n,i,sum=0;
   System.out.print("Enter range");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
if(n%2==0)
{
for(i=0;i<=n;i=i+2)
{
sum=sum+i;
}
System.out.print("sum of even number"+sum);
}
else
{
for(i=1;i<=n;i=i+2)
{
sum=sum+i;
}
System.out.print("sum of odd number"+sum);



}
}
}