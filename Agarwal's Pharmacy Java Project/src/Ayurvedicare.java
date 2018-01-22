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
import javax.xml.bind.ParseConversionEvent;

import com.mysql.jdbc.PreparedStatement;


public class Ayurvedicare extends JFrame implements ActionListener
{
	JComboBox<String> c;
	JButton b1,b2;
	JLabel l1,l2;
	JTextField t1;
	
	public Ayurvedicare()
	{
		
		
		
		setSize(900,750);
		setLocationRelativeTo(this);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		

		l2=new JLabel("Ayurvedic Products");
		Font f5=new Font(Font.SANS_SERIF, Font.ITALIC, 35);
		l2.setFont(f5);
		add(l2);
		
		
		setLayout(null);
		Font f1=new Font(Font.SANS_SERIF, Font.ITALIC, 14);
		Font f2=new Font(Font.SANS_SERIF, Font.ITALIC, 15);
		Font f3=new Font(Font.SANS_SERIF, Font.ITALIC, 18);
		Font f4=new Font(Font.SANS_SERIF, Font.ITALIC, 15);
		String string[]={"Himalya Gaxes Tablet (Rs.90/100 Tablet pack.)","Himalya liv52 Tablet (Rs.200/100 Tablet pack.)","Jandu Vigorex Tablet (Rs 15/10tablet strip)","Vicks Balm (Rs. 30/10 mg tube)","Himalya Confido Tablet (Rs.100/60 tablet pack)","Jivak Tavak oil (Rs.60/20 ml bottle)","Himalya Himplasiya Tablet(Rs 115\30 tablet pack)","Dabur Honey (Rs.35/50 gm bottle"};
		
		
	
		l1=new JLabel("QUANTITY");
		t1=new JTextField(20);
		b1=new JButton("ORDER");
		b2=new JButton("CANCEL");
		c=new JComboBox<String>(string);
		
		c.setFont(f1);
		b1.setFont(f3);
		b2.setFont(f3);
		l1.setFont(f2);
		
		
		b1.setForeground(Color.white);
	b2.setForeground(Color.white);
	
	b1.setBackground(new Color(  25, 201, 219  ));
    b2.setBackground(new Color(  25, 201, 219  ));
    t1.setForeground(Color.black);
    t1.setFont(f4);
    l2.setBounds(300,20,400,50);
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

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource()==b2)
		{
			
			this.dispose();
			Logedpage p=new Logedpage();
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
           this.dispose();			
      Payment p1=new Payment();
			p1.setVisible(true);
		
			
}
}
}
	}
	public static void main (String args[])
	{
		Ayurvedicare c=new Ayurvedicare();
		c.setVisible(true);
	}
}
