
import java.util.Scanner;

class assig4_diff_max_min18{

public static void main(String [] argus){

Scanner sc = new Scanner(System.in);

System.out.println();

System.out.println("Enter The 1 num:"); 
int a = sc.nextInt();

System.out.println("Enter Thee 2 num:");
int b = sc.nextInt();

System.out.println("Enter The 3 num:");
int c = sc.nextInt();

System.out.println("Enter The 4 num:");
int d = sc.nextInt();

// greater num
int num1 , num2, diff;

if(a>b && a>c && a>d)
{
	num1 = a;
}

else if(b>a && b>c && b>d)
{
	num1= b;
}

else if(c>a && c>b && c>d)
{
	num1 = c;
}

else{
	num1 = d;
	}

// smaller num


if(a<b && a<c && a<d)
{
	num2 = a;
}

else if(b<a && b<c && b<d)
{
	num2 = b;
}

else if(c<a && c<b && c<d)
{
	num2 = c;
}

else{
	num2 = d;
	}

	diff = num1 - num2;

	System.out.println("Greater Num :"+num1+" Smaller Num " +num2);

System.out.println("Difrencer is : "+diff);

}

}