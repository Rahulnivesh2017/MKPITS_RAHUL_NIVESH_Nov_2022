

class A extends Thread
{
   @Override
   public void run()
   {
       for(int i=1;i<=5;i++)
       {
          System.out.println("Rahul");
          }
    }
 }
 
 class B1 
 {
    public static void main(String []args){
    
    A t=new A();
    t.start();
    
      for(int i=1;i<=5;i++)
      {
         System.out.println("Samiksha");
         }
       }
  }