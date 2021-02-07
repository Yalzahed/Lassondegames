import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class nurse_messages extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton chat1;
	JButton chat2;
	JButton chat3;
	JButton chat4;
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public nurse_messages() {
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

		JLabel label_1 = new JLabel("CHAT");
		label_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		panel_2.add(label_1);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);

		Box horizontalBox = Box.createHorizontalBox();
		panel_3.add(horizontalBox);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 30, 0, 15));
		horizontalBox.add(panel_4);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		button.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_4.add(button);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_6);

		JButton button_2 = new JButton("New button");
		button_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		button_2.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_6.add(button_2);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_8);

		JButton button_4 = new JButton("New button");
		button_4.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		button_4.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_8.add(button_4);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 15, 00, 15));
		horizontalBox.add(panel_7);

		JButton button_3 = new JButton("New button");
		button_3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		button_3.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_7.add(button_3);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 15, 00, 30));
		horizontalBox.add(panel_5);

		JButton button_1 = new JButton("New button");
		button_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		button_1.setBorder(new EmptyBorder(15, 25, 15, 25));
		panel_5.add(button_1);

		JPanel ContentPanel = new JPanel();
		JScrollPane scrollPane = new JScrollPane(ContentPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		ContentPanel.setLayout(new BoxLayout(ContentPanel, BoxLayout.Y_AXIS));
		
//		JPanel panel_9 = new JPanel();
//		ContentPanel.add(panel_9, BorderLayout.SOUTH);
//		GridBagLayout gbl_panel_9 = new GridBagLayout();
//		gbl_panel_9.columnWidths = new int[]{1365, 0, 0};
//		gbl_panel_9.rowHeights = new int[]{0, 0};
//		gbl_panel_9.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		gbl_panel_9.rowWeights = new double[]{1.0, Double.MIN_VALUE};
//		panel_9.setLayout(gbl_panel_9);
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://uotdstg5jvrcd8yk:fVeY9ucgSAUtu76kmXub@bd6vfmkifafz8jqz771d-mysql.services.clever-cloud.com:3306/bd6vfmkifafz8jqz771d", "uotdstg5jvrcd8yk", "fVeY9ucgSAUtu76kmXub");
			String GetInfo = "Select * from chat_tables";
			 Statement sta = connection.createStatement();
        	ResultSet result = sta.executeQuery(GetInfo);
        	
        	List<String> arr= new ArrayList<String>();
        	int i =0;
        	while(result.next()) {
        		arr.add(result.getString(1));
        	}
        	int len = arr.size();
        	if (len == 1) {
        		chat1 = new JButton(arr.get(0));
        		chat1.setPreferredSize((new Dimension(200, 200)));
        		chat1.addActionListener(this);
        		ContentPanel.add(chat1);
        	}
        	else if (len == 2) {
        		chat1 = new JButton(arr.get(0));
        		chat1.addActionListener(this);
        		chat2 = new JButton(arr.get(1));
        		chat2.addActionListener(this);
        		ContentPanel.add(chat1);
        		ContentPanel.add(chat2);
        	}
        	else if (len == 3) {
        		chat1 = new JButton(arr.get(0));
        		chat1.addActionListener(this);
        		chat2 = new JButton(arr.get(1));
        		chat2.addActionListener(this);
        		chat3 = new JButton(arr.get(2));
        		chat3.addActionListener(this);
        		ContentPanel.add(chat1);
        		ContentPanel.add(chat2);
        		ContentPanel.add(chat3);
        	
        	}
        	else if (len == 4) {
        		chat1 = new JButton(arr.get(0));
        		chat1.addActionListener(this);
        		chat2 = new JButton(arr.get(1));
        		chat2.addActionListener(this);
        		chat3 = new JButton(arr.get(2));
        		chat3.addActionListener(this);
        		chat4 = new JButton(arr.get(3));
        		chat4.addActionListener(this);
        		ContentPanel.add(chat1);
        		ContentPanel.add(chat2);
        		ContentPanel.add(chat3);
        		ContentPanel.add(chat4);
        	}
        	else {
        		System.out.println("exeeced the number of chats for this demo");
        	}
        	connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==chat1) {
System.out.println(chat1.getText());
			this.setVisible(false);
			new nursechat(chat1.getText());
		}
		
		if(e.getSource()==chat2) {
			new nursechat(chat2.getText());
		}
		if(e.getSource()==chat3) {
			new nursechat(chat3.getText());
		}
		if(e.getSource()==chat4) {
			new nursechat(chat4.getText());
		}
	}

}
