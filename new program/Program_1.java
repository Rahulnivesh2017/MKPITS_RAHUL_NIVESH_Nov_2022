/* Write a Java program to create a HashSet and 
   add some elements to it. */
   
   import java.util.*;
   
  class Program_1{
  
   public static void main(String [] args){
     HashSet hs = new HashSet();
     hs.add(20);
     hs.add(15);
     hs.add(20);
     hs.add(10);
     hs.add(25);
     
     System.out.println(hs);
   }
  }