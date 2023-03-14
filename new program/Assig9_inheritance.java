class Animal{
void Different_Animal(){
System.out.println("Different types of animal");
}
}
class Mammal extends Animal{
void Cry_Mammal(){
System.out.println("Crying to the Mammal");
}
}
class Bird extends Mammal{
void Crying_Bird(){
System.out.println("Crying to the Bird");
}
}
class Assig9_inheritance{
public static void main(String []args){
 Bird sc=new Bird();
 sc.Different_Animal();
 sc.Cry_Mammal();
 sc.Crying_Bird();
 }
 }
 