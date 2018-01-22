import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Aboutus1 extends JFrame implements ActionListener
{
	

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l20,l21,l22,l23,l24,l25,l26,l27; 
    JButton b1;
    public Aboutus1()
    {
    	setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		setLocationRelativeTo(this);
		
		setResizable(false);
		setBackground(new Color( 37, 159, 36 ));
		Font f=new Font(Font.SANS_SERIF,Font.ITALIC,23);
		Font f1=new Font(Font.SANS_SERIF,Font.ITALIC,27);
		Font f2=new Font(Font.SANS_SERIF,Font.ITALIC,31);
		setLayout(new GridLayout(27,1));
		l1=new JLabel("Pharmacy is the science and technique of preparing and dispensing drugs.It is a health profession that links health sciences with chemical sciences and aims to ensure the safe and   ");
		l2=new JLabel("effective use of pharmaceutical drugs. The scope of pharmacy practice includes more traditional roles such as compounding and dispensing medications, and it also includes more ");
		l3=new JLabel("modern services related to health care, including clinical services, reviewing medications for safety and efficacy, and providing drug information. Pharmacists, therefore, are the  ");
		l4=new JLabel("reviewing medications for safety and efficacy, and providing drug information. Pharmacists, therefore, are the related to health care,including clinical services,experts on drug   ");
		l5=new JLabel("therapy and are the primary health professionals who optimize use of medication for the benefit of the patients.An establishment in which pharmacy (in the first sense) is practiced ");
		l6=new JLabel(" is called a pharmacy (this term is more common in the United States) or a chemist's (which is more common in Great Britain). In the United States and Canada,  drugstores commonly ");
		l7=new JLabel("sell drugs, as well as miscellaneous items such as confectionery,cosmetics, office supplies, and magazines and occasionally refreshments and groceries.The word pharmacy is");
		l8=new JLabel("derived from its root word pharma which was a term used since the 15th–17th centuries. However, the original Greek roots from pharmakos simply sorcery or even poison. ");
		l9=new JLabel("In addition to pharma responsibilities, the pharma offered general medical advice and a range of services that are now performed solely by other specialist practitioners, ");
		l10=new JLabel(" such as surgery and midwifery MEDICINE.The word medicine is derived from Latin medicus, meaning a physician. Medicine encompasses a variety of health care practices evolved to ");
		l11=new JLabel("maintain and restore health by the prevention and treatment of illness. Contemporary medicine applies biomedical sciences, biomedical research, genetics, and medical technology to ");
		l12=new JLabel(" diagnose, treat, and prevent injury and disease, typically through pharmaceuticals or surgery, but also through therapies as diverse as psychotherapy, external splints and traction");
		l13=new JLabel("medical devices, biologics, and ionizing radiation, amongst others Medical availability and clinical practice varies across the world due to regional differences in culture and ");
		l14=new JLabel("technology. Modern scientific medicine is highly developed in the Western world, while in developing countries such as parts of Africa or Asia, the population may rely more");
		l15=new JLabel("heavily on traditional medicine with limited evidence and efficacy and no required formal training for practitioners. ");
		l16=new JLabel(" The clinical examination involves the study of: ");
		l17=new JLabel("   ");
		l18=new JLabel(" ");
		//l19=new JLabel("                                        ");
		l20=new JLabel("        1) Vital signs including height, weight, body temperature, blood pressure, pulse, respiration rate, and hemoglobin oxygen saturation");
		l21=new JLabel("        2)General appearance of the patient and specific indicators of disease (nutritional status, presence of jaundice, pallor or clubbing)");
		l22=new JLabel("        3) Head, eye, ear, nose, and throat (HEENT)");
		l23=new JLabel("Working together as an interdisciplinary team, many highly trained health professionals besides medical practitioners are involved in the delivery of modern health care. Examples   ");
		l24=new JLabel("include: nurses, emergency medical technicians and paramedics, laboratory scientists, pharmacists, podiatrists, physiotherapists, respiratory therapists, speech therapists, occupational  ");
		l25=new JLabel("therapists, radiographers, dietitians, and bioengineers, surgeons, surgeon's assistant, surgical technologist.");
		l26=new JLabel("Our Mission is to make healthcare understandable, accessible and affordable. Agarwal Pharmacy is located in Jaipur, Shop no.D 100, Near Ajmeri Gate." );
		l27=new JLabel("                                                                                                       About Us");
		
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l4.setForeground(Color.white);
		l5.setForeground(Color.white);
		l6.setForeground(Color.white);
		l7.setForeground(Color.white);
		l8.setForeground(Color.white);
		l9.setForeground(Color.white);
		l10.setForeground(Color.white);
		l11.setForeground(Color.white);
		l12.setForeground(Color.white);
		l13.setForeground(Color.white);
		l14.setForeground(Color.white);
		l15.setForeground(Color.white);
		l16.setForeground(Color.white);
		l17.setForeground(Color.white);
		l18.setForeground(Color.white);
		//l19.setForeground(Color.white);
		l20.setForeground(Color.white);
		l21.setForeground(Color.white);
		l22.setForeground(Color.white);
		l23.setForeground(Color.white);
		l24.setForeground(Color.white);
		l25.setForeground(Color.white);
		l26.setForeground(Color.white);
		l27.setForeground(Color.white);
		//l28.setForeground(Color.white);
		
		
		
		
		
		b1=new JButton("HOMEPAGE");
		
		b1.setBackground(new Color( 37, 159, 36 ));
		
		l26.setFont(f1);
		l27.setFont(f2);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);
		l7.setFont(f);
		l8.setFont(f);
		l9.setFont(f);
		l10.setFont(f);
		l11.setFont(f);
		l12.setFont(f);
		l13.setFont(f);
		l14.setFont(f);
		l15.setFont(f);
		l16.setFont(f);
		l17.setFont(f);
		l18.setFont(f);
		//l19.setFont(f);
		l20.setFont(f);
		l21.setFont(f);
		l22.setFont(f);
		l23.setFont(f);
		l24.setFont(f);
		l25.setFont(f);
		
		//l28.setFont(f);
		
		
		
		b1.setForeground(Color.black);
		
		b1.setFont(f2);
		
		
		
		
		
		
		
		
		
		
		
		add(l27);
		 add(l17);
	     
	     //add(l19);
		add(l26);
	     
		add(l1);
		add(l2);
	 	add(l3);
	     add(l4);
	     add(l5);
	     add(l6);
	     add(l7);
	     add(l8);
	     add(l9);
	     add(l10);
	     add(l11);
	     add(l12);
	     add(l13);
	     add(l14);
	     add(l15);
	     add(l16);
	    
	     add(l20);
	     add(l21);
	     add(l22);
	     
	     add(l23);
	     add(l24);
	     add(l25);
	     add(l18);
	     add(b1);
	     b1.addActionListener(this);
    }
    public static void main(String[] args)
	{

Aboutus1 i=new Aboutus1();
i.setVisible(true);

	}
	
    @Override
	public void actionPerformed(ActionEvent a)
    {
    	if(a.getSource()==b1)
    	{
    		HomePage1 p1=new HomePage1();
    		p1.setVisible(true);
    	}
		
		
	}

	
}
