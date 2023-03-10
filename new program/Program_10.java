/* Write a Java program to create a LinkedList and 
   remove the first and last elements from it. */

   import java.util.*;

     class Program_10 {

      public static void main(String [] args){
      
        LinkedList <Integer> lst = new  LinkedList <>();
        lst.add(5);
        lst.add(7);
        lst.add(4);
        lst.add(9);
        lst.add(2);
        
        System.out.println(lst);
        lst.removeFirst();
        lst.removeLast();
        System.out.println(lst);
        
      }
  }