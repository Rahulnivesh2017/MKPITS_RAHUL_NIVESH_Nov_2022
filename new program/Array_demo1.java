
class Array_demo1{

public static void main(String []args){

int arr[]={1,2,5,6,7};

int a=arr[0];
int b=arr[1];
int arr2[]=new int[arr.length];

int count=0;

for (int i=1;i<arr.length-1;i++)
{

arr2[count]=arr[i+1];

count++;

}
arr2[count]=a;
arr2[count+1]=b;
for (int i=0;i<arr2.length;i++)
{
System.out.println(arr2[i]);
}
}
}