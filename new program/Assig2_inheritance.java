//Create a parent class called "Animal" and create three child classes "Dog", "Cat" and "Bird" that
//inherit from it. Each child class should have its own unique method.

class Animal{
void Speak_Animal(){
System.out.println("Different Animal");
}
}
class Dog extends Animal{
void Speak_Dog(){
System.out.println("Woof");
}
}
class Cat extends Dog{
void Speak_Cat(){
System.out.println("Meow");
}
}
class Bird extends Cat{
void Intro_Bird(){
System.out.println("There are many types of birds");
}
}
class Assig2_inheritance{
public static void main(String []args){
Bird m=new Bird();
m.Speak_Dog();
m.Speak_Cat();
m.Intro_Bird();
m.Speak_Animal();
}
}
