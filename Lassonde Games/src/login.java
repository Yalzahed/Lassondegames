
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class login extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("REGESTER");
    JCheckBox showPassword = new JCheckBox("Show Password");
    Users user;

    public login() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        this.setVisible(true);
        this.setTitle("Login Form");
        this.setVisible(true);
        this.setSize(800,400);
        this.setBounds(10, 10, 370, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
    	
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
           try{
        	   Connection connection = DriverManager.getConnection("jdbc:mysql://uotdstg5jvrcd8yk:fVeY9ucgSAUtu76kmXub@bd6vfmkifafz8jqz771d-mysql.services.clever-cloud.com:3306/bd6vfmkifafz8jqz771d", "uotdstg5jvrcd8yk", "fVeY9ucgSAUtu76kmXub");
               String query = "Select * from account Where user_name='" + userText + "' and password='" + pwdText + "'";
               Statement sta = connection.createStatement();
               ResultSet x = sta.executeQuery(query);
               
            if (x.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful ");
                String ifNurse = "Select * from account Where user_name='" + userText + "' and password='" + pwdText + "'" +" and account_type='Nurse'";
                ResultSet y = sta.executeQuery(ifNurse);
                if(y.next()) {
                	String GetInfo = "Select * from account Where user_name='" + userText + "' and password='" + pwdText + "'";
                	ResultSet result = sta.executeQuery(GetInfo);
                	result.next();
                	user = new Users();
                	user.setName(result.getString(1));
                	System.out.println(user.name);
                	user.setPatient(result.getString(2));
                	System.out.println(user.patient);
                	user.setUserName(result.getString(3));
                	System.out.println(user.userName);
                	user.setEmail(result.getString(5));
                	System.out.println(user.email);
                	user.setType(result.getString(6));
                	System.out.println(user.type);
                	this.setVisible(false);
                	new Home_Nurse();
                	connection.close();
                }
                else {
                	String GetInfo = "Select * from account Where user_name='" + userText + "' and password='" + pwdText + "'";
                	ResultSet result = sta.executeQuery(GetInfo);
                	result.next();
                	user = new Users();
                	user.setName(result.getString(1));
                	System.out.println(user.name);
                	user.setPatient(result.getString(2));
                	System.out.println(user.patient);
                	user.setUserName(result.getString(3));
                	System.out.println(user.userName);
                	user.setEmail(result.getString(5));
                	System.out.println(user.email);
                	user.setType(result.getString(6));
                	System.out.println(user.type);
                	this.setVisible(false);
                	new familypage();
                	connection.close();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
           catch (Exception exception) {
               exception.printStackTrace();
           }
        
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "password");
//
//            String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
//                password + "','" + emailId + "','" + mobileNumber + "')";
//
//            Statement sta = connection.createStatement();
//            int x = sta.executeUpdate(query);
//            if (x == 0) {
//                JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
//            } else {
//                JOptionPane.showMessageDialog(btnNewButton,
//                    "Welcome, " + msg + "Your account is sucessfully created");
//            }
//            connection.close();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
        }
        
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            this.setVisible(false);
            new Registration();
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }

}



