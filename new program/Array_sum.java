// write a java program to compute the sum of the two give array of integer 5
// length 3 and find the array which has the largest sum.

class Array_sum{

public static void main(String []args){

int a[]={1,2,3};
int b[]={4,5,6};

int sum1,sum2;

sum1=(a[0]+a[1]+a[2]);
System.out.println("addition of first array="+sum1);

sum2=(b[0]+b[1]+b[2]);
System.out.println("addition of second array="+sum2);

if (sum1>sum2)
{
 System.out.println("sum1 is greater="+sum1);
 }
 else
 {
 System.out.println("sum2 is greater="+sum2);
 }
 }
 }