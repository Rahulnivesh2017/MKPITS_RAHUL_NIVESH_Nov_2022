import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioDemo extends JFrame implements ItemListener
{

JRadioButton shirtbut,pantbut,sareebut,brownbut,graybut,creambut;
public JRadioDemo()
{
Container c=getContentPane();
c.setLayout(new FlowLayout());//to create but tohgroup objects that group checkboxes
ButtonGroup group1=new ButtonGroup();
ButtonGroup group2=new ButtonGroup();//first set of radio button for clothes selection
shirtbut=new JRadioButton("Shirt");
pantbut=new JRadioButton("Pant");
sareebut=new JRadioButton("Saree");//second set of redio buttons for color selection
brownbut=new JRadioButton("Brown");
graybut=new JRadioButton("Gray");
creambut=new JRadioButton("Cream");//actually here,checkboxes are conveted intoradio button

group1.add(shirtbut);//shirtbut pantbut and sareebut are mode into

group2.add(pantbut);//one group by using group1 object of button group class

group1.add(sareebut);
group2.add(brownbut);//brownbut graybut and creambut are make into

group1.add(graybut);//one group using group2 object
group1.add(creambut);//add individual checkboxes to the container

c.add(shirtbut);
c.add(pantbut);
c.add(sareebut);
c.add(brownbut);
c.add(graybut);
c.add(creambut);

//register each checkbox with the listener
shirtbut.addItemListener(this);
pantbut.addItemListener(this);
sareebut.addItemListener(this);
brownbut.addItemListener(this);
graybut.addItemListener(this);
creambut.addItemListener(this);

setTitle("Learning Radio Button");
setSize(250,200);
setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
String name = "", color = "";//two local variables
if (shirtbut.isSelected())
name="Shirt";
else if(pantbut.isSelected())
name="Pant";
else if(sareebut.isSelected())
name="Saree";
if(brownbut.isSelected())
name="Brown";
else if(graybut.isSelected())
name="Gray";
else if(creambut.isSelected())
name="Cream";

JOptionPane.showMessageDialog(null, "you wanted" + name + " in color " + color, "Selection Application", JOptionPane.INFORMATION_MESSAGE);
}
public static void main(String []args)
{
new JRadioDemo();
}
}






