import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.*;
import java.sql.*;
// completely done
public class Distance extends JFrame {
	private JLabel txtDistanceBeetweenTwo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	public Distance() throws Exception{
		setLayout(null);
                setSize(1200,800);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setTitle("Railway Reservation System-Distance Between Cities");
                
               
        		ImageIcon i=new ImageIcon("F:\\Documents\\Raiway Images\\DistanceBG.jpg");
        		JLabel label=new JLabel("",i,JLabel.CENTER);
        		Image a=i.getImage();
        		Image q=a.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
        		i=new ImageIcon(q);
        		label.setBounds(0,0, 1200, 700);
        		
        		
		txtDistanceBeetweenTwo = new JLabel();
		txtDistanceBeetweenTwo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtDistanceBeetweenTwo.setText("CALCULATE DISTANCE BEETWEEN TWO CITIES");
		txtDistanceBeetweenTwo.setBounds(216, 64, 773, 75);
		label.add(txtDistanceBeetweenTwo);
		
		
		JLabel lblStartingLocation = new JLabel("Starting Location");
		lblStartingLocation.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblStartingLocation.setBounds(183, 239, 297, 45);
		label.add(lblStartingLocation);
		lblStartingLocation.setForeground(Color.black);
		
		textField = new JTextField();
		textField.setBounds(516, 239, 300, 36);
		label.add(textField);
		textField.setColumns(10);
		s=textField.getText();
		
		JLabel lblEndingLoction = new JLabel("Ending Loction");
		lblEndingLoction.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblEndingLoction.setBounds(182, 354, 245, 57);
		label.add(lblEndingLoction);
		lblEndingLoction.setForeground(Color.black);
		
		textField_1 = new JTextField();
		textField_1.setBounds(516, 354, 300, 36);
		label.add(textField_1);
		textField_1.setColumns(10);
		e=textField_1.getText();
		
		JButton btnSave = new JButton("CALCULATE");
		btnSave.setForeground(Color.BLUE);
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnSave.setBounds(520, 443, 195, 57);
		label.add(btnSave);
		
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String query="select * from distance_city where starting_station=? AND ending_station=?";
				PreparedStatement ps;
				ResultSet rs;
				try {
					ps=MyConnection.getConnection().prepareStatement(query);
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
					rs=ps.executeQuery();
					rs.next();
					String result= rs.getString(3);
					textField_2.setText(result);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JLabel lblDistanceBeetweenTwo = new JLabel("Distance Beetween Cities");
		lblDistanceBeetweenTwo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDistanceBeetweenTwo.setBounds(183, 550, 320, 57);
		label.add(lblDistanceBeetweenTwo);
		lblDistanceBeetweenTwo.setForeground(Color.black);
		
		textField_2 = new JTextField();
		textField_2.setBounds(530, 550, 250, 36);
		label.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		
		
		JLabel btnBack = new JLabel("<< Back To Menu");
		btnBack.setForeground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnBack.setBounds(0, 5, 200, 57);
		label.add(btnBack);
		
		btnBack.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new Home().setVisible(true);
			}
		});
		
              add(label);  
              setVisible(true);
	}
	String s,e;
	
	public static void main(String[] args) throws Exception{
        	
        	
        	new Distance();
        	
        	
    }
}