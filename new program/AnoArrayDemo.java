
//Anonymous Array (single dimension)

class AnoArrayDemo
{
  public static void main(String []args)
  {
    AnoArrayDemo.sum(new int [] {10,20,30});

    }
    static void sum(int [] no)
    {
      int total=0;

      for(int i:no)    // Each Loop
      {
         total=total+i;
         }
         System.out.println("sum is:"+total);
         }
         }
