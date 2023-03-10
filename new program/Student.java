
class Student{

int age;

String name;

public void printInfo(String name){
System.out.println("name");
}
public void printInfo(Integer age){
System.out.println("age");
}
public void printInfo(Integer age,String name){
System.out.println(name+" "+age);
}
public static void main(String []args){
Student s1=new Student();
s1.name="Amit";
s1.age=24;
s1.printInfo(s1.age,s1.name);
}
}