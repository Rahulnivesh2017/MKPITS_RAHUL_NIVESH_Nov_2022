import javax.swing.*;
import java.awt.*;

class AWT
{
  JFrame f1;
  JPanel p1,p2;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
   JTextField t1;




AWT()

{

	JFrame.setDefaultLookAndFeelDecorated(true);




     f1=new JFrame ();
   Container c= f1.getContentPane();
f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
t1= new JTextField(50);
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("C");
b5=new JButton("4");
b6=new JButton("5");
b7=new JButton("6");
b8=new JButton("+");
b9=new JButton("7");
b10=new JButton("8");
b11=new JButton("9");
b12=new JButton("-");
b13=new JButton("0");
b14=new JButton(".");
b15=new JButton("=");
b16=new JButton("*");


p1=new JPanel();
p1.setBackground(Color.RED);


p2=new JPanel();
p1.setBackground(Color.PINK);
p2.setLayout(new GridLayout(4,4,5,5));
p2.add(b1);
p2.add(b2);
p2.add(b3);
p2.add(b4);
p2.add(b5);
p2.add(b6);
p2.add(b7);
p2.add(b8);
p2.add(b9);
p2.add(b10);
p2.add(b11);
p2.add(b12);
p2.add(b13);
p2.add(b14);
p2.add(b15);
p2.add(b16);


  f1.setVisible(true);
   f1.setSize(200,200);

   p1.add(t1);
   c.add(p1,BorderLayout.NORTH);
   c.add(p2,BorderLayout.CENTER);
}
}




  public class Calculater_swing
  {
  public static void main(String []args)
{
  new AWT();
}
}
