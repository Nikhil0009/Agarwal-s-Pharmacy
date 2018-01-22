import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;



public class HomeLeftimage extends JPanel implements ActionListener
{

	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	public HomeLeftimage()
	{

		//setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		//setLocationRelativeTo(this);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		setLayout(new GridLayout(4,3));
		ImageIcon ic1=new ImageIcon("Elderly.png");
	    ImageIcon ic2=new ImageIcon("Pain.png");
		ImageIcon ic3=new ImageIcon("Diabetes.png");
	    ImageIcon ic4=new ImageIcon("Ayurveda.png");
		ImageIcon ic5=new ImageIcon("baby.png");
		ImageIcon ic6=new ImageIcon("Aid.png");
		ImageIcon ic7=new ImageIcon("Vitamin.png");
		ImageIcon ic8=new ImageIcon("4_1sep.png");
		
		b1=new JButton(ic1);
		b2=new JButton(ic2);
		b3=new JButton(ic3);
		b4=new JButton(ic4);
		b5=new JButton(ic5);
		b6=new JButton(ic6);
		b7=new JButton(ic7);
		b8=new JButton(ic8);
	
		
		
		
				
				
		
		b1.setToolTipText("Click here to place Order");
		b2.setToolTipText("Click here to place Order");
		b3.setToolTipText("Click here to place Order");
		b4.setToolTipText("Click here to place Order");
		b5.setToolTipText("Click here to place Order");
		b6.setToolTipText("Click here to place Order");
		b7.setToolTipText("Click here to place Order");
		b8.setToolTipText("Click here to place Order");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			Eldercare p=new Eldercare();
			p.setVisible(true);
		}
		
		if(e.getSource()==b2)
		{
			Paincare p1=new Paincare();
			p1.setVisible(true);
		}
	     
	      if(e.getSource()==b3)
	      {
	    	  Diabetescare p2=new Diabetescare();
	    	  p2.setVisible(true);
	      }
	        if(e.getSource()==b4)
	        {
	        	Ayurvedicare p3=new Ayurvedicare();
	        	p3.setVisible(true);
	        }
	           if(e.getSource()==b5)
	           {
	        	   Babycare p4=new Babycare();
	        	   p4.setVisible(true);
	           }
	           if(e.getSource()==b6)
	           {
	        	   Firstaidcare p5=new Firstaidcare();
	        	   p5.setVisible(true);
	           }
	            if(e.getSource()==b7)
	            {
	            	Vitamincare p6=new Vitamincare();
	            	p6.setVisible(true);
	            }
	            if(e.getSource()==b8)
	            {
	            	Proteincare p7=new Proteincare();
	            	p7.setVisible(true);
	            }
	
}
	

	
	
}
