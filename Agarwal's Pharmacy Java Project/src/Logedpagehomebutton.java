import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Logedpagehomebutton extends JPanel implements ActionListener
{

	JButton b1;
    public Logedpagehomebutton()
    {
    	//setBackground(new Color(71, 71, 75));
    	b1=new JButton("HOME");
    	b1.setBackground(new Color(  45, 76, 103 ));
    	b1.setForeground(Color.white);
    	  Font f=new Font(Font.SANS_SERIF,Font.ITALIC,22);
    	b1.setFont(f);
    	b1.setToolTipText("Cliclk to go Homepage");
    	
    	  add(b1);
    	b1.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e)
	{
        if(e.getSource()==b1)
        {
        	HomePage1 p=new HomePage1();
        	p.setVisible(true);// TODO Auto-generated method stub
        }
		
	}
	}


