import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
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
import java.awt.event.ActionEvent;

public class familypage extends JFrame {

	private JPanel contentPane;

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
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
