
// One class use
class Animal
{
   public void run()
     {
        System.out.println("i am running");
     }

     public static void main(String []args)
        {
            System.out.println("1");

            Animal buzo=new Animal();
            buzo.eat();
            buzo.run();
         }
            public void eat()
             {
               System.out.println("i am eating");
             }
   }