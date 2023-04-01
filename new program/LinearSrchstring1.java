

class LinearSrchstring1
{
  public static void main(String []args)
  {
    String arr[]={"Sachin","Vishal","Rahul","Pavan","Bharat"};
    String item="Rishikesh";
    int temp=0;

    for(int i=0;i<arr.length;i++)
    {
      if (arr[i]==(item))
      {
        System.out.println("Item present in "+i+" index position");
        temp=temp+1;
        }
        }
        if(temp==0)
        {
          System.out.println("Item not found is list");
        }
        }
        }
