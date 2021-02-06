import java.awt.BorderLayout;
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
import javax.swing.JScrollPane;
import javax.swing.Box;

public class Home_Nurse_v2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Nurse_v2 frame = new Home_Nurse_v2();
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
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 58, 1273, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setBounds(606, 5, 61, 30);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(5, 606, 1273, 88);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnPatients = new JButton("Patients");
		btnPatients.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnPatients.setBounds(1019, 11, 244, 63);
		panel_3.add(btnPatients);
		
		JButton btnNewButton_8_1 = new JButton("Health History");
		btnNewButton_8_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnNewButton_8_1.setBounds(765, 11, 244, 63);
		panel_3.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("Chat");
		btnNewButton_8_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnNewButton_8_2.setBounds(511, 11, 244, 63);
		panel_3.add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("Appointments");
		btnNewButton_8_3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnNewButton_8_3.setBounds(257, 11, 244, 63);
		panel_3.add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("Home");
		btnNewButton_8_4.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		btnNewButton_8_4.setBounds(10, 11, 237, 63);
		panel_3.add(btnNewButton_8_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 117, 1273, 475);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		
		Box verticalBox = Box.createVerticalBox();
		panel_1.add(verticalBox);
	}
}
