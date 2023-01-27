import java.util.Scanner;
class assig
{
int num1,num2,num;
void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number 1");
num1=sc.nextInt();
System.out.println("num1:"+num1);
System.out.println("Enter number 2");
num2=sc.nextInt();
System.out.println("num2:"+num2);

}
void fun()
{
if((num1>20&&num1<50)||(num2>20&&num2<50))
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}


class assig13_integers19
{
public static void main(String []args)
{
assig ob=new assig();
ob.set();
ob.fun();
}
}
