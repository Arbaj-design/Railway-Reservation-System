import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.sql.*;
public class Cancellation extends JFrame{
	Cancellation c;
	public static void main(String[] args) {
		Cancellation c= new Cancellation();
	}
	
	
	
	Cancellation(){
//	initialization
	setSize(1200,700);
	getContentPane().setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Railway Reservation System-Cancellation");
	
//	title
	JLabel title=new JLabel("CANCELLATION",JLabel.CENTER);
	title.setBackground(new Color(0,0,0,80));
	title.setForeground(Color.white);
	title.setBounds(0,0,1200,60);
	title.setFont(new Font("Tahoma", Font.BOLD, 40));
	
	JLabel info=new JLabel("*Please fill the following information");
	info.setBackground(new Color(0,0,0,80));
	info.setForeground(Color.red);
	info.setBounds(0,60,1200,60);
	info.setFont(new Font("Tahoma", Font.BOLD, 20));
	
	
//	background
	ImageIcon i=new ImageIcon("D:\\images\\DistanceBG.jpg");
	JLabel bg4=new JLabel("",i,JLabel.CENTER);
	Image a=i.getImage();
	Image q=a.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
	i=new ImageIcon(q);
	bg4.setBounds(0,0, 1200, 700);
	

	JLabel lblPassengerDetails = new JLabel("Passenger Details");
	lblPassengerDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblPassengerDetails.setBounds(407, 138, 185, 35);
	 getContentPane().add(lblPassengerDetails);
 
	//PNR	
		 JLabel lblpnr = new JLabel("PNR No.");
		 		lblpnr.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblpnr.setBounds(72, 199, 122, 29);
				lblpnr.setForeground(Color.BLACK);
				 getContentPane().add(lblpnr);

		 JTextField txtpnr = new JTextField();
					txtpnr.setText("");
					txtpnr.setBounds(189, 199, 194, 29);
					 getContentPane().add(txtpnr);
					txtpnr.setColumns(10);

	 //name
	JLabel lblName = new JLabel("Name"); 
	lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblName.setBounds(72, 258, 107, 29);
	lblName.setForeground(Color.BLACK);
	 getContentPane().add(lblName);
	
	 JTextField txtName = new JTextField(); 
		txtName.setText("");
		txtName.setBounds(189, 258, 269, 29);
		 getContentPane().add(txtName);
		txtName.setColumns(10);
	
	//contact	
	 JLabel lblContact = new JLabel("Contact No.");
	 lblContact.setFont(new Font("Tahoma", Font.BOLD, 18));
	 lblContact.setBounds(72, 303, 122, 29);
	 lblContact.setForeground(Color.BLACK);
		 getContentPane().add(lblContact);

	 JTextField txtContact = new JTextField();
			txtContact.setText("");
			txtContact.setBounds(189, 303, 194, 29);
			 getContentPane().add(txtContact);
			txtContact.setColumns(10);

			//tno
			JLabel lblTrainNo = new JLabel("Train No.");
			lblTrainNo.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTrainNo.setBounds(72, 403, 97, 30);
			lblTrainNo.setForeground(Color.BLACK);
			getContentPane().add(lblTrainNo);
			
			 JTextField txtTno = new JTextField();
				txtTno.setText("");
				txtTno.setBounds(224, 403, 182, 30);
				 getContentPane().add(txtTno);
				txtTno.setColumns(10);
			//seat type
			 JLabel lblSeat = new JLabel("Seat Type");
				lblSeat.setToolTipText("");
				lblSeat.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblSeat.setBounds(468, 403, 93, 29);
				lblSeat.setForeground(Color.BLACK);
				getContentPane().add(lblSeat);		
			
				
				
				JRadioButton ac,ss,iiac,iiiac,g;
				ac=new JRadioButton("I AC");
				ac.setBounds(570, 403, 49, 25);
				ac.setBackground(new Color(255,255,255));
				getContentPane().add(ac);
				iiac=new JRadioButton("II AC");
				iiac.setBounds(625, 403, 60, 25);
				iiac.setBackground(new Color(255,255,255));
				getContentPane().add(iiac);
				iiiac=new JRadioButton("III AC");
				iiiac.setBounds(690, 403, 65, 25);
				iiiac.setBackground(new Color(255,255,255));
				getContentPane().add(iiiac);
				ss=new JRadioButton("SS");
				ss.setBounds(760, 403, 45, 25);
				ss.setBackground(new Color(255,255,255));
				getContentPane().add(ss);
				g=new JRadioButton("General");
				g.setBounds(810, 403, 75, 25);
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
			lblNewLabel.setBounds(72, 480, 175, 35);
			lblNewLabel.setForeground(Color.BLACK);
			 getContentPane().add(lblNewLabel);
			
//			JTextField jdate=new JTextField();
//			jdate.setText("");
//			jdate.setBounds(220,480,186,30);	
//			jdate.setColumns(10);
//				getContentPane().add(jdate);
			 JDateChooser dateChooser = new JDateChooser();
				dateChooser.setBounds(220, 480, 186, 30);
				getContentPane().add(dateChooser);
					
			 
			//src
			 JLabel Source = new JLabel("Source");
			 	Source.setToolTipText("");
			 	Source.setFont(new Font("Tahoma", Font.BOLD, 18));
			 	Source.setBounds(468, 480, 93, 26);
			 	Source.setForeground(Color.BLACK);
				getContentPane().add(Source);
				
				JTextField txtSource = new JTextField();
				txtSource.setText("");
				txtSource.setBounds(564, 480, 150, 30);
				getContentPane().add(txtSource);
				txtSource.setColumns(10);
			//dest	
			JLabel Destination = new JLabel("Destination");
				Destination.setToolTipText("");
				Destination.setFont(new Font("Tahoma", Font.BOLD, 18));			
				Destination.setBounds(742, 480, 150, 30);
				Destination.setForeground(Color.BLACK);
				getContentPane().add(Destination);
			
				JTextField txtDestination = new JTextField();
				txtDestination.setText("");
				txtDestination.setBounds(856, 480, 150, 30);
				getContentPane().add(txtDestination);
				txtDestination.setColumns(10);
				
//buttons
				JButton button = new JButton("CANCEL TICKET");
				button.setFont(new Font("Dialog", Font.BOLD, 18));
				button.setForeground(Color.DARK_GRAY);
				button.setBounds(300, 560, 220, 43);
				 getContentPane().add(button);
				 
				 button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
//						seat--
						int col=3;
						String stype=null,s=null;
						if(ac.isSelected()) {stype="ac"; s="ac"; col=5;}
						if(iiac.isSelected()) { stype="II ac"; s="s_ac"; col=3;}
						if(iiiac.isSelected()) {stype="III ac"; s="t_ac"; col=4;}
						if(ss.isSelected()) {stype="ss"; s="s_class"; col=7;}
						if(g.isSelected()) {stype="general"; s="genral"; col=8;}
						
						
						String query="insert into cancelation values(?,?,?,?,?,?,?,?)";
						String fareq="select * from Train_fare where train_no=?";
						PreparedStatement ps,st;
						ResultSet rs;
						try {
							st=MyConnection.getConnection().prepareStatement(fareq);
							st.setInt(1, Integer.parseInt(txtTno.getText()));
							rs= st.executeQuery();
							rs.next();
							int f= rs.getInt(col);
							double r=f*0.75;
							
							ps=MyConnection.getConnection().prepareStatement(query);
							ps.setInt(1,Integer.parseInt(txtpnr.getText()));
							ps.setString(2, txtName.getText());
							ps.setInt(3, Integer.parseInt(txtTno.getText()));
							ps.setString(4, txtSource.getText());
							ps.setString(5, txtDestination.getText());
							ps.setString(6, stype);
							ps.setInt(7, f);//fare
							ps.setDouble(8, r);//refund
							
							if(ps.executeUpdate()>0) {
								JOptionPane.showMessageDialog(null,"Ticket Cancelled Successfully");
									
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
				 
				 JButton btnNewButton_2 = new JButton("RESET");
					btnNewButton_2.setForeground(Color.DARK_GRAY);
					btnNewButton_2.setBounds(650, 560, 180, 43);
					btnNewButton_2.setBackground(Color.red);
					btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 18));
					getContentPane().add(btnNewButton_2);
					
					btnNewButton_2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							txtpnr.setText("");
							txtName.setText("");
							txtContact.setText("");
							txtTno.setText("");
//							jdate.setText("");
							txtSource.setText("");
							txtDestination.setText("");
					
						}
					});
	
					JButton btnClose = new JButton("CLOSE");
					btnClose.setForeground(Color.DARK_GRAY);
					btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
					btnClose.setBounds(900, 560, 120, 43);
					 getContentPane().add(btnClose);
					
					btnClose.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							new Home().setVisible(true);
							dispose();
						}
					});
					
					
	add(bg4);
	bg4.add(title);
	bg4.add(info);
	setVisible(true);
	}
	
	
}