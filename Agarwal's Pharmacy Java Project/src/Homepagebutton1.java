import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Homepagebutton1 extends JPanel implements ActionListener
{
	 JButton b1,b2;
	public Homepagebutton1()
	{setBackground(new Color( 37, 159, 36 ));

		// setBackground(new Color( 68, 127, 180  ));
		   b1=new JButton("LOGIN");
		   b2=new JButton("SIGNUP");
		   Font f=new Font(Font.SANS_SERIF,Font.ITALIC,16);
		   //b1.setBackground(new Color(45, 76, 103  )); 
		   b1.setFont(f);
		   b2.setFont(f);
		   
		   // b2.setBackground(new Color( 45, 76, 103 ));
		    b2.setBackground(Color.black);
		    b1.setBackground(Color.black);
		   b1.setForeground(Color.white);
			   b2.setForeground(Color.white);
			   add(b1);
			   add(b2);
			   b1.addActionListener(this);
			   b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
			
		{ 	HomePage1 h=new HomePage1();
		h.dispose();
			LoginPage p=new LoginPage();
			
			p.setVisible(true);
			
			
		}
		if(e.getSource()==b2)
		{
			Signup p1=new Signup();
			p1.setVisible(true);
			}

}
}
