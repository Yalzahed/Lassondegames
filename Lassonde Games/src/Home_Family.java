import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Home_Family implements ActionListener{
	
	JButton home_b;
	JButton appoint_b;
	JButton chat_b;
	JButton hist_b;
	JButton sett_b;
	
	public Home_Family(){
		JFrame home = new JFrame();
		JPanel layout = new JPanel(new BorderLayout());
		JPanel title_p  = new JPanel();
		JLabel title_n = new JLabel("Home");
		
		JPanel body = new JPanel();
		
		
		JPanel icons_p = new JPanel(new GridLayout(1,5));
		home_b = new JButton("Home");
		home_b.addActionListener(this);
		appoint_b = new JButton("Appointments");
		appoint_b.addActionListener(this);
		chat_b = new JButton("Chat");
		chat_b.addActionListener(this);
		hist_b = new JButton("Health History");
		hist_b.addActionListener(this);
		sett_b = new JButton("Settings");
		sett_b.addActionListener(this);
		
		title_p.add(title_n);
		icons_p.add(home_b);
		icons_p.add(appoint_b);
		icons_p.add(chat_b);
		icons_p.add(hist_b);
		icons_p.add(sett_b);
		layout.add(title_p, BorderLayout.PAGE_START);
		layout.add(body);
		layout.add(icons_p, BorderLayout.PAGE_END);
		
		
		home.setContentPane(layout);
		home.setSize(800, 500);
//		home.setSize(1920,1080);
		home.setVisible(true);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == home_b) {
			home_b.setBackground(Color.CYAN);
			System.out.println("Congrats!You have a working home button!");
		}
		else if (e.getSource() == appoint_b) {
			appoint_b.setBackground(Color.CYAN);
			System.out.println("Congrats!You have a working appointment button!");
		}
		else if (e.getSource() == chat_b) {
			chat_b.setBackground(Color.CYAN);
			System.out.println("Congrats!You have a working chat button!");
		}
		else if (e.getSource() == hist_b) {
			hist_b.setBackground(Color.CYAN);
			System.out.println("Congrats!You have a working history button!");
		}
		else if (e.getSource() == sett_b) {
			sett_b.setBackground(Color.CYAN);
			System.out.println("Congrats!You have a working settings button!");
		}
		System.out.println("out");
		
	}
	
}

