// Write a program in Java to check whether an integer is Armstrong number or not.

// input number 153 ---->(1*1*1 + 5*5*5 + 3*3*3 = 153)


import java.util.*;
class Armstrong{

public static void main(String []args){

  int n,arm=0,rem;

  System.out.println("Enter any number");

  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();

  c=n;

  while (n>0)
  {
  rem=n%10;
  arm=(rem*rem*rem)+arm;
 n= n/10;
  }

  if(c==arm)
  {
  System .out.println("Armstrong number");

  else
  System .out.println("Not Armstrong number");
  }
  }
