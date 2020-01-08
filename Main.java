import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;  
import javax.swing.JFrame;  

public class Main 
{
  public static void main(String[] args) 
  {
    DisplayGraphics m=new DisplayGraphics();
    // creating instance of JFrame
    JFrame f = new JFrame();
    f.setSize(800, 600);

  //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  //f.setSize(screenSize.width/2, screenSize.height/2);
    f.add(m);  
    f.setVisible(true);
  }
}

