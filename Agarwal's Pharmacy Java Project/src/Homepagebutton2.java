import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Homepagebutton2 extends JPanel implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JButton b1;
	public Homepagebutton2()
	{setBackground(new Color( 37, 159, 36 ));

		//setBackground(new Color( 68, 127, 180  ));
		   b1=new JButton("ABOUT US");
		   l1=new JLabel("HOME");
		   Font f=new Font(Font.SANS_SERIF,Font.ITALIC,16);
		  b1.setBackground(Color.black);
		  // b1.setBackground(new Color(45, 76, 103  )); 
		   b1.setForeground(Color.white);
		   l1.setForeground(Color.black);
		   l2=new JLabel("");
		   l3=new JLabel("");
		   l4=new JLabel("");
		   Font f1=new Font(Font.SANS_SERIF,Font.BOLD,25);
		   
		   b1.setFont(f);
		   l1.setFont(f1);
		   add(l1);
		   add(l2);
		   add(l3);
		   add(l4);
		   add(b1);
	b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==b1)
		{
			Aboutus l1=new Aboutus();
			l1.setVisible(true);
		}
		
	}

}
