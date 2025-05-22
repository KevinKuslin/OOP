package Main;

public abstract class Message{
	private ILogin ilogin; 
	private String sender; 
	private String recipient; 
	private String content; 
	
	public Message(ILogin ilogin, String sender, String recipient, String content) {
		this.ilogin = ilogin;
		this.sender = sender;
		this.recipient = recipient;
		this.content = content;
	}

	public abstract void send(String username, String password);

	public ILogin getIlogin() {
		return ilogin;
	}

	public void setIlogin(ILogin ilogin) {
		this.ilogin = ilogin;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 
	
	
}
