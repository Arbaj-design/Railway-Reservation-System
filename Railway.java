import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.sql.*;
//completely done
class Railway extends JFrame{
Railway(){
//	frame
	setSize(1200,700);
	getContentPane().setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Railway Reservation System");
	
//font
	
	
//header
	JPanel heading;
	heading=new JPanel();
	heading.setLayout(null);
	heading.setBackground(new Color(0,0,0,0));
	heading.setBounds(0, 0, 1200, 200);
	
//logo
	ImageIcon i=new ImageIcon("F:\\Documents\\Raiway Images\\Railwaylogo.jpg");
	JLabel logo=new JLabel("",i,JLabel.LEFT);
	logo.setBounds(0, 0, 200,200);
	Image im=i.getImage();
	Image temp=im.getScaledInstance(200,200, Image.SCALE_SMOOTH);
	i=new ImageIcon(temp);
	heading.add(logo);
	
//login panel title
	JLabel head=new JLabel("LOG-IN DETAILS");
	head.setAlignmentX(CENTER_ALIGNMENT);
	head.setAlignmentY(CENTER_ALIGNMENT);
	head.setBounds(300, 100, 600, 100);
	head.setFont(new Font("Serif",Font.BOLD,50));
	head.setForeground(Color.blue);
	head.setBackground(new Color(0,0,0,60));
	
	
	
//login panel
	JPanel login=new JPanel();
	login.setSize(600,350);
	login.setBackground(new Color(0,0,0,60));
	login.setBounds(200, 200, 600, 350);
	login.setLayout(null);
	
	JLabel lblUserId = new JLabel("User Id");
	lblUserId.setBounds(60 ,50, 200, 52);
	lblUserId.setFont(new Font("Tahoma", Font.BOLD, 30));
	login.add(lblUserId);
	lblUserId.setForeground(Color.white);
	
	JTextField textField = new JTextField();
	textField.setBounds(360, 50, 200, 35);
	login.add(textField);
	textField.setColumns(10);
	
	JLabel lblPassword = new JLabel("Password");
	lblPassword.setBounds(60, 120, 200, 52);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 30));
	login.add(lblPassword);
	lblPassword.setForeground(Color.white);
	
	JPasswordField passwordField = new JPasswordField();
	passwordField.setBounds(360,120,200,35);
	login.add(passwordField);
	
	JButton btnNewButton_1 = new JButton("LOG IN");
	btnNewButton_1.setBounds(60, 250, 118, 44);
	btnNewButton_1.setBackground(Color.green);
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
	btnNewButton_1.setForeground(Color.white);
	login.add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("RESET");
	btnNewButton_2.setForeground(Color.white);
	btnNewButton_2.setBounds(350, 250, 97, 44);
	btnNewButton_2.setBackground(Color.red);
	btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
	login.add(btnNewButton_2);
	
	JLabel reg=new JLabel("Click here to create new account");
	reg.setForeground(Color.cyan);
	reg.setFont(new Font("Tahoma", Font.BOLD, 20));
	reg.setBounds(60, 300, 700, 30);
	login.add(reg);
	reg.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			new Register().setVisible(true);
			dispose();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	btnNewButton_1.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			PreparedStatement ps;
			ResultSet rs;
			String uname=textField.getText();
			String pass= String.valueOf(passwordField.getPassword());
			if(uname.equals("")||pass.equals("")) JOptionPane.showMessageDialog(null, "fill username and password");
			else {
			String query="select * from Login where user_name=? AND password=?";
			try {
				ps=MyConnection.getConnection().prepareStatement(query);
				ps.setString(1, uname);
				ps.setString(2, pass);
				rs=ps.executeQuery();
				if(rs.next()) {
//					JOptionPane.showMessageDialog(null, "yes");
					
					
					JOptionPane.showMessageDialog(r, "Successfully Login\n\n\n\tWelcome    "+uname);
					
					new Home().setVisible(true);
					r.setVisible(false);
					
					ps.close();
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Username or password");
					
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
				
		}
		
	});
	
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent a) {
			textField.setText("");
			lblPassword.setText("");
		}
	});
	
	
	
//background
	ImageIcon bg=new ImageIcon("F:\\Documents\\Raiway Images\\Railway.jpg");
	JLabel background=new JLabel("",bg,JLabel.CENTER);
	Image img=bg.getImage();
	Image t=img.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
	bg=new ImageIcon(t);
	
	background.setBounds(0, 0, 1200, 700);
	background.add(heading);
	background.add(login);
	background.add(head);
	getContentPane().add(background);
	
	
	
	
	
	
	setVisible(true);
}

private void JLabelRegisterMouseClicked(java.awt.event.MouseEvent ev) {
	Register rf=new Register();
	rf.setVisible(true);
	
}

Railway r;
public static void main(String[] args) {
	Railway r=new Railway();
	
}
}