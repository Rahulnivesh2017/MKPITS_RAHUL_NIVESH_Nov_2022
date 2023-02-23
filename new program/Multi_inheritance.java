class One1
{
 int a;
 void set1()
 {
  a=12;
  }
  void dis1()
  {
  System.out.println(a);
  }
  }
  class Two extends One1
   {
     int b;
     void set2()
     {
       b=20;
       }
       void dis2()
       {
        System.out.println(b);
        }
        }
        class Three extends Two
        {
         int c;
         void set3()
         {
           c=15;
           }
           void dis3()
           {
             System.out.println(c);
             }
             }
             class Multi_inheritance
             {
             public static void main(String []args)
             {
               Three ob=new Three();
               ob.set1();
               ob.set2();
               ob.set3();
               ob.dis1();
               ob.dis2();
                ob.dis3();
                }
                }