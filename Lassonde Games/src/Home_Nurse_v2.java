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
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{776, 0};
		gbl_contentPane.rowHeights = new int[]{48, 50, 278, 71, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.anchor = GridBagConstraints.NORTH;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		contentPane.add(panel_2, gbc_panel_2);
		
		JLabel lblPimps = new JLabel("PIMPS");
		lblPimps.setHorizontalAlignment(SwingConstants.CENTER);
		lblPimps.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 28));
		panel_2.add(lblPimps);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		contentPane.add(panel_1, gbc_panel_1);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		contentPane.add(panel_3, gbc_panel_3);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Appointments");
		btnNewButton_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 15));
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Chat");
		btnNewButton_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Health \r\nHistory");
		btnNewButton_3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 15));
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Patients");
		btnNewButton_4.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 22));
		panel_3.add(btnNewButton_4);
	}
}
