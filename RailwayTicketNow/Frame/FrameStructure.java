package Frame;
import Passenger.*;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FrameStructure extends JFrame implements MouseListener, ActionListener{
	
	private Font f1, f2, f3 ;
	private Color c1, c2, c3 ;
	private JPanel panel1, panel2, panel3 ;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17 ;
	private JTextField tf1 ;
	private JPasswordField pf1 ;

	private JButton bt1 , bt2, bt3 ;
	private JRadioButton rb1, rb2 ;
	private ButtonGroup bg1, bg2, bg3 ;
	private JCheckBox cb1, cb2, cb3, cb4 , cb5, cb6, cb7 ;
	private JComboBox combo1, combo2 ;
	private JTextArea ta1, ta2 ; 
	
	private JScrollPane scroll ;
	
	private ImageIcon img1, img2, img3, img4 ;

	public FrameStructure(){
		
		// Frame
		super("TicketNow.com") ; 
		//super.setSize( 800, 400 ) ;
		super.setBounds( 370, 90 , 1200, 900 ) ;
		//1920 x 1080

		// Font
		f1 = new Font("Cambria", Font.BOLD, 30); // For Head line
		f2 = new Font("Cambria", Font.BOLD, 20); // For All-lebels
		f3 = new Font("Cambria", Font.BOLD, 23); // For lebels

		// Colour
		c1 = new Color(255, 128, 9); // For Head line - Foreground
		c2 = new Color( 0, 102, 0 );  // For Head line - Background
		c3 = new Color( 102, 255, 255 );

		// panel-1
		panel1 = new JPanel() ;
		panel1.setLayout( null ) ;
		panel1.setBounds( 0, 40, 650, 860 );
	 

		// panel-2
		panel2 = new JPanel();
		panel2.setLayout( null );
		panel2.setBounds( 650, 40, 550, 860 );
		panel2.setBackground(c3);

		// panel-3
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds( 0, 0, 1200, 40 );
		panel3.setBackground(c2);

		label1 = new JLabel("Buy Train Ticket Online, Easily !");
		label1.setBounds( 400, 0 , 600, 40 ) ;
		label1.setFont(f1);
		label1.setForeground(c1);
		panel3.add(label1) ;

		//Name
		label2 = new JLabel("Name  : ");
		label2.setBounds( 80, 15 , 150, 30 ) ;
		label2.setFont(f2);
		label2.setForeground(c1);
		// label2.setBackground(c1);
		panel1.add(label2) ;

		tf1 = new JTextField();
		tf1.setBounds(200 , 15, 200, 30);
		tf1.setFont(f2);
		panel1.add(tf1);

		//Mobile Number
		label3 = new JLabel("Mobile number  : ");
		label3.setBounds( 80, 65 , 200, 30 ) ;
		label3.setFont(f2);
		label3.setForeground(c1);
		panel1.add(label3) ;

		pf1 = new JPasswordField();
		pf1.setBounds(250 , 65, 150, 30);
		pf1.setFont(f2);
		pf1.setEchoChar('*');
		pf1.addActionListener(this);
		panel1.add(pf1);
		
		
		//button 3
		bt3 = new JButton("Show");
		bt3.setBounds(430, 65, 100, 30);
		bt3.setFont(f2);
		bt3.setForeground(c1);
		//bt1.setOpaque(true);
		bt3.addActionListener(this);
		panel1.add(bt3);
		
		//Radio Button
		label4 = new JLabel("Are you a Bangladeshi citizen ? ");
		label4.setBounds( 80, 115 , 300, 30 ) ;
		label4.setFont(f2);
		label4.setForeground(c1);
		panel1.add(label4) ;

		rb1 = new JRadioButton("Yes");
		rb1.setBounds( 80, 150, 70, 30 );
		rb1.setFont(f2);
		panel1.add(rb1);

		rb2 = new JRadioButton("NO");
		rb2.setBounds( 150, 150, 100, 30 );
		rb2.setFont(f2);
		panel1.add(rb2);

		bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);

		//Cheack Box
		label5 = new JLabel("Choose Facilities  : ");
		label5.setBounds(80, 200, 250, 30);
		label5.setFont(f2);
		label5.setForeground(c1);
		panel1.add(label5);

		cb1 = new JCheckBox("Window Seat");
		cb1.setBounds(80, 230, 200, 30);
		cb1.setFont(f2);
		panel1.add(cb1);

		cb2 = new JCheckBox("Food Service");
		cb2.setBounds(80, 260, 200, 30);
		cb2.setFont(f2);
		panel1.add(cb2);

		cb3 = new JCheckBox("Women Cabin");
		cb3.setBounds(80, 290, 200, 30);
		cb3.setFont(f2);
		panel1.add(cb3);

		cb4 = new JCheckBox("Male Cabin");
		cb4.setBounds(80, 320, 200, 30);
		cb4.setFont(f2);
		panel1.add(cb4);

		bg2 = new ButtonGroup();
		bg2.add(cb3);
		bg2.add(cb4);

		//From
		label6 = new JLabel("From : ");
		label6.setBounds( 80, 370 , 100, 30 ) ;
		label6.setFont(f2);
		label6.setForeground(c1);
		panel1.add(label6) ;

		String items1[] = new String[] { "", "Dhaka", "Chittagong", "Rajshahi", "Khulna", "Sylhet" };
		combo1 = new JComboBox(items1);
		combo1.setBounds( 150, 370, 130, 30);
		combo1.setFont(f2);
		panel1.add(combo1);

		//To
		label7 = new JLabel("To : ");
		label7.setBounds( 300, 370 , 100, 30 ) ;
		label7.setFont(f2);
		label7.setForeground(c1);
		panel1.add(label7) ;

		String items2[] = new String[] { "", "Dhaka", "Chittagong", "Rajshahi", "Khulna", "Sylhet" };
		combo2 = new JComboBox(items2);
		combo2.setBounds( 350, 370, 130, 30);
		combo2.setFont(f2);
		panel1.add(combo2);

		// Text Area
		label8 = new JLabel("Give us feedback:") ;
		label8.setBounds( 80, 550 , 200, 30 ) ;
		label8.setFont(f3) ;
		label8.setForeground(c1);
		panel1.add(label8) ;

		ta1 = new JTextArea();
		ta1.setBounds( 80, 580, 430, 150);
		ta1.setFont(f2);
		panel1.add(ta1);
		
		ta2 = new JTextArea();
		ta2.setBounds( 20, 300, 500, 380);
		ta2.setFont(f2);
		panel2.add(ta2);
		
		scroll = new JScrollPane(ta2);
		scroll.setBounds(20, 520, 500, 270);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel2.add(scroll);

		// Image
		label13 = new JLabel("Select Class");
		label13.setBounds( 160, 0, 200, 50 );
		label13.setFont(f3);
		label13.setForeground(c1);
		panel2.add(label13);
		

		img2 = new ImageIcon("Picture/SovonChair3.png");
		label10 = new JLabel(img2);
		label10.setBounds( 20, 40, 200, 150 );
		panel2.add(label10);

		img3 = new ImageIcon("Picture/SnigdhaChair3.png");
		label11 = new JLabel(img3);
		label11.setBounds( 20, 200, 200, 150 );
		panel2.add(label11);

		img4 = new ImageIcon("Picture/AcChair3.png");
		label12 = new JLabel(img4);
		label12.setBounds( 20, 350, 200, 150 );
		panel2.add(label12);
		

		// Cheack-Box
		cb5 = new JCheckBox("Sovon");
		cb5.setBounds( 230, 100, 100, 30 );
		cb5.setFont(f2);
		cb5.setForeground(c1);
		panel2.add(cb5);
		//lebel
		label14 = new JLabel("Price : 500 tk");
		label14.setBounds( 230, 130, 150, 30 );
		label14.setFont(f2);
		label14.setForeground(c1);
		panel2.add(label14);
		
		// Cheack-Box
		cb6 = new JCheckBox("Snigdha");
		cb6.setBounds( 230, 250, 100, 30 );
		cb6.setFont(f2);
		cb6.setForeground(c1);
		panel2.add(cb6);
		//lebel
		label15 = new JLabel("Price : 1500 tk");
		label15.setBounds( 230, 280, 150, 30 );
		label15.setFont(f2);
		label15.setForeground(c1);
		panel2.add(label15);

		// Cheack-Box
		cb7 = new JCheckBox("AC");
		cb7.setBounds( 230, 400, 100, 30 );
		cb7.setFont(f2);
		cb7.setForeground(c1);
		panel2.add(cb7);
		//lebel
		label16 = new JLabel("Price : 2000 tk");
		label16.setBounds( 230, 430, 150, 30 );
		label16.setFont(f2);
		label16.setForeground(c1);
		panel2.add(label16);

		bg3 = new ButtonGroup();
		bg3.add(cb5);
		bg3.add(cb6);
		bg3.add(cb7);


		//Submit
		bt1 = new JButton("Submit");
		bt1.setBounds(80, 755, 150, 30);
		bt1.setFont(f2);
		bt1.setBackground(c1);
		bt1.addMouseListener(this);
		bt1.addActionListener(this);
		panel1.add(bt1);

		bt2 = new JButton("Cancle");
		bt2.setBounds(250, 755, 150, 30);
		bt2.setFont(f2);
		bt2.setBackground(c1);
		bt2.addMouseListener(this);
		bt2.addActionListener(this);
		panel1.add(bt2);
		
		img1 = new ImageIcon("Picture/MyTrain3.png");
		label9 = new JLabel(img1);
		label9.setBounds( 0, 0, 800, 860 );
		panel1.add(label9);
		
		super.add(panel1);
		super.add(panel2);
		super.add(panel3);
	}

	boolean turnOn = true ;
	public void mouseClicked(MouseEvent me) {
		if( (me.getSource() == bt1) && ( turnOn ) ){
			bt1.setText("Submited !");
			bt1.setBackground(Color.GREEN);
			bt1.setForeground(Color.WHITE);
			turnOn = false ;
		}

		if( (me.getSource() == bt2) && ( turnOn ) ){
			bt2.setText("Canceled !");
			bt2.setBackground(Color.RED);
			bt2.setForeground(Color.WHITE);
			turnOn = false ;
		}
	}
	public void mousePressed(MouseEvent me) {

	}
	public void mouseReleased(MouseEvent me) {

	}
	public void mouseEntered(MouseEvent me) {
		if( (me.getSource() == bt1) && ( turnOn )){
			bt1.setBackground(Color.GREEN);
		}
		if( (me.getSource() == bt2) && ( turnOn ) ){
			bt2.setBackground(Color.RED);
		}
	}
	public void mouseExited(MouseEvent me) {
		if( (me.getSource() == bt1) && ( turnOn ) ){
			bt1.setBackground(c1);
		}
		if( (me.getSource() == bt2) && ( turnOn )){
			bt2.setBackground(c1);
		}
	}
	
	
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == bt2)
		{
			System.exit(0);
		}
		
		if(ae.getSource() == bt3)
		{
			pf1.setEchoChar((char)0);
		}
		
		
		if(ae.getSource() == bt1)
		{
			//JOptionPane.showMessageDialog(this,"Showing!");
			String name;
			String mobileNumber;
			String citizenship;
			String facilities;
			String fromStation;
			String toStation;
			String feedback;
			String seatClass;
			String seatPrice;
			
			name = tf1.getText();
			mobileNumber = pf1.getText();
			
			if(rb1.isSelected()){ citizenship = rb1.getText(); }
			else if(rb2.isSelected()) { citizenship = rb2.getText(); }
			else { citizenship = ""; }
			
			if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected() )
			{
				facilities = cb1.getText()+", "+cb2.getText()+" and "+cb3.getText() ;
			}
			else if(cb1.isSelected() && cb2.isSelected() && cb4.isSelected()){
				facilities = cb1.getText()+", "+cb2.getText()+" and "+cb4.getText() ;
			}
			else if(cb1.isSelected()) { facilities = cb1.getText(); }
			else if(cb2.isSelected()) { facilities = cb2.getText(); }
			else if(cb3.isSelected()) { facilities = cb3.getText(); }
			else if(cb4.isSelected()) { facilities = cb4.getText(); }
			else { facilities = ""; }
			
			fromStation = combo1.getSelectedItem().toString();
			toStation = combo2.getSelectedItem().toString();
			
			feedback = ta1.getText();
			
			if( cb5.isSelected() ){seatClass = cb5.getText(); seatPrice = label14.getText() ; }
			else if( cb6.isSelected()){seatClass = cb6.getText(); seatPrice = label15.getText() ;}
			else if( cb7.isSelected()){seatClass = cb7.getText(); seatPrice = label16.getText() ; }
			else { seatClass = "" ; seatPrice = "" ; }
			
			
			if(name.isEmpty() || mobileNumber.isEmpty() || citizenship.isEmpty() || facilities.isEmpty() || fromStation.isEmpty() || toStation.isEmpty() || feedback.isEmpty() || seatClass.isEmpty() || seatPrice.isEmpty() )
			{
				JOptionPane.showMessageDialog(this,"Please fill up all information!");
			}
			else 
			{
				PassengerInfo obj1 = new PassengerInfo(name,mobileNumber,citizenship,facilities,fromStation,toStation,feedback,seatClass, seatPrice);
				obj1.insertInfo();
				JOptionPane.showMessageDialog(this,"Information saved!");
				check();
			}
			
		}
		
	}
	
	private void check() {
        try {
            File file = new File("Data/userdata.txt");
            if (file.exists()) {
				FileReader fr = new FileReader(file); //reads one character at a time
                BufferedReader br = new BufferedReader(fr); //reads one line at a time
                String line;
                while ((line = br.readLine()) != null) {
                    ta2.append(line + "\n");
                }
                br.close();
            }
        }
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error!");
		}
    }


}


