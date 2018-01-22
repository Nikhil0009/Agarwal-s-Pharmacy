import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.ExecutionException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Contactus1 extends JFrame implements ActionListener
{
          JLabel l1,l2,l3,l4,l5,l6;
          JTextField t1,t2;
          JTextArea ta;
          JButton b1,b2;
	public Contactus1()
	{
		setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
 		setLocationRelativeTo(this);
 		//setDefaultCloseOperation(EXIT_ON_CLOSE);
 		setResizable(false);
		setLayout(null);
		
l6=new JLabel(" Contact Us");
		
		
		Font f6=new Font(Font.SANS_SERIF, Font.ITALIC, 45);
		l6.setFont(f6);
		l6.setForeground(Color.black);
		setBackground( Color.white);
		
		
		
		
		
		
		
		setBackground(Color.white);
		l1=new JLabel(" Name");
		l2=new JLabel("Your Email");
		t1=new JTextField(20);
		t2=new JTextField(20);
		l3=new JLabel("Message");
		ta=new JTextArea(3, 2); 
		 JScrollPane p1=new JScrollPane(ta);
		  b1=new JButton("SEND");
	      b2=new JButton("CANCEL");
	      l4=new JLabel("EMAIL US:      aggarwal26lucky@gmail.com");
	      l5=new JLabel("CONTACT US:    8290019678");
	
	      l6.setBounds(795, 25, 450, 100);
	      b1.setBounds(820, 640, 80, 40);
	      b2.setBounds(950, 640, 80, 40);
	      l1.setBounds(805, 190, 150, 100);
		t1.setBounds(805, 255, 250, 30);
		l2.setBounds(805, 310, 150, 20);
        t2.setBounds(805,335,250,30);	
        l3.setBounds(805,380,200,50);
        p1.setBounds(804,425,440,170);
        l4.setBounds(805,730,400,50);
        l5.setBounds(805,780,400,50);
       
        Font f=new Font(Font.SANS_SERIF,Font.ITALIC,17);
        l1.setFont(f);
        l2.setFont(f);
        t1.setFont(f);
        t2.setFont(f);
        ta.setFont(f);
        Font f1=new Font(Font.SANS_SERIF,Font.ITALIC,17);
        l3.setFont(f1);
        
        b1.setBackground(new Color(  25, 201, 219  ));
        b2.setBackground(new Color(  25, 201, 219  ));
        
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);
     
      
     
      
     
      Font f2=new Font(Font.SANS_SERIF,Font.ITALIC,20);
      l4.setFont(f2);
      l5.setFont(f2);
      
      add(l6);  
      add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(p1);
        add(l4);
        add(l5);
        add(b1);
        add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
}
	public void actionPerformed(ActionEvent e)
	{
	         if(e.getSource()==b1)
	         {
	        	 String s1=t1.getText();
	        	 String s2=t2.getText();
	        	 String s3=ta.getText();
	        
	        	 if(s1.length()==0 || s2.length()==0 || s3.length()==0)
	        	 {
	        		 JOptionPane.showMessageDialog(this, "Please Fill All Data","ERROR",JOptionPane.ERROR_MESSAGE);
	        	 }
	        	 else
	        	 {
	        		 try{
							
							//Driver
							Class.forName("com.mysql.jdbc.Driver");
						
							//eSTABLISH cONNECTION
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","lucky");
	        	
	        		 //query
						 String query="insert  into contact values(?,?,?)";
						 String name=t1.getText();
						 String mail=t2.getText();
						 String address=ta.getText();
						 
	        		 //prepare statement
						 
	        		 java.sql.PreparedStatement ps=con.prepareStatement(query);
	        		 ps.setString(1, name);
	        		 ps.setString(2, mail);
	        		 ps.setString(3, address);
	        		 
	        		 //execute
	        		 int i=ps.executeUpdate();
	        		 System.out.println(1+"i row effected");
	        		 ps.close();
	        		 con.close();
	        		 }
	        			catch(Exception f)
						{
							System.out.println(f);
						}
	        		 
	        		 this.dispose();
	        		 Submit s=new Submit();
	        		 s.setVisible(true);
	        		 
	        		 
	        		 }
	         }
		            if(e.getSource()==b2)
		            {
		this.dispose();
		            	Logedpage p=new Logedpage();
		p.setVisible(true);
	}
	}
	public static void main(String args[])
	{
		Contactus1 c=new Contactus1();
	c.setVisible(true);
	}
}
