import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.toedter.calendar.JDateChooser;
//seat-- query is remaining     
public class Reservation extends JFrame{
	Reservation res;
	public static void main(String[] args) {
		Reservation res= new Reservation();
	}

	
	JTextField txtName,	txtAge,	textField_5,txtCity,txtPincode,	txtContact,	txtTno,txtSource,	txtDestination	;

	public Reservation() {
//		initialization
		setSize(1200,700);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Railway Reservation System-Reservation");
		
//		title
		JLabel title=new JLabel("RESERVATION",JLabel.CENTER);
		title.setBackground(new Color(0,0,0,80));
		title.setForeground(Color.white);
		title.setBounds(0,15,1200,60);
		title.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JLabel info=new JLabel("*Please fill the following information");
		info.setBackground(new Color(0,0,0,80));
		info.setForeground(Color.red);
		info.setBounds(0,60,1200,60);
		info.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
//		background
		ImageIcon i=new ImageIcon("F:\\Documents\\Raiway Images\\platform.jpg");
		
		JLabel bg3=new JLabel("",i,JLabel.CENTER);
		Image a=i.getImage();
		Image q=a.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
		i=new ImageIcon(q);
		bg3.setBounds(10,-72, 1200, 700);
		
		
		
//		passenger details
		JLabel lblPassengerDetails = new JLabel("Passenger Details");
		lblPassengerDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassengerDetails.setBounds(407, 138, 185, 35);
		 getContentPane().add(lblPassengerDetails);
		//name
		JLabel lblName = new JLabel("Name"); 
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(42, 199, 107, 29);
		 getContentPane().add(lblName);
		
		 JTextField txtName = new JTextField(); 
			txtName.setText("");
			txtName.setBounds(159, 199, 269, 29);
			 getContentPane().add(txtName);
			txtName.setColumns(10);
			
			
		//age	 
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAge.setBounds(438, 199, 93, 29);
		 getContentPane().add(lblAge);
		
			
			JTextField txtAge = new JTextField();
			txtAge.setText("");
			txtAge.setBounds(555, 199, 40, 29);
			 getContentPane().add(txtAge);
			txtAge.setColumns(3);
		//sex
		JLabel lblSex = new JLabel("Sex");
		lblSex.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSex.setBounds(748, 199, 86, 29);
		 getContentPane().add(lblSex);
		
		 JRadioButton rdbtnNewRadioButton = new JRadioButton("male");
			rdbtnNewRadioButton.setBounds(869, 199, 70, 23);
			rdbtnNewRadioButton.setBackground(new Color(255,255,255));
			getContentPane().add(rdbtnNewRadioButton);
			
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("female");
		rdbtnNewRadioButton_1.setBounds(869, 220, 70, 23);			
		rdbtnNewRadioButton_1.setBackground(new Color(255,255,255));
		getContentPane().add(rdbtnNewRadioButton_1);
		ButtonGroup b=new ButtonGroup();
		b.add(rdbtnNewRadioButton);
		b.add(rdbtnNewRadioButton_1);
		//contact	
		 JLabel lblContact = new JLabel("Contact");
			lblContact.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblContact.setBounds(42, 403, 122, 29);
			 getContentPane().add(lblContact);

		 JTextField txtContact = new JTextField();
				txtContact.setText("");
				txtContact.setBounds(159, 403, 194, 29);
				 getContentPane().add(txtContact);
				txtContact.setColumns(10);
		//address
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(42, 258, 107, 31);
		 getContentPane().add(lblAddress);
		
		 JTextArea textField_5 = new JTextArea();
			textField_5.setText("");
			textField_5.setBounds(159, 258, 355, 90);
			 getContentPane().add(textField_5);
		//city	
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCity.setBounds(574, 258, 53, 31);
		 getContentPane().add(lblCity);
		
		 JTextField txtCity = new JTextField();
			txtCity.setText("");
			txtCity.setBounds(730, 258, 182, 35);
			 getContentPane().add(txtCity);
			txtCity.setColumns(10);
		//pincode
		JLabel lblPinCode = new JLabel("Pin Code");
		lblPinCode.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPinCode.setBounds(574, 342, 93, 22);
		 getContentPane().add(lblPinCode);
		
		 JTextField txtPincode = new JTextField();
			txtPincode.setText("");
			txtPincode.setBounds(730, 329, 194, 30);
			 getContentPane().add(txtPincode);
			txtPincode.setColumns(10);
				
		
		
//journey details
		JLabel lblNewLabel_1 = new JLabel("Journey Details");
			lblNewLabel_1.setBounds(448, 440, 200, 35);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
			getContentPane().add(lblNewLabel_1);
		//tno
		JLabel lblTrainNo = new JLabel("Train No.");
		lblTrainNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTrainNo.setBounds(42, 483, 97, 30);
		 getContentPane().add(lblTrainNo);
		
		 JTextField txtTno = new JTextField();
			txtTno.setText("");
			txtTno.setBounds(194, 483, 182, 30);
			 getContentPane().add(txtTno);
			txtTno.setColumns(10);
		//seat type
		 JLabel lblSeat = new JLabel("Seat Type");
			lblSeat.setToolTipText("");
			lblSeat.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblSeat.setBounds(438, 485, 93, 29);
			getContentPane().add(lblSeat);		
		
			JRadioButton ac,ss,iiac,iiiac,g;
				ac=new JRadioButton("I AC");
				ac.setBounds(540, 485, 49, 25);
				ac.setBackground(new Color(255,255,255));
				getContentPane().add(ac);
				iiac=new JRadioButton("II AC");
				iiac.setBounds(590, 485, 60, 25);
				iiac.setBackground(new Color(255,255,255));
				getContentPane().add(iiac);
				iiiac=new JRadioButton("III AC");
				iiiac.setBounds(655, 485, 70, 25);
				iiiac.setBackground(new Color(255,255,255));
				getContentPane().add(iiiac);
				ss=new JRadioButton("SS");
				ss.setBounds(730, 485, 45, 25);
				ss.setBackground(new Color(255,255,255));
				getContentPane().add(ss);
				g=new JRadioButton("General");
				g.setBounds(780, 485, 75, 25);
				g.setBackground(new Color(255,255,255));
				getContentPane().add(g);
			ButtonGroup bg=new ButtonGroup();
			bg.add(ac);
			bg.add(iiac);
			bg.add(iiiac);
			bg.add(ss);
			bg.add(g);
			
			
		//jdate
		JLabel lblNewLabel = new JLabel("Journey Date");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(42, 535, 175, 35);
		 getContentPane().add(lblNewLabel);
		
//		 JTextField textField11 = new JTextField();
//			textField11.setText("");
//			textField11.setToolTipText("");
//			textField11.setBounds(190, 535, 186, 30);
//			getContentPane().add(textField11);
//			textField11.setColumns(10);
		
		 
		 JDateChooser dateChooser = new JDateChooser();
		    
		 dateChooser.setCalendar(Calendar.getInstance());
		
		 dateChooser.setBounds(190, 535, 182, 30);		
			dateChooser.setDateFormatString("dd-MMM-yyyy");
			getContentPane().add(dateChooser);
			

//			SimpleDateFormat df=new SimpleDateFormat("dd-MMM-yyyy");
//			String date=df.format(dateChooser.getDate()); //gives full date
			
			String d,m,y;
			SimpleDateFormat onlyd=new SimpleDateFormat("dd");
			SimpleDateFormat onlym=new SimpleDateFormat("MMM");
			SimpleDateFormat onlyy=new SimpleDateFormat("yyyy");
			d=onlyd.format(dateChooser.getDate());
			m=onlym.format(dateChooser.getDate());
			y=onlyy.format(dateChooser.getDate());
//			
		 //src
		 JLabel Source = new JLabel("Source");
		 	Source.setToolTipText("");
		 	Source.setFont(new Font("Tahoma", Font.BOLD, 18));
		 	Source.setBounds(438, 535, 93, 26);
			getContentPane().add(Source);
			
			JTextField txtSource = new JTextField();
			txtSource.setText("");
			txtSource.setBounds(534, 535, 100, 30);
			getContentPane().add(txtSource);
			txtSource.setColumns(10);
		//dest	
		JLabel Destination = new JLabel("Destination");
			Destination.setToolTipText("");
			Destination.setFont(new Font("Tahoma", Font.BOLD, 18));			
			Destination.setBounds(692, 535, 150, 30);
			getContentPane().add(Destination);
		
			JTextField txtDestination = new JTextField();
			txtDestination.setText("");
			txtDestination.setBounds(826, 535, 100, 30);
			getContentPane().add(txtDestination);
			txtDestination.setColumns(10);
			
			
			
		//buttons
		JButton btnSave = new JButton("BOOK");
			btnSave.setForeground(Color.DARK_GRAY);
			btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnSave.setBounds(42, 600, 140, 43);
			 getContentPane().add(btnSave);

			 btnSave.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String gen=null;
					if(rdbtnNewRadioButton.isSelected())  gen="male";
					if(rdbtnNewRadioButton_1.isSelected())  gen="female";
					
					String stype=null,s=null;
					if(ac.isSelected()) {stype="ac"; s="as_seat";}
					if(iiac.isSelected()) { stype="II ac"; s="s_ac";}
					if(iiiac.isSelected()) {stype="III ac"; s="t_ac";}
					if(ss.isSelected()) {stype="ss"; s="s_class";}
					if(g.isSelected()) {stype="general"; s="g_seat";}
					
//					jdbc		//seat-- query is remaining     
					String query="insert into reservation values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//					String seatno=" update availableseat set ?=?+1  where t_no=?;";
					PreparedStatement ps;
//					PreparedStatement ps2;
					try {
						ps=MyConnection.getConnection().prepareStatement(query);
						ps.setString(1, txtName.getText());
						ps.setInt(2, Integer.parseInt(txtAge.getText()));
						ps.setString(3, gen);
						ps.setString(4, textField_5.getText());
						ps.setString(5, txtCity.getText());
						ps.setInt(6, Integer.parseInt(txtPincode.getText()));
						ps.setInt(7, Integer.parseInt(txtContact.getText()));
						ps.setInt(8, Integer.parseInt(txtTno.getText()));
						ps.setString(9, txtSource.getText());
						ps.setString(10, txtDestination.getText());
						ps.setString(11, stype);
						ps.setInt(12, Integer.parseInt(d));
						ps.setString(13, m);
						ps.setInt(14, Integer.parseInt(y));
						
//						ps2=MyConnection.getConnection().prepareStatement(seatno);
//						ps2.setString(1,s);
//						ps2.setString(2,s);
//						ps2.setString(3,txtTno.getText());
//						ps2.executeUpdate();
						
						if(ps.executeUpdate()>0) {
							JOptionPane.showMessageDialog(null,"Ticket Booked Successfully");
								
						}
						
//						if(ps2.executeUpdate()>0) JOptionPane.showMessageDialog(null, "incremented");
						ps.close();
//						ps2.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					
//					JOptionPane.showMessageDialog(res,"Ticket Booked Successfully");
				}
			});
			 
		JButton button = new JButton("TICKET PRINT");
		button.setFont(new Font("Dialog", Font.BOLD, 18));
		button.setForeground(Color.DARK_GRAY);
		button.setBounds(300, 600, 220, 43);
		 getContentPane().add(button);
		 
		 button.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1=txtName.getText(),
						s2="gender",
						s3=txtSource.getText(),
						s4=txtDestination.getText(),
