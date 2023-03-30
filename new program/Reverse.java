//write a program to reverse an integer in java.

import java.util.Scanner;

class Reverse{                                             // Dry Run
public static void main(String []args){
                                                          // int n,r;
int n,r;                                                  // input n; // n=123
System.out.print("Enter any Number");
Scanner sc=new Scanner(System.in);                        // while(n>0){
n=sc.nextInt();                                           // r=n%10;
while(n>0)                                                 // s.o.p(r); // 321
{                                                         // n=n/10;
r=n%10;
System.out.println("Reverse Order"+r);
// System.out.print(r);
 n=n/10;
 }
 }
 }