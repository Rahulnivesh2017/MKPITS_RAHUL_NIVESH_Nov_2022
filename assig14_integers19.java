import java.util.Scanner;
class assig
{
int num1,num2;
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
int sub1=100-num1;
int sub2=100-num2;
if(sub1<sub2)
{
System.out.println("number 1 is nearest to value 100 "+num1);
}
else if(sub1==sub2)
{
if(sub1==sub2)
System.out.println("0");
}
else
{
System.out.println("number 2 is nearest to value 100 "+num2);
}
}
}


class assig14_integers19
{
public static void main(String []args)
{
assig ob=new assig();
ob.set();
ob.fun();
}
}
