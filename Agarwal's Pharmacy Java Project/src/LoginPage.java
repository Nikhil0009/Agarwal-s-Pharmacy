import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.ResultSet;


public class LoginPage extends JFrame implements ActionListener
{
	
	JLabel l1,l2,l3,l4,l5;
  JTextField t1,t2;
  JPasswordField p1;
  JButton b1,b2,b3;
public LoginPage()
{
	setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
	
	setLocationRelativeTo(this);
	//setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	getContentPane().setBackground(Color.white);
	//setBackground(new Color(  5, 5, 5));
	
	setLayout(null);
	l1=new JLabel("USERNAME ");
	l2=new JLabel("PASSWORD ");
	t1=new JTextField(20);
	t2=new JTextField();
	
	p1=new JPasswordField(20);
	b3=new JButton("CANCEL");
	l5=new JLabel("Not an existing User ?");
	l3=new JLabel(" Dashboard Login");
	ImageIcon ic =new ImageIcon("E:\\3.jpg");
	l4=new JLabel(ic);
	
	Font f=new Font(Font.SANS_SERIF,Font.BOLD,14);
	Font f1=new Font(Font.SANS_SERIF,Font.ITALIC,32);
	Font f2=new Font(Font.SANS_SERIF,Font.BOLD,23);
	Font f3=new Font(Font.SANS_SERIF,Font.ITALIC,15);
	Font f4=new Font(Font.SANS_SERIF,Font.ITALIC,17);

	b1=new JButton("LOGIN ");
	b2=new JButton("SIGN UP ");

	l4.setBounds(900, 50+50, 50, 100);
	l1.setBounds(725, 210+50, 150, 60);
	t1.setBounds(725, 255+50, 500, 35);
	l2.setBounds(725, 280+70, 200, 70);
	t2.setBounds(725, 325+50+25, 500, 35);
	b1.setBounds(1150, 395+60, 90, 40);
	b2.setBounds(725, 395+230, 100, 40);
	l3.setBounds(800, 120+50, 300, 70);
	l5.setBounds(725,440+100,400,50);
	b3.setBounds(940,595+30,120,40);

	t1.setFont(f4);
	t2.setFont(f4);
	
	l3.setFont(f1);
	l1.setFont(f);
	l2.setFont(f);
	l5.setFont(f2);
	b1.setFont(f3);
	b2.setFont(f3);
	b3.setFont(f3);
	
	b1.setForeground(Color.white);
	b2.setForeground(Color.white);
	l3.setForeground(Color.black);
	t1.setForeground(Color.black);
	t2.setForeground(Color.black);
	l1.setForeground(Color.black);
	l2.setForeground(Color.black);
	b3.setForeground(Color.white);

	//t1.setBackground(Color.white);
	//p1.setBackground(Color.white);
	//t1.setBackground(Color.white);
	//p1.setBackground(Color.white);
	b1.setBackground(new Color(  
			25, 201, 219  ));
    b2.setBackground(new Color( 
    		25, 201, 219  ));
	b3.setBackground(new Color( 
			25, 201, 219  ));
    l5.setBackground(Color.white);
    
	add(l4);
	add(l3);
	add(l1);
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b1);
	add(b2);
	add(l5);
	add(b3);
	b3.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);


	}


public void actionPerformed(ActionEvent e )

{
    if(e.getSource()==b1)
    {
    	
    	String str1=t1.getText();
    	//char[] str2=p1.getPassword();
    	//String str=str2.toString();
    	
    	String str=t2.getText();
    	//if(str1.length()==0 || str2.length==0)
    	//{
    	//	JOptionPane.showMessageDialog(this, "Please Fill All Data", "ERROR", JOptionPane.ERROR_MESSAGE);
    	//}
    	
    		
    	//else
    	
    	//{

    		
    			//if(str2.length<8)
    			//{
    			//	JOptionPane.showMessageDialog(this, "Password should of atleast 8 character", "ERROR", JOptionPane.ERROR_MESSAGE);
    			//}
    			//else
    			//{
    	try
    	{
    				//Driver
					Class.forName("com.mysql.jdbc.Driver");
				
					//eSTABLISH cONNECTION
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","lucky");
		               
				//query 
				//String query="insert into login values(?,?)";
				
				String username1=t1.getText();
				//char[] password=p1.getPassword();
				//String str3=password.toString();
				String str3=t2.getText();
			//prepare statement
				
				String str9="select * from signup";
				java.sql.Statement ps=con.createStatement();
				java.sql.ResultSet res=ps.executeQuery(str9);
	              String name = null,pas=null;			
				int flag=0;
	              while(res.next())
				{
					name=res.getString(2);
					 pas=res.getString(3);
					 //System.out.println("username "+name);
					 //System.out.println("pas	"+pas); 
					 
					
	            		 
	            		
					if((username1.equalsIgnoreCase(name)) && (str3.equals(pas)))
						{
							
						flag=1;
						}
    	
				}	
				
    	if(flag==1)
    	{
    	
    		 this.dispose();
				Logedpage p1=new Logedpage();
		p1.setVisible(true);

			}
    	else
    	{
    		JOptionPane.showMessageDialog(this, "PLEASE ENTER CORRECT USERNAME  OR PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
    	}
	            	
    	}
    	
    	 catch(Exception f)
    	    {
    	    	
    	    }
    			
    			
    }
    
    			
   
    			
    	
    	
    	
    
      if(e.getSource()==b2)
      {
    	  
    	  this.dispose();
    	  Signup up1=new Signup();
            up1.setVisible(true);
            
     
      }
            
           if(e.getSource()==b3)
           {
        	   this.dispose();
        	   HomePage1 p=new HomePage1();
               p.setVisible(true);
              
           
      }  
    	
}

  public static void main(String[] args)
  {
	  LoginPage p9=new LoginPage();
	  p9.setVisible(true);
  }

}
