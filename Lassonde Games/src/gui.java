import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class gui implements ActionListener {
	JButton button;
	
	public gui() {
	JFrame f = new JFrame();
	JPanel mainPanel = new JPanel(new GridLayout(10,1));
	JLabel label = new JLabel("hello");
	label.setHorizontalAlignment(JLabel.CENTER);
	 button = new JButton("clickme");
	button.addActionListener(this);
	mainPanel.add(label);
	mainPanel.add(button);
	
	f.setContentPane(mainPanel);
	f.setSize(400,500);
	f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			button.setBackground(Color.CYAN);
		}
		
	}
}
