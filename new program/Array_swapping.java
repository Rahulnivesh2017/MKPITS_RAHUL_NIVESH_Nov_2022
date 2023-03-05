// write a java program to create a new array swapping the first and last element of a
// give array of integer and length will be least 1.

class Array_swapping{

public static void main(String []args){

int a[]={1,2,3,4,5,6};
int temp;

temp=a[0];
a[0]=a[5];
a[5]=temp;

for (int i=0;i<a.length;i++)
{

System.out.println(" "+a[i]);

}
}
}
