// create on array of 5 floats and calculate their sum
class arraya_sum
{
 public static void main(String []args)
 {
   float marks[]={45.7f,67.8f,63.4f,99.2f,100.0f};
   float sum=0;
   for(float element:marks){
   sum=sum+element;
   }
   System.out.println("the value of sum is"+sum);
   }
   }
