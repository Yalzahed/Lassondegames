import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.RenderingHints;

public class Home_Nurse extends JFrame implements ActionListener {

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
	
	public Home_Nurse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
				
/////////////////////////////////////////////////////////
//		Header

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{114, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 134, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 114, 34};
		gbl_panel.rowHeights = new int[]{0, 64, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panelPimps = new JPanel();
		GridBagConstraints gbc_panelPimps = new GridBagConstraints();
		gbc_panelPimps.insets = new Insets(0, 0, 5, 5);
		gbc_panelPimps.gridx = 15;
		gbc_panelPimps.gridy = 0;
		panel.add(panelPimps, gbc_panelPimps);
		JLabel lblPimps = new JLabel("PIMPS");
		lblPimps.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 28));
		panelPimps.add(lblPimps);
		
		JPanel panelHome = new JPanel();
		GridBagConstraints gbc_panelHome = new GridBagConstraints();
		gbc_panelHome.insets = new Insets(0, 0, 0, 5);
		gbc_panelHome.gridx = 15;
		gbc_panelHome.gridy = 1;
		panel.add(panelHome, gbc_panelHome);
		JLabel lblHome = new JLabel("HOME");
		lblHome.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		panelHome.add(lblHome);
		
		btnAddPic = new JButton("+ Pic");
		GridBagConstraints gbc_btnAddPic = new GridBagConstraints();
		gbc_btnAddPic.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddPic.gridx = 29;
		gbc_btnAddPic.gridy = 1;
		panel.add(btnAddPic, gbc_btnAddPic);
		btnAddPic.addActionListener(this);
		btnAddPic.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
//		btnAddPic.setBorder(new EmptyBorder(15, 25, 15, 25));
		
/////////////////////////////////////////////////////////
//		Body
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
/////////////////////////////////////////////////////////
//		Footer
		
		JPanel panelButtons = new JPanel();
		contentPane.add(panelButtons, BorderLayout.SOUTH);
		Box horizontalBox = Box.createHorizontalBox();
		panelButtons.add(horizontalBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 30, 0, 15));
		horizontalBox.add(panel_4);
		btnHome = new JButton("Home");
		btnHome.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnHome.setBorder(new EmptyBorder(15, 25, 15, 25));
		btnHome.addActionListener(this);
		panel_4.add(btnHome);
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_5);
		btnAppoint = new JButton("Application");
		btnAppoint.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnAppoint.setBorder(new EmptyBorder(15, 25, 15, 25));
		btnAppoint.addActionListener(this);
		panel_5.add(btnAppoint);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_6);
		btnChat = new JButton("Chat");
		btnChat.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnChat.setBorder(new EmptyBorder(15, 25, 15, 25));
		btnChat.addActionListener(this);
		panel_6.add(btnChat);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_7);
		btnHealthHist = new JButton("Health History");
		btnHealthHist.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnHealthHist.setBorder(new EmptyBorder(15, 25, 15, 25));
		btnHealthHist.addActionListener(this);
		panel_7.add(btnHealthHist);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EmptyBorder(0, 15, 00, 30));
		horizontalBox.add(panel_8);
		btnPatients = new JButton("Patients");
		btnPatients.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnPatients.setBorder(new EmptyBorder(15, 25, 15, 25));
		btnPatients.addActionListener(this);
		panel_8.add(btnPatients);
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
			this.setVisible(false);
			new nurse_messages();
		}
		else if (e.getSource() == btnHealthHist) {
			btnHealthHist.setBackground(Color.orange);
		}
		else if (e.getSource() == btnPatients) {
			btnPatients.setBackground(Color.orange);
		}
		else if (e.getSource() == btnAddPic) {
			btnAddPic.setBackground(Color.orange);

			java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new WebAppImg().setVisible(true);
	            }
	        });

		    }
		}
}
		
