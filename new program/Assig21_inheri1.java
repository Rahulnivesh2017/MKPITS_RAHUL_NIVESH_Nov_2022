//Create a parent class called "Food" and create two child classes "Dessert" and "MainCourse".
//        Each child class should have its own unique method

class Food{

    void different_Food(){

        System.out.println("different type of Food");
    }
}
class Dessert extends  Food{

    void Dessert(){
        System.out.println(" do not eat dessert if you eat you will suffer from gum problem");
    }
}
class MainCourse extends Dessert{

    void maincourse(){

        System.out.println("you will eat main cource before dessert");
    }
}

 class Assig21_inheri1 {
    public static void main(String []args) {

        MainCourse m= new MainCourse();
        m.maincourse();
        m.Dessert();
        m.different_Food();
    }
}
