

// Creating Our Thread Using Runnable Interface

     class MyThread123 implements Runnable
      {
         //@Overriding

         public void run()

         {
            // task for thread

               for(int i=1;i<=10;i++)
                {
                    System.out.println("Value of i is "+i);
                    }
           }
                 public static void main(String []args)
                 {
                     MyThread123 t=new MyThread123();

                     Thread th=new Thread(t);

                        th.start();
                        }
                        }
