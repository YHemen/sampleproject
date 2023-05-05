package simpleproject;

public class LoginAuthentication {

	private String username;
	private String password;
	
	public boolean validateuser(String username, String password) {
		if(username.equals("admin") && password.equals("admin123")) {
			return true;
		}
		else {
			return false;
		}
	}
}
