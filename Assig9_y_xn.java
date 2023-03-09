

import java.util.*;

class Assig9_y_xn{

public static void main(String []args){
  int res;

Scanner sc = new Scanner(System.in);


System.out.println("Enter value of y ");
int y = sc.nextInt();

System.out.println("Enter value of x ");
int x = sc.nextInt();

System.out.println("Enter value of n ");
int n = sc.nextInt();

res = x*n;

if(y == res)
{
  System.out.println(+res+" Satisfy the condition of y=xn");

}

else
{

 System.out.println(" Does not Satisfy the condition of y=xn");
}

}

}