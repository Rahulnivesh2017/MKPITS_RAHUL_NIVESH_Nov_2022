class A
{
int num1,num2,num3,num4;
void set()
{
num1=(-1+4*6);
num2=((35+5)%7);
num3=(14+(-4)*6/11);
num4=(2+15/6*1-7%2);
}

void dis()
{
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
System.out.println(num4);
}
}
public class assig2_Operation19
{
public static void main(String []args)
{
A ob=new A();
ob.set();
ob.dis();
}
}
