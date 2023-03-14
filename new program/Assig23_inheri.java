//Create a parent class called "Shape" and create two child classes "Rectangle" and "rombus"
//        that inherit from it. Override the area method in the Rectangle class.

class Shape{
 void diff_area(){

 }
}
class rect_angle extends Shape{
  @Override
  void diff_area() {
   System.out.println("overrided from Shape");
    super.diff_area();
  }
}
class rombus extends rect_angle{

    void side(){
        System.out.println("opposite sides are same");
    }
}
public class Assig23_inheri {
    public static void main(String[] args) {
        rombus r = new rombus();
        r.side();
        r.diff_area();
    }
}
