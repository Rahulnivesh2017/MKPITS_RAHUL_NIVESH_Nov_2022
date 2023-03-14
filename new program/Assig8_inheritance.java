class Food{
void Type_Food(){
System.out.println("Different types of food");
}
}
class Pizza extends Food{
void Dominos_Pizza(){
System.out.println("this is  chicken pizza");
}
}
class Burger extends Pizza{
void Mumbai_Burger(){
System.out.println("Mumbai is a famous burger");
}
}
class Assig8_inheritance{
public static void main(String []args){
Burger sc=new Burger();
sc.Type_Food();
sc.Dominos_Pizza();
sc.Mumbai_Burger();
}
}
