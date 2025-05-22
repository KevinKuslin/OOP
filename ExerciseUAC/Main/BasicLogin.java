package Main;

public class BasicLogin implements ILogin{
	private String username; 
	private String password; 
	
	public BasicLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int authenticate(String username, String password) {
		if(!username.equals(this.getUsername()) || !password.equals(this.getPassword())) return 0; 
		return 1;
	} 
	
}
