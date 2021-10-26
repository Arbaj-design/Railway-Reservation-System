import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

//date input is remaining as jdatechooser    and its ip to query
public class Seat extends JFrame{

	public static void main(String[] args) {
		new Seat();
	}
	
	
	
	Seat(){
//	initialization
	setSize(1200,700);
	getContentPane().setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Railway Reservation System-Seat Availablity");
	
//	title
	JLabel title=new JLabel("Seat Availability",JLabel.CENTER);
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
	ImageIcon i=new ImageIcon("F:\\Documents\\Raiway Images\\Seat.jpg");
	JLabel bg4=new JLabel("",i,JLabel.CENTER);
	Image a=i.getImage();
	Image q=a.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
	i=new ImageIcon(q);
	bg4.setBounds(0,0, 1200, 700);
	

				//tno
			JLabel lblTrainNo = new JLabel("Train No.");
			lblTrainNo.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTrainNo.setBounds(80, 200, 97, 30);
			lblTrainNo.setForeground(Color.BLACK);
			getContentPane().add(lblTrainNo);
			
			 JTextField txtTno = new JTextField();
				txtTno.setText("");
				txtTno.setBounds(210, 200, 182, 30);
				 getContentPane().add(txtTno);
				txtTno.setColumns(10);
			//seat type
			 JLabel lblSeat = new JLabel("Seat Type");
				lblSeat.setToolTipText("");
				lblSeat.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblSeat.setBounds(80, 300, 93, 29);
				lblSeat.setForeground(Color.BLACK);
				getContentPane().add(lblSeat);		
			
				JRadioButton ac,iiac,iiiac,ss,g;
					ac=new JRadioButton("AC");
					ac.setBounds(210,300, 45, 25);
					ac.setBackground(new Color(255,255,255));
					getContentPane().add(ac);
					iiac=new JRadioButton("II AC");
					iiac.setBounds(260,300, 60, 25);
					iiac.setBackground(new Color(255,255,255));
					getContentPane().add(iiac);
					iiiac=new JRadioButton("III AC");
					iiiac.setBounds(325,300, 60, 25);
					iiiac.setBackground(new Color(255,255,255));
					getContentPane().add(iiiac);
					ss=new JRadioButton("SS");
					ss.setBounds(390, 300, 45, 25);
					ss.setBackground(new Color(255,255,255));
					getContentPane().add(ss);
					g=new JRadioButton("General");
					g.setBounds(440,300, 70, 25);
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
			lblNewLabel.setBounds(80, 370, 175, 35);
			lblNewLabel.setForeground(Color.BLACK);
			 getContentPane().add(lblNewLabel);
			
			JTextField jdate=new JTextField();
			jdate.setText("");
			jdate.setBounds(210,370,186,30);	
			jdate.setColumns(10);
				getContentPane().add(jdate);
				
			 JLabel no=new JLabel("Available Seats =");
					no.setBounds(400,550,420,43);
					no.setFont(new Font("Tahoma", Font.BOLD, 24));
					no.setForeground(Color.GREEN);
					getContentPane().add(no);
					
			JTextField notxt=new JTextField("");
					jdate.setText("");
					notxt.setBounds(610, 555, 186,30);
					jdate.setColumns(5);
					getContentPane().add(notxt);
				
//buttons
				JButton button = new JButton("FIND");
				button.setFont(new Font("Dialog", Font.BOLD, 18));
				button.setForeground(Color.DARK_GRAY);
				button.setBounds(280, 480, 220, 43);
				 getContentPane().add(button);
				 
									
				 button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
						String stype=null;
						int i=7;
						if(ac.isSelected()) {stype="ac"; i=5;}
						if(iiac.isSelected()) { stype="s_ac"; i=3;}
						if(iiiac.isSelected()) {stype="t_ac"; i=4;}
						if(ss.isSelected()) {stype="ss"; i=7; }
						if(g.isSelected()) {stype="genral"; i=8;}
						
						PreparedStatement ps;
						ResultSet rs;
						String query="select * from availableseat where t_no=? ";	// date is remaining
						
						try {
							ps=MyConnection.getConnection().prepareStatement(query);
							ps.setString(1, txtTno.getText());
							rs=ps.executeQuery();
							rs.next();
							notxt.setText(String.valueOf(rs.getInt(i)));
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
					}
				});
				 
				 JButton btnNewButton_2 = new JButton("RESET");
					btnNewButton_2.setForeground(Color.DARK_GRAY);
					btnNewButton_2.setBounds(630, 480, 180, 43);
					btnNewButton_2.setBackground(Color.red);
					btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 18));
					getContentPane().add(btnNewButton_2);
					
					btnNewButton_2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							txtTno.setText("");
							jdate.setText("");
					
						}
					});
	
					JButton btnClose = new JButton("CLOSE");
					btnClose.setForeground(Color.DARK_GRAY);
					btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
					btnClose.setBounds(900, 480, 120, 43);
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