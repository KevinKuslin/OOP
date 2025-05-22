package LSP; 
import java.util.*; 

public class App {
		public static void main(String[] args) {
				ArrayList<Bird> birds = new ArrayList<>();
				
				birds.add(new Ostrich());
				birds.add(new Bird());
				
				for (Bird b : birds) {
						b.move();
				}
		}
}