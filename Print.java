import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.sql.*;
import java.util.Random;
//completely done
public class Print extends JFrame{

	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	public static String getRandomNumberString() {
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);

	    // this will convert any number sequence into 6 character.
	    return String.format("%06d", number);
	}
	
	public Print(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,int i) {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		setBounds(0,0, 1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setTitle("Railway Reservation System - Ticket Print");
		
		
		int no=Integer.parseInt(Print.getRandomNumberString());
		JLabel pnr=new JLabel("PNR No.:"+"   "+no);
		pnr.setFont(new Font("Tahoma", Font.BOLD, 20));
		pnr.setBounds(27, 34, 200, 30);
		getContentPane().add(pnr);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(27, 74, 85, 30);
		getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(147, 74, 300, 30);
		getContentPane().add(textField);
		textField.setText(s1);
		textField.setEditable(false);
		
		/*JLabel lblFare = new JLabel("Fare");
		lblFare.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFare.setBounds(620, 74, 73, 30);
		getContentPane().add(lblFare);
		*/
		
		textField_1 = new JTextField();
		textField_1.setBounds(720, 74, 100, 30);
		getContentPane().add(textField_1);
//		textField_1.setText(s2);
		
		int col=i;
		
		
		PreparedStatement ps;
		ResultSet rs;
		String query="select * from train_fare where train_no=?  ";  //AND s_station=? AND e_station=?
		try {
			ps=MyConnection.getConnection().prepareStatement(query);
			ps.setInt(1, Integer.parseInt(s8));
			rs=ps.executeQuery();
			rs.next();
			textField_1.setText(rs.getString(col));
//			if(rs.next()) JOptionPane.showMessageDialog(null, "found");
//			else JOptionPane.showMessageDialog(null, "not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textField_1.setEditable(false);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGender.setBounds(940, 74, 100, 30);
		getContentPane().add(lblGender);
		
		JTextField txtGender=new JTextField();
		txtGender.setBounds(1050, 74, 80, 30);
		txtGender.setText(s2);
		getContentPane().add(txtGender);
		txtGender.setEditable(false);
		
		JLabel lblsource = new JLabel("Source");
		lblsource.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblsource.setBounds(27, 222, 100, 30);
		getContentPane().add(lblsource);
		
		textField_2 = new JTextField();
		textField_2.setBounds(147, 222, 300, 30);
		getContentPane().add(textField_2);
		textField_2.setText(s3);
		textField_2.setEditable(false);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDestination.setBounds(620, 222, 222, 30);
		getContentPane().add(lblDestination);
		
		textField_3 = new JTextField();
		textField_3.setBounds(740, 222, 300, 30);
		getContentPane().add(textField_3);
		textField_3.setText(s4);
		textField_3.setEditable(false);
		
		JLabel lbldate = new JLabel("Journey Date");
		lbldate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbldate.setBounds(27, 376, 150, 30);
		getContentPane().add(lbldate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(177, 376, 300, 30);
		getContentPane().add(textField_4);
		textField_4.setText(s5);
		textField_4.setEditable(false);
		
		JLabel lblContactNo = new JLabel("contact No.");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblContactNo.setBounds(620, 376, 148, 30);
		getContentPane().add(lblContactNo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(740, 370, 300, 30);
		getContentPane().add(textField_5);
		textField_5.setText(s6);
		textField_5.setEditable(false);
		
		JLabel lblPaymentMethod = new JLabel("payment Method");
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPaymentMethod.setBounds(27, 500, 189, 30);
		getContentPane().add(lblPaymentMethod);
		
		textField_6 = new JTextField();
		textField_6.setBounds(200, 500, 300, 30);
		getContentPane().add(textField_6);
//		textField_6.setText(s8);
		textField_6.setEditable(false);
		textField_6.setText("Online");
		
		JLabel lblSeatType = new JLabel("Seat Type");
		lblSeatType.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSeatType.setBounds(620, 500, 130, 30);
		getContentPane().add(lblSeatType);
		
		textField_7 = new JTextField();
		textField_7.setBounds(740, 500, 300, 30);
		getContentPane().add(textField_7);
		textField_7.setText(s7);
		textField_7.setEditable(false);
		
		
		JLabel lblTno = new JLabel("Train No.");
		lblTno.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTno.setBounds(620, 430, 130, 30);
		getContentPane().add(lblTno);
		
		textField_8 = new JTextField();
		textField_8.setBounds(740, 430, 300, 30);
		getContentPane().add(textField_8);
		textField_8.setText(s8);
		textField_8.setEditable(false);
		
		JLabel lblItsOurPlesure = new JLabel("It's Our Plesure To serve You");
		lblItsOurPlesure.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblItsOurPlesure.setBounds(254, 580, 675, 70);
		getContentPane().add(lblItsOurPlesure);

		setVisible(true);
		
	}

}