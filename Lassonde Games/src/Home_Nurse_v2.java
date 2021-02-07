import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.Box;
import java.awt.Component;

public class Home_Nurse_v2 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	
	JButton btnHome;
	JButton btnAppoint;
	JButton btnChat;
	JButton btnHealthHist;
	JButton btnPatients;
	JButton btnAddPic;
	
	
	public Home_Nurse_v2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 5, 1273, 48);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPimps = new JLabel("PIMPS");
		lblPimps.setBounds(597, 5, 79, 38);
		lblPimps.setHorizontalAlignment(SwingConstants.CENTER);
		lblPimps.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 28));
		panel_2.add(lblPimps);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 0, 20, 1);
		panel_2.add(horizontalStrut);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 58, 1273, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setBounds(606, 5, 61, 30);
		lblHome.setToolTipText("");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 22));
		panel.add(lblHome);
		
		btnAddPic = new JButton("+ Pic");
		btnAddPic.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 20));
		btnAddPic.setBounds(1121, 0, 93, 48);
		btnAddPic.addActionListener(this);
		panel.add(btnAddPic);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(5, 606, 1273, 88);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		btnPatients = new JButton("Patients");
		btnPatients.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
//		btnPatients.setBorder(new EmptyBorder(25,15,25,30));
		btnPatients.setBounds(1019, 11, 244, 63);
		btnPatients.addActionListener(this);
		panel_3.add(btnPatients);
		
		btnHealthHist = new JButton("Health History");
		btnHealthHist.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnHealthHist.setBounds(765, 11, 244, 63);
		btnHealthHist.addActionListener(this);
		panel_3.add(btnHealthHist);
		
		btnChat = new JButton("Chat");
		btnChat.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnChat.setBounds(511, 11, 244, 63);
		btnChat.addActionListener(this);
		panel_3.add(btnChat);
		
		btnAppoint = new JButton("Appointments");
		btnAppoint.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnAppoint.setBounds(257, 11, 244, 63);
		btnAppoint.addActionListener(this);
		panel_3.add(btnAppoint);
		
		btnHome = new JButton("Home");
		btnHome.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnHome.setBounds(10, 11, 237, 63);
		btnHome.addActionListener(this);
		panel_3.add(btnHome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 117, 1273, 475);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		
		Box verticalBox = Box.createVerticalBox();
		panel_1.add(verticalBox);
		
		JPanel panel_4 = new JPanel();
		verticalBox.add(panel_4);
		
		JButton btnNewButton = new JButton("New button");
		panel_4.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		verticalBox.add(panel_5);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_5.add(btnNewButton_1);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnHome) {
			btnHome.setBackground(Color.orange);
		}
		else if (e.getSource() == btnAppoint) {
			btnAppoint.setBackground(Color.orange);
		}
		else if (e.getSource() == btnChat) {
			btnChat.setBackground(Color.orange);
		}
		else if (e.getSource() == btnHealthHist) {
			btnHealthHist.setBackground(Color.orange);
		}
		else if (e.getSource() == btnPatients) {
			btnPatients.setBackground(Color.orange);
		}
		else if (e.getSource() == btnAddPic) {
			btnAddPic.setBackground(Color.orange);
		}
		
		
	}
	
}
