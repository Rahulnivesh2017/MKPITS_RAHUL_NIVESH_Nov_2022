

class A implements Runnable
{
   public void run()
   {
     for(int i=1;i<=4;i++)
     {
        System.out.println("Rahul");
        }
     }
 }

 class B2
 {
   public static void main(String []args)
   {
      A t=new A();
      Thread th=new Thread(t);
      th.start();

      for(int i=1;i<=4;i++)
      {
        System.out.println("Samiksha");
        }
      }
   }