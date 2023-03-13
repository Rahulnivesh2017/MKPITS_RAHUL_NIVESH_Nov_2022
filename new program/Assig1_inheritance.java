//Create a parent class called "Vehicle" and create two child classes "Car" and "Motorcycle" that
//inherit from it.Give each child class its own unique method.

class Vehicle{

void Types_Vehicle(){

System.out.println("Different types of vehicle");

}
}
class Car extends Vehicle{

void Types_Car(){

System.out.println("New look model car");

}
}
class Motorcycle extends Car{

void Types_Motorcycle(){

System.out.println("Bick is pulser best");

}
}
class Assig1_inheritance{

public static void main(String []args){

Motorcycle m=new Motorcycle();

m.Types_Car();

m.Types_Motorcycle();

m.Types_Vehicle();

}
}
