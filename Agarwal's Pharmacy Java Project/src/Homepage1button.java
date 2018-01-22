import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Homepage1button extends JPanel 
{
  Homepagebutton1 p1;
  Homepagebutton2 p2;
   public Homepage1button()
   {setBackground(new Color( 37, 159, 36 ));

	  // setBackground(new Color( 68, 127, 180  ));
	  setLayout(new BorderLayout());
	  p1=new Homepagebutton1();
	  p2=new Homepagebutton2();
	  add("East",p1);
	  add("West",p2);
	  
}
}