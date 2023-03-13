//Create a parent class called "Person" with two child classes "Student" and "Teacher".
//Each child class should have its own unique method.

class Person{
void Different_Person(){
System.out.println("Different types of person");
}
}
class Student extends Person{
void Different_Student(){
System.out.println("Different types of person");
}
}
class Teacher extends Student{
void Different_Teachaer(){
System.out.println("Different types of teacher");
}
}
class Assig4_inheritance{
public static void main(String []args){
Teacher sc=new Teacher();
sc.Different_Person();
sc.Different_Student();
sc.Different_Teachaer();
}
}

