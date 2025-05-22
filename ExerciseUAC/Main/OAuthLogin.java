package Main;

public class OAuthLogin implements ILogin{
	private String token;

	public OAuthLogin(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public int authenticate(String username, String password) {
		if(!password.equals(token)) return 0; 
		return 1; 
	} 
	
	
}
