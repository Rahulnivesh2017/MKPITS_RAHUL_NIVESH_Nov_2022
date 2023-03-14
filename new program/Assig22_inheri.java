
//Create a parent class called "parents" and create two child classes "son" and "daughter"
//        Each child class should have its own unique method.

class Parents{
    void care(){
        System.out.println("taking care of child");
    }
}
class son extends Parents{
    void son(){

        System.out.println("your are looking handsome");
    }
}
class Daughter extends son{

    void Cute(){
        System.out.println("So cute");
    }
}
public class Assig22_inheri {
    public static void main(String []args) {

        Daughter sc = new Daughter();
        sc.care();
        sc.son();
        sc.Cute();
    }
}
