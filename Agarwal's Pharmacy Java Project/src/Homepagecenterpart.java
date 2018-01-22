import java.awt.BorderLayout;

import javax.swing.JPanel;


public class Homepagecenterpart extends JPanel
{
	
		public Homepagecenterpart()
		{
			setLayout(new BorderLayout());
			
			Homepageleftpart p=new Homepageleftpart();	
			Homeimagelabel l=new Homeimagelabel();
			add("North",p);
			add("Center",l);
		}
		

	}


