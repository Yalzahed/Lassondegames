import java.util.Random;

public class Users {
	static String name;
	static String patient;
	static String userName;
	static String email;
	static String type;
	
	public Users() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public static int random() {
		Random rd = new Random();
		return rd.nextInt();
	}

}

