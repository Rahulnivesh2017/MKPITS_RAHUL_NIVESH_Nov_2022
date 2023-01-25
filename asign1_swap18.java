
import java.util.Scanner;

class asign1_swap18{

public static void main(String [] argus){

Scanner s = new Scanner(System.in);

System.out.println("Enter first num:");
int a = s.nextInt();

System.out.println("Enter second num:");
int b = s.nextInt();

a = a+b;

b = a-b;

a = a-b;

System.out.println("Num after swap is a ="  +a+ "b = " +b);

}



}