import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Homepage1heading extends JPanel
{
	JLabel l1;
	public Homepage1heading()
	{setBackground(new Color( 37, 159, 36 ));

		//setBackground(new Color( 37, 159, 36 ));

		//setBackground(new Color(68, 127, 180 ));
		l1=new JLabel("Aggarwal's Pharmacy +");
		Font f=new Font(Font.SANS_SERIF,Font.ITALIC,60);
		l1.setFont(f);
		l1.setForeground(Color.white);
		add(l1);
		
		
}

}
