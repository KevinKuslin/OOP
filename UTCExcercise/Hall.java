import java.util.*; 

public class Hall {
	private int hallNumber; 
	private int capacity; 
	ArrayList<Showtime> showtimes = new ArrayList<>(); 
	
	public Hall(int hallNumber, int capacity) {
		this.hallNumber = hallNumber; 
		this.capacity = capacity; 
	}
	
	public void addShowtime(Showtime showtime) {
		showtimes.add(showtime); 
	}
	
	public int getHallNumber() {
		return hallNumber; 
	}
	
	public int getCapacity() {
		return capacity; 
	}

    public ArrayList<Showtime> getShowtimes(){
        return showtimes; 
    }
}
