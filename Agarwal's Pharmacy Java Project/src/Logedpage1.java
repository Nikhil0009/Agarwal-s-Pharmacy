import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Logedpage1 extends JPanel
{
Logedpageheading  h;

Logedpagebutton b;
public Logedpage1()
{
     h=new Logedpageheading();
	b=new Logedpagebutton();
	setLayout(new BorderLayout());

	add("North",h);

	add("South",b);
}
	
	

}
