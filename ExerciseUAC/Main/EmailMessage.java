package Main;

public class EmailMessage extends Message{

	public EmailMessage(ILogin ilogin, String sender, String recipient, String content) {
		super(ilogin, sender, recipient, content);
	}
	
	@Override
	public void send(String username, String password) {
		if(this.getIlogin().authenticate(username, password) == 0) System.out.println("Email authentication failed for user: " + username);
		else System.out.println("Email sent from " + this.getSender() + " to " + this.getRecipient() + ": " + this.getContent()); 
	}
	
}
