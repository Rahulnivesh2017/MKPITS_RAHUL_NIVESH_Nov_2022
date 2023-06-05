
//performing multiple task from multiple thread


class PlayVideo extends Thread
{
   public void run()
   {
      System.out.println("Playing Video");
    }

 }

 class PlayMusic extends Thread
 {
    public void run()
    {
       System.out.println("Playing Music");
     }

 }

 class ProgressBar extends Thread
 {
    public void run()
    {
       System.out.println("Progress bar is executing");
     }

 }

 class Timor extends Thread
 {
    public void run()
    {
       System.out.println("Timor is executing");
     }

 }

 class Test
 {
   public static void main(String []args)
   {
      PlayVideo p3=new PlayVideo();
      p3.start();

       PlayMusic p2=new PlayMusic();
      p2.start();

       ProgressBar p1=new ProgressBar();
      p1.start();

      Timor t=new Timor();
      t.start();
  }
}