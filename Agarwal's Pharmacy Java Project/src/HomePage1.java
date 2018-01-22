import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JSplitPane;



public class HomePage1 extends JFrame 
{


	
	
	 public HomePage1()
	 {

			setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
			setLocationRelativeTo(this);
			
			setResizable(false);
			setLayout(new BorderLayout());
			
			//Homepage12 p1=new Homepage12();
			
			 Homepagecopyright c=new  Homepagecopyright();
	        
			HomepageNorth1 p1=new HomepageNorth1();
			Homepagecenterpart l=new Homepagecenterpart();
			//Usehomepage u=new Usehomepage();
		    add("South",c);
		    add("Center",l);
		    add("North",p1);
			
	 }
	public static void main(String[] args) 
	{
	
		HomePage1 h=new HomePage1();
		h.setVisible(true);
		

	}
	
	

}
