/* Write a Java program to create a HashSet and iterate
   over its elements. */

   import java.util.*;

     class Program_9 {

      public static void main(String [] args){
        HashSet hs = new HashSet();
        hs.add(2);
        hs.add(4);
        hs.add(1);
        System.out.println(hs);
        System.out.println(hs.contains(1));
        System.out.println(hs.size());
      }
  }