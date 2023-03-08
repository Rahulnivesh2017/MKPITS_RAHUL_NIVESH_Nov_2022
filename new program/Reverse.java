// Write a program to reverse an integer in Java.

// input number 123------->321   //n-123

import java.util.*;
class Reverse{
public static void main(String []args){
int n,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
 n=sc.nextInt();
while(n>0)
{
r= n%10;   //10/123
System.out.println("Reverse order"+r);
n=n/10;
}
}
 }
