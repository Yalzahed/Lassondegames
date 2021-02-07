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
			new Uploading_Pic();
		    }
		}
		
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//        JFileChooser chooser = new JFileChooser();
//        chooser.showOpenDialog(null);
//        File f = chooser.getSelectedFile();
//        String filename = f.getAbsolutePath();
//        jTextField1.setText(filename);
//        try {
//            ImageIcon ii=new ImageIcon(scaleImage(120, 120, ImageIO.read(new File(f.getAbsolutePath()))));//get the image from file chooser and scale it to match JLabel size
//            jLabel1.setIcon(ii);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
//        BufferedImage bi;
//        bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
//        Graphics2D g2d = (Graphics2D) bi.createGraphics();
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
//        g2d.drawImage(img, 0, 0, w, h, null);
//        g2d.dispose();
//        return bi;
//    }
//    
//    ///////////
//    
//    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(WebAppImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(WebAppImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(WebAppImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(WebAppImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new WebAppImg().setVisible(true);
//            }
//        });
//        //Create a file chooser
//
//    }
//    // Variables declaration - do not modify
//    private javax.swing.JButton jButton1;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JTextField jTextField1;
//    // End of variables declaration
	

}


	
//	else if (e.getSource() == btnAddPic) {
//		btnAddPic.setBackground(Color.orange);
//		JFileChooser chooser = new JFileChooser();
//	    chooser.showOpenDialog(null);
//	    File f = chooser.getSelectedFile();
//	    String filename = f.getAbsolutePath();
//	    jTextField1.setText(filename);
//	    try {
//	        ImageIcon ii=new ImageIcon(scaleImage(120, 120, ImageIO.read(new File(f.getAbsolutePath()))));//get the image from file chooser and scale it to match JLabel size
//	        jLabel1.setIcon(ii);
//	    } catch (Exception ex) {
//	        ex.printStackTrace();
//	    }
//	}
	
	
	
	
//	private BufferedImage scaleImage(int i, int j, BufferedImage read) {
//		// TODO Auto-generated method stub
//		BufferedImage bi;
//	    bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
//	    Graphics2D g2d = (Graphics2D) bi.createGraphics();
//	    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//	    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
//	    g2d.drawImage(img, 0, 0, w, h, null);
//	    g2d.dispose();
//	    return bi;
//	}