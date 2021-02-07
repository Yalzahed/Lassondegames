import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import javax.swing.JComboBox;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingConstants;


public class Appointments extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appointments frame = new Appointments();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */

	JButton btnHome;
	JButton btnAppoint;
	JButton btnChat;
	JButton btnHealthHist;
	JButton btnPatients;
	JComboBox Time;
	JComboBox ts;
	String tsm;
	JComboBox Date;
	JComboBox ds;
	String dsm;
	JLabel lblTime_1;
	JLabel lblTime_2;


	public Appointments() {
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
		JLabel lblHome = new JLabel("APPOINTMENTS");
		lblHome.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		panelHome.add(lblHome);

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
		btnAppoint = new JButton("Appointments");
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

		////////////////////////////////
		// body

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{73, 79, 109, 98, 98, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 5);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 2;
		gbc_panel_9.gridy = 1;
		panel_1.add(panel_9, gbc_panel_9);		



		String[] DSlots = { "Pick your prefered date", "Sun 7th of Feb, 2021", "Mon 8th of Feb, 2021", "Tues 9th of Feb, 2021", "Wed 10th of Feb, 2021", "Thurs 11th of Feb, 2021", "Fri 12th of Feb, 2021", "Sat 13th of Feb, 2021", "Sun 14th of Feb, 2021"};
		Date = new JComboBox(DSlots);
		panel_9.add(Date);
		Date.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		Date.setBounds(97, 11, 253, 44);
		Date.setSelectedIndex(0);
		Date.addActionListener(this);







		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 2;
		panel_1.add(panel_3, gbc_panel_3);

		String[] TSlots = { "Pick your prefered time slot", "8 am to 9 am", "9 am to 10 am", "10 am to 11 am", "11 am to 12 pm", "12 pm to 1 pm", "1 pm to 2 pm", "2 pm to 3 pm", "3 pm to 4 pm", "4 pm to 5 pm", "5 pm to 6 pm", "6 pm to 7 pm", "7 pm to 8 pm"};
		Time = new JComboBox(TSlots);
		Time.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		Time.setBounds(97, 11, 253, 44);
		panel_3.add(Time);
		Time.setSelectedIndex(0);
		Time.addActionListener(this);

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 3;
		panel_1.add(panel_2, gbc_panel_2);

		Box verticalBox = Box.createVerticalBox();
		panel_2.add(verticalBox);

		JLabel lblTime = new JLabel("You have chosen to meet up");
		lblTime.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 17));
		verticalBox.add(lblTime);

		lblTime_1 = new JLabel("");
		lblTime_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 17));
		verticalBox.add(lblTime_1);

		lblTime_2 = new JLabel("");
		lblTime_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 17));
		verticalBox.add(lblTime_2);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setVerticalAlignment(SwingConstants.TOP);
		btnSubmit.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 4;
		panel_1.add(btnSubmit, gbc_btnNewButton);
		btnSubmit.addActionListener(this);




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
		else if (e.getSource() == Time) {
			Time.setBackground(Color.orange);
			ts = (JComboBox)e.getSource();
			tsm = (String)ts.getSelectedItem();	
			switch(tsm) {
			case "8 am to 9 am" : lblTime_1.setText(" from 8 am to 9 am");
			break;
			case "9 am to 10 am" : lblTime_1.setText(" from 9 am to 10 am");
			break;
			case "10 am to 11 am" : lblTime_1.setText(" from 10 am to 11 am");
			break;
			case "11 am to 12 pm" : lblTime_1.setText(" from 11 am to 12 pm");
			break;
			case "12 pm to 1 pm" : lblTime_1.setText(" from 12 pm to 1 pm");
			break;
			case "1 pm to 2 pm" : lblTime_1.setText(" from 1 pm to 2 pm");
			break;
			case "2 pm to 3 pm" : lblTime_1.setText(" from 2 pm to 3 pm");
			break;
			case "3 pm to 4 pm" : lblTime_1.setText(" from 3 pm to 4 pm");
			break;
			case "4 pm to 5 pm" : lblTime_1.setText(" from 4 pm to 5 pm");
			break;
			case "5 pm to 6 pm" : lblTime_1.setText(" from 5 pm to 6 pm");
			break;
			case "6 pm to 7 pm" : lblTime_1.setText(" from 6 pm to 7 pm");
			break;
			case "7 pm to 8 pm" : lblTime_1.setText(" from 7 pm to 8 pm");
			break;
			}
		}
		else if (e.getSource() == Date) {
			Date.setBackground(Color.orange);
			ds = (JComboBox)e.getSource();
			dsm = (String)ds.getSelectedItem();	
			switch(dsm) {
			case "Sun 7th of Feb, 2021" : lblTime_2.setText("on Sunday 7th of Feb, 2021");
			break;
			case "Mon 8th of Feb, 2021" : lblTime_2.setText("on Monday 8th of Feb, 2021");
			break;
			case "Tues 9th of Feb, 2021" : lblTime_2.setText("on Tuesday 9th of Feb, 2021");
			break;
			case "Wed 10th of Feb, 2021" : lblTime_2.setText("on Wednesday 10th of Feb, 2021");
			break;
			case "Thurs 11th of Feb, 2021" : lblTime_2.setText("on Thursday 11th of Feb, 2021");
			break;
			case "Fri 12th of Feb, 2021" : lblTime_2.setText("on Friday 12th of Feb, 2021");
			break;
			case "Sat 13th of Feb, 2021" : lblTime_2.setText("on Saturday 13th of Feb, 2021");
			break;
			case "Sun 14th of Feb, 2021" : lblTime_2.setText("on Sunday 14th of Feb, 2021");
			break;
			}
		}

	}
}

