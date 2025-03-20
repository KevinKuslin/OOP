import java.util.*; 

public class Customer {
	private String name; 
	private int age; 
	ArrayList<Ticket> tickets = new ArrayList<>(); 
	
	public Customer(String name, int age) {
		this.name = name; 
		this.age = age; 
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket); 
	}
	
	public String getName() {
		return name; 
	}
	
	public int getAge() {
		return age; 
	}

	public ArrayList<Ticket> getTickets(){
        return tickets; 
    }
}
