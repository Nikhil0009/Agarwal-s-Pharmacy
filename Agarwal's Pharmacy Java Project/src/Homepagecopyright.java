import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Homepagecopyright extends JPanel
{
	JLabel l1,l2;
	public Homepagecopyright()
	{setBackground(new Color( 37, 159, 36 ));

		 //setBackground(new Color( 68, 127, 180  ));
		 setLayout(new GridLayout(2, 1));
		
		 Font f=new Font(Font.SANS_SERIF,Font.ITALIC,20);
		l1=new JLabel("                                                                                                                           (c) Copyright  2017 aggarwal's pharmacy.All rights reserved. ");
		l1.setFont(f); 
		l2=new JLabel("                                                                                      It compilance with drug and cosmetics Act and rules,we don't process request for schedule X an dother habit forming drugs.");
		l2.setFont(f);
		 l1.setForeground(Color.white);
		 l2.setForeground(Color.white);
		add(l1);
		add(l2);
	}

}
