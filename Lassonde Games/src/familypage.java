import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class familypage extends JFrame implements ActionListener {
	JButton btnAppointment;
	private JPanel contentPane;
	JButton button_3;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public familypage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JPanel panel_1 = new JPanel();
		verticalBox.add(panel_1);
		
		JLabel label = new JLabel("PIMPS");
		label.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 28));
		panel_1.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setPreferredSize(new Dimension(
		        10, separator.getHeight()));
		separator.setBorder(BorderFactory.createLineBorder(Color.black));
		verticalBox.add(separator);
		
		JPanel panel_2 = new JPanel();
		verticalBox.add(panel_2);
		
		JLabel label_1 = new JLabel("HOME");
		label_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		
		Box horizontalBox = Box.createHorizontalBox();
		panel_3.add(horizontalBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 30, 0, 15));
		horizontalBox.add(panel_4);
		
		 btnAppointment = new JButton("Appointment");
		btnAppointment.addActionListener(this);
	
		
		btnAppointment.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnAppointment.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_4.add(btnAppointment);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_6);
		
		JButton btnHealthHistory = new JButton("Health History");
		btnHealthHistory.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnHealthHistory.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_6.add(btnHealthHistory);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_8);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnHome.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_8.add(btnHome);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_7);
		
		 button_3 = new JButton("CHAT");
		button_3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		button_3.addActionListener(this);
		button_3.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_7.add(button_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 15, 00, 30));
		horizontalBox.add(panel_5);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnSettings.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_5.add(btnSettings);
		JPanel ContentPanel = new JPanel();
		JScrollPane scrollPane = new JScrollPane(ContentPanel);
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://uotdstg5jvrcd8yk:fVeY9ucgSAUtu76kmXub@bd6vfmkifafz8jqz771d-mysql.services.clever-cloud.com:3306/bd6vfmkifafz8jqz771d", "uotdstg5jvrcd8yk", "fVeY9ucgSAUtu76kmXub");
			String GetInfo = "Select * from content";
			 Statement sta = connection.createStatement();
        	ResultSet result = sta.executeQuery(GetInfo);
        	
        	while(result.next()) {
        	Blob imageBlob = result.getBlob(3);
        	InputStream in = imageBlob.getBinaryStream();  
        	BufferedImage image = ImageIO.read(in);
        	ImageIcon myImage = new ImageIcon(image);
        	JLabel pic = new JLabel();
        	pic.setIcon(myImage);
        	ContentPanel.add(pic);
        	String Caption = result.getString(4);
        	JLabel caption = new JLabel(Caption);
        	ContentPanel.add(caption);
        	
        	
        	}
        	connection.close();
		}
		
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		contentPane.add(scrollPane, BorderLayout.CENTER);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button_3) {
			this.setVisible(false);
			new familychat();
		}
		if(e.getSource() == btnAppointment) {
			this.setVisible(false);
			new Appointments();
		}
		
	}

}
