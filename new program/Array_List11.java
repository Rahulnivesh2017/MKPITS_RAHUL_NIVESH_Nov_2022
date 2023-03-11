
import java.util.*;

class Array_List11{

public static void main(String []args){

ArrayList list=new ArrayList();

list.add("Amit");
list.add("Ankush");
list.add("Dev");

System.out.println(list);
list.add("Anmol");
System.out.println(list);
list.add(1,"Ken");
System.out.println(list);
list.add(0,"Roman");
System.out.println(list);
list.remove(1);
System.out.println(list);
list.set(0,"rohit");
System.out.println(list);
System.out.println(list.get(2));
}
}
