import java.util.*; 

public class Cinema {
	private String name; 
	private String location; 
	ArrayList<Hall> halls = new ArrayList<>();
	ArrayList<Employee> employees = new ArrayList<>(); 
	
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public ArrayList<Hall> getHalls() {
		return halls;
	}
	
	public ArrayList<Employee> getEmployee(){
		return employees; 
	}

	public Cinema(String name, String location) {
		this.name = name;
		this.location = location; 
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee); 
	} 
	
	public void addHall(Hall hall) {
		halls.add(hall); 
	}
	
	public void displayCinemaInfo() {
		System.out.println("Cinema: " + name); 
		System.out.println("Location: " + location); 
		System.out.println(); 
		System.out.println("Employees:"); 
		for(Employee employee : employees) {
			System.out.println("- Name: " + employee.getName() + ", Role: " + employee.getRole());   
		}
		System.out.println(); 
		System.out.println("Halls:"); 
		for(Hall hall : halls) {
			System.out.println("Hall " + hall.getHallNumber() + " (Capacity: " + hall.getCapacity() + ")");  
			for(Showtime showtime : hall.getShowtimes()) {
				System.out.println("  Showtimes:"); 
				Movie movie = showtime.getMovie(); 
				System.out.println("    - Movie: " + movie.getTitle()); 
				System.out.println("      Time: " + showtime.getTime() + ", Date: " + showtime.getDate()); 
				System.out.print("      Tickets:"); 
				if(showtime.getTickets().size() == 0) System.out.println(" No tickets booked yet."); 
				else {
					System.out.println(); 
					for(Ticket ticket : showtime.getTickets()) {
						System.out.println("      * Ticket ID: " + ticket.getId() + ", Price: $" + ticket.getPrice() + ", Customer: " + ticket.getCustomer().getName() + ", Payment Status: " + ticket.getPaymentStatus());  
					}
				}
			}
			System.out.println(); 
		}
		
		System.out.println("Customers:"); 
		ArrayList<Customer> printedCustomer = new ArrayList<>(); 
		for(Hall hall : halls) {
			for(Showtime showtime : hall.getShowtimes()) {
				for(Ticket ticket : showtime.getTickets()) {
					Customer customer = ticket.getCustomer(); 
					if(printedCustomer.contains(customer)) {
						continue; 
					}
					printedCustomer.add(customer); 
					System.out.println("- Name: " + customer.getName() + ", Age: " + customer.getAge()); 
					System.out.println("  Tickets:"); 
					for(Ticket ticket2 : customer.getTickets()) {
						System.out.println("    * Ticket ID: " + ticket2.getId() + ", Movie: " + showtime.getMovie().getTitle() + ", Showtime: " + showtime.getTime() + ", Date: " + showtime.getDate() + ", Price: $" + ticket2.getPrice() + ", Status: " + ticket2.getPaymentStatus());  
					}
				}
			}
		}
	}
}
