import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Homepage12 extends JFrame
{
	public Homepage12()
	{
		setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		setLocationRelativeTo(this);
		
		setResizable(false);
		setLayout(new BorderLayout());
		//Homepagelabel l=new Homepagelabel();
		//Homepageimage i=new Homepageimage();
		//add("North",i);
		//add("South",l);
	}

	 
	public static void main(String[] args) {
		Homepage12 h=new Homepage12();
		h.setVisible(true);

	}

}
