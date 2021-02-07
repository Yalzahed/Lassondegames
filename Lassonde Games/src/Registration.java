import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Registration extends JFrame implements ActionListener{
	  private static final long serialVersionUID = 1L;
	  	
	    private JPanel contentPane;
	    private JTextField name;
	    private JTextField patientName;
	    private JTextField accountType;
	    private JTextField username;
	    private JTextField email;
	    private JPasswordField passwordField;
	    private JButton btnNewButton;
	
	public Registration() {
		
		 setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(450, 190, 1014, 597);
	        setResizable(false);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JLabel lblNewUserRegister = new JLabel("New User Register");
	        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
	        lblNewUserRegister.setBounds(362, 52, 325, 50);
	        contentPane.add(lblNewUserRegister);

	        JLabel lblName = new JLabel("Name");
	        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblName.setBounds(58, 152, 99, 43);
	        contentPane.add(lblName);

	        JLabel lblNewLabel = new JLabel("Patient");
	        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblNewLabel.setBounds(58, 243, 110, 29);
	        contentPane.add(lblNewLabel);

	        JLabel lblEmailAddress = new JLabel("Email\r\n address");
	        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblEmailAddress.setBounds(58, 324, 124, 36);
	        contentPane.add(lblEmailAddress);

	        name = new JTextField();
	        name.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        name.setBounds(214, 151, 228, 50);
	        contentPane.add(name);
	        name.setColumns(10);

	        patientName = new JTextField();
	        patientName.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        patientName.setBounds(214, 235, 228, 50);
	        contentPane.add(patientName);
	        patientName.setColumns(10);

	        email = new JTextField();

	        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        email.setBounds(214, 320, 228, 50);
	        contentPane.add(email);
	        email.setColumns(10);

	        username = new JTextField();
	        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        username.setBounds(707, 151, 228, 50);
	        contentPane.add(username);
	        username.setColumns(10);

	        JLabel lblUsername = new JLabel("Username");
	        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblUsername.setBounds(542, 159, 99, 29);
	        contentPane.add(lblUsername);

	        JLabel lblPassword = new JLabel("Password");
	        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblPassword.setBounds(542, 245, 99, 24);
	        contentPane.add(lblPassword);

	        JLabel lblMobileNumber = new JLabel("Account Type");
	        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblMobileNumber.setBounds(542, 329, 139, 26);
	        contentPane.add(lblMobileNumber);

	        accountType = new JTextField();
	        accountType.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        accountType.setBounds(707, 320, 228, 50);
	        contentPane.add(accountType);
	        accountType.setColumns(10);

	        passwordField = new JPasswordField();
	        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        passwordField.setBounds(707, 235, 228, 50);
	        contentPane.add(passwordField);

	        btnNewButton = new JButton("Register");
	        btnNewButton.addActionListener(this);
	            
	        
	        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
	        btnNewButton.setBounds(399, 447, 259, 74);
	        contentPane.add(btnNewButton);
	     this.setVisible(true);   
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String  user= name.getText();
        String patientname = patientName.getText();
        String emailId = email.getText();
        String userName = username.getText();
        String accounttype = accountType.getText();
        
        String password = passwordField.getText();

        String msg = "" + user;
        msg += " \n";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://uotdstg5jvrcd8yk:fVeY9ucgSAUtu76kmXub@bd6vfmkifafz8jqz771d-mysql.services.clever-cloud.com:3306/bd6vfmkifafz8jqz771d", "uotdstg5jvrcd8yk", "fVeY9ucgSAUtu76kmXub");

            String query = "INSERT INTO account values('" + user + "','" + patientname + "','" + userName + "','" +
                password + "','" + emailId + "','" + accounttype + "')";

            Statement sta = connection.createStatement();
            int x = sta.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
            } else {
            	 String ifNurse = "Select * from account Where user_name='" + userName + "' and password='" + password + "'" +" and account_type='Nurse'";
                 ResultSet y = sta.executeQuery(ifNurse);
                 if(y.next()) {
                	 JOptionPane.showMessageDialog(btnNewButton,
                             "Welcome, " + msg + "Your account is sucessfully created");
                         connection.close();
                 }
                 else {
                	 String myTableName = "CREATE TABLE "+userName+"_chat (" 
                	            + "idNo INT(64) NOT NULL AUTO_INCREMENT,"  
                	            + "reciever varchar(250) NOT NULL," 
                	            + "user_message varchar(1000),"
                	            + "primary key (idNo))"
                	            ;
                	 String intoChatTable = "INSERT INTO chat_tables values('" + userName+"_chat', "+Users.random()+")";
                	 try {
                		 sta.executeUpdate(myTableName);
                		 sta.executeUpdate(intoChatTable);
                		 System.out.println("Table Created");
                	 }
                	 catch (SQLException e1 ) {
                	        System.out.println("An error has occured on Table Creation");
                	        e1.printStackTrace();
                	    }
                	 connection.close();
                	 
                 }
                 
                 
                JOptionPane.showMessageDialog(btnNewButton,
                    "Welcome, " + msg + "Your account is sucessfully created");
                connection.close();
                this.setVisible(false);
                new login();
                
            }
           
        } catch (Exception exception) {
            exception.printStackTrace();
        }
	}

	
	}