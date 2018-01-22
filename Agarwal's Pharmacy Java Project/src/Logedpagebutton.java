import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Logedpagebutton extends JPanel implements ActionListener
{

JButton b1,b2,b3;	
	
	 
public Logedpagebutton()
{
	setLayout(new FlowLayout());
	setBackground(new Color( 68, 127, 180 ) );
	b1=new JButton("CONTACT US");
	b2=new JButton("LOGOUT");
	

	b1.setBackground(new Color(   45, 76, 103   )); 
			

			
    
    		
 
	b2.setBackground(new Color(  45, 76, 103    )); 
	
	Font f=new Font(Font.SANS_SERIF,Font.ITALIC,18);
	
	b1.setForeground(Color.white);
	 
	b2.setForeground(Color.white);

	 
	   b1.setFont(f);
	   b2.setFont(f);
	  
	 
	
	add(b1);
   add(b2);
  
   b1.addActionListener(this);
   b2.addActionListener(this);
   
   
}
 


@Override
public void actionPerformed(ActionEvent a) 
{
	if(a.getSource()==b1)
	{
		 Contactus1 c=new Contactus1();
         c.setVisible(true);
       
	}
if(a.getSource()==b2)
{
	HomePage1 p=new HomePage1();
	p.setVisible(true);
}
   


}

}
