import java.util.Scanner;

class assig4_23
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("multiple");
int a=sc.nextInt();

if(a>0)
{
if(a%3==0 && a%7==0)
{
System.exit(0);

}
else if(a%3==0)
{
System.out.println("multiple of number 3");
}
else if(a%7==0)
{
System.out.println("multiple of number 7");
}
else
{
System.out.println("Not multiple by 3 or 7");
}
}
}
}
