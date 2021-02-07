import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class nursechat extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	JButton btnNewButton;
	JTextArea textArea;
	String name;
	
	public nursechat(String chatName) {
		
		name = chatName;
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

	JLabel label_1 = new JLabel("Chat with " + name.substring(0,name.length()-5));
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
	ContentPanel.setLayout(new BorderLayout(0, 0));
	
	JPanel panel_9 = new JPanel();
	ContentPanel.add(panel_9, BorderLayout.SOUTH);
	GridBagLayout gbl_panel_9 = new GridBagLayout();
	gbl_panel_9.columnWidths = new int[]{1365, 0, 0};
	gbl_panel_9.rowHeights = new int[]{0, 0};
	gbl_panel_9.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
	gbl_panel_9.rowWeights = new double[]{1.0, Double.MIN_VALUE};
	panel_9.setLayout(gbl_panel_9);
	
	 textArea = new JTextArea();
	textArea.setRows(5);
	GridBagConstraints gbc_textArea = new GridBagConstraints();
	gbc_textArea.insets = new Insets(0, 0, 0, 5);
	gbc_textArea.fill = GridBagConstraints.BOTH;
	gbc_textArea.gridx = 0;
	gbc_textArea.gridy = 0;
	panel_9.add(textArea, gbc_textArea);
	
	 btnNewButton = new JButton("SEND");
	btnNewButton.addActionListener(this); 
	GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	gbc_btnNewButton.gridx = 1;
	gbc_btnNewButton.gridy = 0;
	panel_9.add(btnNewButton, gbc_btnNewButton);
	
	
	contentPane.add(scrollPane, BorderLayout.CENTER);
	this.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == btnNewButton) {
		textArea.getText();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://uotdstg5jvrcd8yk:fVeY9ucgSAUtu76kmXub@bd6vfmkifafz8jqz771d-mysql.services.clever-cloud.com:3306/bd6vfmkifafz8jqz771d", "uotdstg5jvrcd8yk", "fVeY9ucgSAUtu76kmXub");
			String query = "INSERT INTO " + name+" values( "+Users.random()+" ,'"+name.substring(0,name.length()-5)+"','" + textArea.getText() + "')";
			Statement sta = connection.createStatement();
			int x = sta.executeUpdate(query);
			 if (x == 0) {
				 System.out.println("message was not uploaded");
			 }
			 else {
				 System.out.println("message sent");
			 }
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
}

}

}

