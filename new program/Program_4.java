/* Write a Java program to create a HashMap and add some
   elements to it.
 */

   import java.util.*;

     class Program_4 {

      public static void main(String [] args){

       HashMap <String,Integer> hm = new HashMap<>();

        hm.put("A",2);
        hm.put("D",5);
        hm.put("S",6);
        hm.put("B",1);
        hm.put("E",3);

        System.out.println(hm);
      }
  }