
//write a program to find out wheture a given integer is present in an array or out

class array_demo
{
  public static void main(String []args)
  {
    int marks[]={45,67,63,99,100};
    int num=67;
   boolean IsInArray=false;
   for(int element:marks)
    {
    if(num==element)
     {
      IsInArray=true;
      break;
      }
      }
      if(IsInArray)
      {
       System.out.println("the value is present");
       }
       else{
       System.out.println("the value is not present");
       }
       }
       }