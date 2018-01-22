import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Firstaidcare extends JFrame implements ActionListener
{
	JComboBox<String> c;
	JButton b1,b2;
	JLabel l1,l2;
	JTextField t1;
	public Firstaidcare()
	{
		//setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		setSize(900,750);
		setLocationRelativeTo(this);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		l2=new JLabel("First Aid Products");
		Font f5=new Font(Font.SANS_SERIF, Font.ITALIC, 35);
		l2.setFont(f5);
		
		setLayout(null);
		Font f1=new Font(Font.SANS_SERIF, Font.ITALIC, 14);
		Font f2=new Font(Font.SANS_SERIF, Font.ITALIC, 15);
		Font f3=new Font(Font.SANS_SERIF, Font.ITALIC, 18);
		Font f4=new Font(Font.SANS_SERIF, Font.ITALIC, 15);
		String string[]={"Dettol Anti-Septic Liquid (Rs.100/500ml bottle)","Band-Aid Strip (Rs.50/20strip pack)","Dettol Anti-Specific Liquid (Rs 30/110ml bottle)","Boroline Cream(Rs. 30/20mg tube)","volini Spray (Rs.200/100gm)","Betadin Tube (Rs.90/15gm tube)","Detton Soap(Rs26/70gm pcs,"};
		
		
	
		l1=new JLabel("QUANTITY");
		t1=new JTextField(20);
		b1=new JButton("ORDER");
		b2=new JButton("CANCEL");
		c=new JComboBox<String>(string);
		
		c.setFont(f1);
		b1.setFont(f3);
		b2.setFont(f3);
		l1.setFont(f2);
		t1.setFont(f4);
		
		b1.setForeground(Color.white);
	b2.setForeground(Color.white);
	t1.setForeground(Color.black);
	b1.setBackground(new Color(  25, 201, 219  ));
    b2.setBackground(new Color(  25, 201, 219  ));
    l2.setBounds(330,20,400,50);
    l1.setBounds(300,240,400,50);
    t1.setBounds(300,280,300,40);
    c.setBounds(310,150,270,40);
    b1.setBounds(300,380,100,40);
    b2.setBounds(450,380,120,40);
	    
	add(l2);	
    add(c);
		add(l1);
		add(t1);
		add(b1);
	add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b2)
		{
			
			this.dispose();Logedpage p=new Logedpage();
			p.setVisible(true);
			
		}
		if(e.getSource()==b1)
		{
String str=t1.getText();
Pattern pattern = Pattern.compile("\\d{1}");
Pattern pattern1 = Pattern.compile("\\d{2}");
Pattern pattern2 = Pattern.compile("\\d{3}");
Matcher matcher = pattern.matcher(str);
Matcher matcher1 = pattern1.matcher(str);
Matcher matcher2 = pattern2.matcher(str);
			
			if(str.length()==0)
			{
				JOptionPane.showMessageDialog(this, "Please Enter All details", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				
					if(!(matcher.matches()|| matcher1.matches() ||matcher2.matches()))
					{
						JOptionPane.showMessageDialog(this, "Enter Valid  No.","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					
					else	
					{
				try{
					
					//Driver
					Class.forName("com.mysql.jdbc.Driver");
				
					//eSTABLISH cONNECTION
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","lucky");
				
				//query
				String query="insert into medicine values(?,?)";
				String value=t1.getText();
				String name= c.getSelectedItem().toString();
				
				//prepare statement
				java.sql.PreparedStatement ps=con.prepareStatement(query);
				
				ps.setString(2, value);
				ps.setString(1, name);
				
				//execute
				int i=ps.executeUpdate();
				System.out.println(1+"1row effected");
				ps.close();
				con.close();
}
catch(Exception f)
{
System.out.println("nothing");
}
			this.dispose();Payment p1=new Payment();
			p1.setVisible(true);
		
			}
}
}
}
public static void main(String args[])
{
	Firstaidcare c=new Firstaidcare();
	c.setVisible(true);
	}
}
