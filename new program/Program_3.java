/* Write a Java program to create a TreeMap and add some
   elements to it. */

   import java.util.*;

     class Program_3{

      public static void main(String [] args){
       TreeMap <Integer,String> tm= new TreeMap<>();
        tm.put(2,"abc");
        tm.put(5,"def");
        tm.put(3,"ghi");
        tm.put(9,"jkl");
        tm.put(4,"mno");
        System.out.println(tm);
      }
  }