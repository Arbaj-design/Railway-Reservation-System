import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
//both password matching is remaining
public class Register extends JFrame{
	JTextField untxt;
	JPasswordField pw1,pw2;
	Register(){
//		initialization
		setSize(650,700);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Railway Reservation System-Register");
		
//		title
		JLabel title=new JLabel("REGISTRATION",JLabel.CENTER);
		title.setBackground(new Color(0,0,0,80));
		title.setForeground(Color.black);
		title.setBounds(0,0,650,60);
		title.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JLabel info=new JLabel("*Please fill the following information");
		info.setBackground(new Color(0,0,0,80));
		info.setForeground(Color.red);
		info.setBounds(0,60,1200,60);
		info.setFont(new Font("Tahoma", Font.BOLD, 20));
		
//		form
		JLabel fn=new JLabel("Full Name");
		fn.setFont(new Font("Tahoma", Font.BOLD, 18));
		fn.setBounds(10, 120, 100, 30);
		getContentPane().add(fn);
		
		JTextField fntxt=new JTextField();
		fntxt.setBounds(120, 120, 300, 30);
		getContentPane().add(fntxt);
		
		JLabel id=new JLabel("Email id");
		id.setFont(new Font("Tahoma", Font.BOLD, 18));
		id.setBounds(10, 170, 100, 30);
		getContentPane().add(id);
		
		JTextField idtxt=new JTextField();
		idtxt.setBounds(120, 170, 300, 30);
		getContentPane().add(idtxt);
		
//		
//		JLabel dob=new JLabel("D.O.B");
//		dob.setFont(new Font("Tahoma", Font.BOLD, 18));
//		dob.setBounds(10, 220, 100, 30);
//		add(dob);
//		JDateChooser j=new JDateChooser();
		
		JLabel add=new JLabel("Address");
		add.setFont(new Font("Tahoma", Font.BOLD, 18));
		add.setBounds(10, 300, 100, 30);
		getContentPane().add(add);
		
		JTextArea addtxt=new JTextArea();
		addtxt.setBounds(120, 300, 300, 100);
		getContentPane().add(addtxt);
		
		JLabel username=new JLabel("Username");
		username.setFont(new Font("Tahoma", Font.BOLD, 18));
		username.setBounds(10, 220, 100, 30);
		getContentPane().add(username);
		
		JTextField untxt=new JTextField();
		untxt.setBounds(120, 220, 300, 30);
		getContentPane().add(untxt);
		
		JLabel pw=new JLabel("Password");
		pw.setFont(new Font("Tahoma", Font.BOLD, 18));
		pw.setBounds(10, 420, 100, 30);
		getContentPane().add(pw);
		
		JPasswordField pw1=new JPasswordField();
		pw1.setBounds(170, 420, 300, 30);
		getContentPane().add(pw1);
		
		JLabel repw=new JLabel("Re-enter Password");
		repw.setFont(new Font("Tahoma", Font.BOLD, 18));
		repw.setBounds(10, 470, 150, 30);
		getContentPane().add(repw);
		
		JPasswordField pw2=new JPasswordField();
		pw2.setBounds(170,470,300,30);
		getContentPane().add(pw2);
		
		
		
//		buttons
		JButton submit=new JButton("Submit");
		submit.setBounds(60, 550, 118, 44);
		submit.setBackground(Color.blue);
		submit.setFont(new Font("Tahoma", Font.BOLD, 15));
		submit.setForeground(Color.white);
		getContentPane().add(submit);
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usename=untxt.getText();
				String pass=String.valueOf(pw1.getPassword());
				
				if(usename.equals("")) {
					JOptionPane.showMessageDialog(r, "fill username");
				}
				 if(fntxt.getText().equals("")) JOptionPane.showMessageDialog(null, "fill your full name");
				 if(idtxt.getText().equals("")) JOptionPane.showMessageDialog(null, "fill email id");
				 if(pass.equals("")) JOptionPane.showMessageDialog(null, "fill password");
//				else if(untxt.getText().equals("")) JOptionPane.showMessageDialog(null, "fill username");
				 if(addtxt.getText().equals("")) JOptionPane.showMessageDialog(null, "fill email id");
				 if(pw1.getPassword().equals("")||pw2.getPassword().equals("")) JOptionPane.showMessageDialog(null, "fill password");
//				  if(!(pass.equals(pw2.getPassword()))) JOptionPane.showMessageDialog(null, "retype password again");
				
				
				else{	
				PreparedStatement ps;
				String query="insert into Login values(?,?)";
				
				try {
					ps=MyConnection.getConnection().prepareStatement(query);
					ps.setString(1, usename);
					ps.setString(2, pass);
					
					if(ps.executeUpdate()>0) {
						JOptionPane.showMessageDialog(r,"New Account Created");
							
					}
					ps.close();
					new Railway().setVisible(true);
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
				
			}
		});
		
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(Color.white);
		cancel.setBounds(350, 550, 97, 44);
		cancel.setBackground(Color.red);
		cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(cancel);
		
		
		ImageIcon bg=new ImageIcon("F:\\Documents\\Raiway Images\\registration.jpg");
		JLabel background=new JLabel("",bg,JLabel.CENTER);
		Image img=bg.getImage();
		Image t=img.getScaledInstance(650,700, Image.SCALE_SMOOTH);
		bg=new ImageIcon(t);
		background.setBounds(0, 0, 650,700);
		getContentPane().add(background);
		
		getContentPane().add(title);
		getContentPane().add(info);
		setVisible(true);
		
		
		
		

			
	}
	Register r;
	public static void main(String[] args) throws Exception {
		Register r=new Register();
	}
	
	
	
}