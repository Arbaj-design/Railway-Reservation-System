import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
// completely done
public class Home extends JFrame{
	Home h;
	public static void main(String[] args) {
		Home h=new Home();
	}
	
	Home(){
//		initialization
		setSize(1200,700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Railway Reservation System-HOME");
		
//		title
		JLabel title=new JLabel("WELCOME TO INDIAN RAILWAY",JLabel.CENTER);
		title.setBackground(new Color(0,0,0,80));
		title.setForeground(Color.white);
		title.setBounds(0,30,1200,80);
		title.setFont(new Font("Tahoma", Font.BOLD, 50));
		
//		menu
		JMenuBar mbar=new JMenuBar();
		setJMenuBar(mbar);
		
		JMenu homemenu=new JMenu("Home");
		JMenu reserve=new JMenu("Reservation");
		JMenu cancel=new JMenu("Cancellation");
	JMenu train=new JMenu("Train");
		JMenu seat=new JMenu("Seats Availability");
		JMenu help=new JMenu("Help");

		mbar.add(homemenu);
		mbar.add(reserve);
		mbar.add(cancel);
//		mbar.add(train);
		mbar.add(seat);
		mbar.add(help);
		
		JMenuItem book=new JMenuItem("Book Ticket");
		reserve.add(book);
		
		JMenuItem del=new JMenuItem("Cancel The Ticket");
		cancel.add(del);
		
		JMenuItem log=new JMenuItem("LOG IN");
		homemenu.add(log);
		
		JMenuItem reg=new JMenuItem("Register -New User");
		homemenu.add(reg);
		
		JMenuItem avail=new JMenuItem("Find Available Seats");
		seat.add(avail);
		
		JMenuItem distance=new JMenuItem("Distance between cities");
		help.add(distance);
		
		book.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
                new Reservation().setVisible(true);
              //  h.setVisible(false);
                dispose();
        }
    });
		
		del.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	               new Cancellation().setVisible(true);
	                //h.setVisible(false);
	               dispose();
	        }
	    });
		
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				new Railway().setVisible(true);
				//h.setVisible(false);
				dispose();
			}
		});

		reg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Register().setVisible(true);
				//h.setVisible(false);
				dispose();
			}
			
		});
		
		avail.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			new Seat().setVisible(true);
			//h.setVisible(false);
			dispose();
			}
		});
		
		distance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					new Distance().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//h.setVisible(false);
				dispose();
			}
		});

		//		background
		ImageIcon bg=new ImageIcon("F:\\Documents\\Raiway Images\\HomeBG.jpg");
		JLabel background=new JLabel("",bg,JLabel.CENTER);
		Image img=bg.getImage();
		Image t=img.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
		bg=new ImageIcon(t);
		background.setBounds(0, 0, 1200,700);
		
		
		background.add(title);
		add(background);
		
		setVisible(true);
	}
	
}
