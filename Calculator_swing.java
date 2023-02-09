import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Calculator implements ActionListener
{
  JFrame f1;
  Container c;
  JLabel l1,l2,l3;
  JTextField t1,t2,t3;
  JButton b1,b2,b3,b4;

 Calculator()
 {
 JFrame.setDefaultLookAndFeelDecorated(true);
 f1=new JFrame();
 c= f1.getContentPane();
 f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


 l1=new JLabel("Enter your first number : ");
 l2=new JLabel("Enter your second number : ");
 l3=new JLabel("Result : ");

 t1=new JTextField();
 t2=new JTextField();
 t3=new JTextField();

 b1=new JButton("Add");
 b2=new JButton("Sub");
 b3=new JButton("multi");
 b4=new JButton("div");


f1.setLayout(null);
l1.setBounds(50,80,200,40);
t1.setBounds(230,80,200,30);
l2.setBounds(50,160,200,40);
t2.setBounds(230,170,240,30);
l3.setBounds(50,260,200,40);
t3.setBounds(230,270,200,30);
b1.setBounds(100,400,100,50);
b2.setBounds(200,400,100,50);
b3.setBounds(300,400,100,50);
b4.setBounds(400,400,100,50);


f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


f1.setVisible(true);
 f1.setSize(200,200);
}


 public void actionPerformed(ActionEvent e){

if(e.getSource()==b1){
 String s1=t1.getText();
 String s2=t2.getText();

 int x=Integer.parseInt(s1);
 int y=Integer.parseInt(s2);
 int z=x+y;
 String s3=Integer.toString(z);
 t3.setText(s3);
}
if(e.getSource()==b2){
 String s1=t1.getText();
 String s2=t2.getText();

 int x=Integer.parseInt(s1);
 int y=Integer.parseInt(s2);
 int z=x-y;
 String s3=Integer.toString(z);
 t3.setText(s3);
}
if(e.getSource()==b3){
 String s1=t1.getText();
 String s2=t2.getText();

 int x=Integer.parseInt(s1);
 int y=Integer.parseInt(s2);
 int z=x*y;
 String s3=Integer.toString(z);
 t3.setText(s3);
}
if(e.getSource()==b4){
 String s1=t1.getText();
 String s2=t2.getText();

 int x=Integer.parseInt(s1);
 int y=Integer.parseInt(s2);
 int z=x/y;
 String s3=Integer.toString(z);
 t3.setText(s3);
}

}


 }

 class Calculator_swing
 {
 public static void main(String []args)
 {
 new Calculator();
 }
 }
