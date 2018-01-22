import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Logedpageheading extends JPanel
{
JLabel l1;

public Logedpageheading()
{
	l1=new JLabel("    Aggarwal's Pharmacy +");
	
	Font f=new Font(Font.SANS_SERIF,Font.ITALIC,60);
	setBackground(new Color( 68, 127, 180) );
	l1.setForeground(Color.white);
	l1.setFont(f);
	add(l1);
		
}

}


















