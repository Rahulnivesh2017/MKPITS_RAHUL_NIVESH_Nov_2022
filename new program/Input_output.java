// write a java program to that takes 3 numbers (x,y,z) as input and print the output of (x+y)*z and x*y+y*z.

import java.util.*;

class Input_output{

public static void main(String []args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the 3 integer number");

int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();

int a=(x+y)*z;
int b=(x*y)+(y*z);

System.out.println("output of (x+y)*z"+a);

System.out.println("output of x*y + y*z "+b);

}
}
