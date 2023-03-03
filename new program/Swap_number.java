
import java.util.Scanner;

class Swap_number
{

public static void main(String [] argus){

Scanner sc = new Scanner(System.in);

System.out.println("Enter any two number");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Before sumpping = "+a+""+b);

a = a+b;

b = a-b;

a = a-b;

System.out.println(" After swap is a ="  +a+  "b = " +b);

}



}