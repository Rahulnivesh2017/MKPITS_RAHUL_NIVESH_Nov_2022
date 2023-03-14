//Create a parent class called "Animal" and create two child classes "DomesticAnimal" and
//        "WildAnimal". Each child class should have its own unique method.


class Animal{

    void diff_type(){

        System.out.println(" different type of animals");
    }
}
class DomesticAnimal extends Animal{

    void domestic_animal(){
        System.out.println(" goat, chicken,dogs are domestic animal");
    }
}
class wildAnimals extends DomesticAnimal{

    void wild_animal(){

        System.out.println("tiger lion cheetah are wild animals");
    }
}
public class Assig25_inheri {
    public static void main(String []args) {

        wildAnimals sc = new wildAnimals();
        sc.diff_type();
        sc.wild_animal();
        sc.domestic_animal();

    }
}
