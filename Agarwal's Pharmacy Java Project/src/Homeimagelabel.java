import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Homeimagelabel extends JPanel implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1;
	
	public Homeimagelabel()
	{
		setBackground(new Color( 37, 159, 36 ));
		b1=new JButton(" CERTIFICATE  ");
		  Font f=new Font(Font.SANS_SERIF,Font.ITALIC,24);
		  b1.setBackground(Color.black);
		  b1.setFont(f);
		 // b1.setBounds(1100, 700, 70, 40);
		  b1.setBackground(new Color(37, 159, 36 ));
		  b1.setForeground(Color.white);
		  
		Font f2=new Font(Font.SANS_SERIF,Font.ITALIC,27);
		setLayout(new GridLayout(10,1));
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		
		
		  
		l4=new JLabel("Online pharmacies laws in India are still in nascent stage and there are no dedicated online pharmacy laws in India. The Information Technology Act 2000");
	     l5=new JLabel("governs some of the legal issues pertaining to online dealings but it is silent on the aspect of online pharmacy. As a result, illegal online pharmacies have");
	   
		l6=new JLabel("been increasing in India.If properly regulated, Online pharmacies in India could prove beneficial to various stakeholders.The Drugs and Cosmetics Act,1945");
		
		l7=new JLabel(" and the Drugs and Cosmetics Rules, 1945 have guidelines on the sale of Schedule H and Schedule X drugs.These can be sold only on prescription and ");
		l8=new JLabel(" there are specific rules, including for labelling. As most of the online pharmacies in India are not complying with Indian laws and the laws of other jurisdictions");
		l9=new JLabel("they have been facing regulatory sanctions. Media reports claim that some of the online pharmacies are even controlled by organised criminal networks.");
		l10=new JLabel("                                                        This Aggarwal's Pharmacy is fully Legal ,Secured and Trustable. To check click on Certificate.");
		
		
		Font f1=new Font(Font.SANS_SERIF,Font.ITALIC,27);
		
		
		
		l4.setForeground(Color.white);
		//l4.setForeground(Color.white);
	
		l5.setForeground(Color.white);
		l6.setForeground(Color.white);
		l7.setForeground(Color.white);
		l8.setForeground(Color.white);
		l9.setForeground(Color.white);
		l10.setForeground(Color.white);
		
		
		l4.setFont(f2);
		l5.setFont(f2);
		l6.setFont(f2);
		l7.setFont(f2);
		l8.setFont(f2);
		l9.setFont(f2);
		l10.setFont(f1);
		
		add(l1);
		//add(l2);
		//add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
	    add(l8);
	    add(l9);
	add(l10);
	add(b1);
	b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b1)
		{
			ViewCertificate c=new ViewCertificate();
			c.setVisible(true);
		}
		// TODO Auto-generated method stub
		
	}
        
}
