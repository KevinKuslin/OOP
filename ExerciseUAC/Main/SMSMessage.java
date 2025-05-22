package Main;

public class SMSMessage extends Message{

	public SMSMessage(ILogin ilogin, String sender, String recipient, String content) {
		super(ilogin, sender, recipient, content);
	}

	@Override
	public void send(String username, String password) {
		if(this.getIlogin().authenticate("", password) == 0) System.out.println("SMS authentication failed for user: " + username);
		else System.out.println("SMS sent from " + this.getSender() + " to " + this.getRecipient() + ": " + this.getContent()); 
		
	}

}