//						s5=textField11.getText(),
						s5=d+"-"+m+"-"+y,
						s6=txtContact.getText(),
						s7="seat",
						s8=txtTno.getText()
					;
				if(rdbtnNewRadioButton.isSelected()==true) 	s2="male";
				if(rdbtnNewRadioButton_1.isSelected()==true) 	s2="female";
				
				int i=7;
				if(ac.isSelected()==true) {s7="ac"; i=5;}
				if(iiac.isSelected()==true) { s7="s_ac"; i=3;}
				if(iiiac.isSelected()==true) {s7="t_ac"; i=4;}
				if(ss.isSelected()==true) {s7="ss"; i=7; }
				if(g.isSelected()==true) {s7="genral"; i=8;}
				
				new Print(s1,s2,s3,s4,s5,s6,s7,s8,i).setVisible(true);
			}
		});
		
		JButton btnNewButton = new JButton("BOOK NEW");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(574, 600, 210, 43);
		 getContentPane().add(btnNewButton);
		
		 btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtName.setText("");
				txtAge.setText("");
				textField_5.setText("");
				txtCity.setText("");
				txtPincode.setText("");
				txtContact.setText("");
				txtTno.setText("");
//				textField11.setText("");
				txtSource.setText("");
				txtDestination.setText("");
				
			}
		});
				
		JButton btnClose = new JButton("CLOSE");
		btnClose.setForeground(Color.DARK_GRAY);
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setBounds(872, 600, 120, 43);
		 getContentPane().add(btnClose);
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Home().setVisible(true);
				dispose();
			}
		});
		
				
				
		
		
		
		
		
		
		
		
		//components
		bg3.add(title);
		bg3.add(info);
		getContentPane().add(bg3);
		
		
				
		
		
		
		setVisible(true);
		
	}
}