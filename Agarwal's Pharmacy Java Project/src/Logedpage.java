import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Logedpage extends JFrame
{
	
	Logedpage1 l;
	HomeLeftimage h;
	Logedpagehomebutton l1;
	public Logedpage()
	{

		setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		setLocationRelativeTo(this);
		setResizable(false);
		setLayout(new BorderLayout());
		l=new Logedpage1();
		l1=new Logedpagehomebutton();
		h=new HomeLeftimage();
		add("North",l);
		add("South",l1);
		add("Center",h);
		
	}
	

	
	public static void main(String[] args) {
		Logedpage p=new Logedpage();
		p.setVisible(true);
	}

}
