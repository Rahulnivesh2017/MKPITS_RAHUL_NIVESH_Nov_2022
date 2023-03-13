//Create a parent class called "Building" and create two child classes "House" and "Apartment" that inherit from it.
//Each child class should have its own unique method.

class Building{

void Different_Building(){

System.out.println("Different types of building");

}
}
class House extends Building {

void Different_House(){

System.out.println("only for family member");

}
}
class Apartment extends House{

void Different_Apartment(){

System.out.println("Different people of apartment");

}
}
class Assig6_inheritance{

public static void main(String []args){

Apartment Ap=new Apartment();

Ap.Different_Apartment();
Ap.Different_House();
Ap.Different_Building();

}
}
