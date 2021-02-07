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
import javax.swing.JTextField;

public class Uploading_Pic extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7632143069038592752L;
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
	JButton btnCancel;
	JButton btnUpload;
	private JTextField textField;
	
	
	public Uploading_Pic() {
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
		
		JLabel lblHome = new JLabel("Uploading a Post");
		lblHome.setBounds(504, 5, 281, 30);
		lblHome.setToolTipText("");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 22));
		panel.add(lblHome);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 20));
		btnCancel.setBounds(1104, 2, 135, 37);
		btnCancel.addActionListener(this);
		panel.add(btnCancel);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 117, 1273, 478);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCaption = new JLabel("Add a caption for your photo");
		lblCaption.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		lblCaption.setBounds(373, 344, 367, 34);
		panel_1.add(lblCaption);
		
		textField = new JTextField();
		textField.setBounds(366, 389, 531, 78);
		panel_1.add(textField);
		textField.setColumns(10);
		
		btnUpload = new JButton("Upload Photo");
		btnUpload.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 20));
		btnUpload.setBounds(551, 280, 204, 34);
		btnUpload.addActionListener(this);
		panel_1.add(btnUpload);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(366, 11, 531, 258);
		panel_1.add(panel_4);
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
		else if (e.getSource() == btnCancel) {
			btnCancel.setBackground(Color.orange);
		}
		else if (e.getSource() == btnUpload) {
			btnUpload.setBackground(Color.orange);
			java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
//	                new WebAppImg().setVisible(true);
	            }
	        });
		}
		

		
	}
}
