import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Homepageleftpart extends JPanel
{
	JLabel b1;
	
	public Homepageleftpart()
	{
		setBackground(new Color( 37, 159, 36 ));
		//setLayout(new GridLayout(1,2));
		ImageIcon ic=new ImageIcon("6.jpg"); 
		
     b1=new JLabel(ic);
     //b2=new JButton(ic1);
      add(b1);
      //add(b2);

}
}