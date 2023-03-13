//Create a class called "Employee" with two child classes "Manager" and "Developer".
//Each child class should have its own unique method.

class Employee{
void Different_Work(){
System.out.println("Different types of work");
}
}
class Manager extends Employee{
void Work_Employee(){
System.out.println("work to the employee in manager");
}
}
class Developer extends Manager{
void Different_Developer(){
System.out.println("Different work on the developer");
}
}

class Assig7_inheritance{
public static void main(String []args){
Developer dv=new Developer();
dv.Different_Work();
dv.Work_Employee();
dv.Different_Developer();
}
}
