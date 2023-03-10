/* Write a Java program to create a TreeMap and iterate
   over its keys. */

   import java.util.*;

     class Program_8 {

      public static void main(String [] args){

        TreeMap <Integer,Integer> tm = new TreeMap<>();
        tm.put(5,55);
        tm.put(2,40);
        tm.put(7,25);
        System.out.println(tm);
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        tm.remove(2);
        System.out.println(tm);
      }
  }