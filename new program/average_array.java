
class average_array
{
  public static void main(String []args)
   {
     double marks[]={45.7,67.8,63.4,99.2,100.0};
     double sum=0;
     for(double element:marks){
     sum=sum+element;
     }
     System.out.println("the value of average is"+sum/marks.length);
     }
     }

