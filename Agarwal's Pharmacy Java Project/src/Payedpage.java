import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Payedpage extends JFrame implements ActionListener

{JButton b1;
         public Payedpage()
         
         
         {
        	 setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
 			setLocationRelativeTo(this);
 			//setDefaultCloseOperation(EXIT_ON_CLOSE);
 			setResizable(false);
           setLayout(null);
        	 
        	 
        	 JLabel l1=new JLabel("ORDER SUCCESFULLY PLACED");
        	 Font f=new Font(Font.SANS_SERIF,Font.ITALIC,40);
        	 b1=new JButton("HOMEPAGE");
        	 b1.setForeground(Color.white);
        	 b1.setBackground(new Color(  25, 201, 219  ));
        	 l1.setFont(f);
        	 l1.setBounds(700, 400, 700, 60);
        	 b1.setBounds(900,550,100,40);
        	 add(l1);
             add(b1);
             b1.addActionListener(this);
         }
	public static void main(String[] args) 
	{
		
	Payedpage p=new Payedpage();
	p.setVisible(true);
	
			

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			this.dispose();
			Logedpage p=new Logedpage();
			p.setVisible(true);
		}
		
	}

}
