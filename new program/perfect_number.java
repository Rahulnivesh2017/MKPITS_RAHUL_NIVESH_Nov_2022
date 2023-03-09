import java.util.*;

class perfect_number{
public static void main(String []args){
int n,sum=0;
System.out.print("Enter any number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for (int i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(n==sum)
{
System.out.print("perfect number");
}
else
{
System.out.print("not perfect number");
}
}
}
