// write a java program that takes 4 number as input to calculate
// and print the average.

import java.util.*;

class Average{

public static void main(String []args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the 4 number ypou want to find the average");

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();

float avg=(float)(a+b+c+d)/4;

System.out.println("average is"+avg);

}
}


