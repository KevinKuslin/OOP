import java.util.*; 

public class Main{

    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        Board board = new Board();  
        int count = 1, x, y; 
        while(count <= 9){
            board.printBoard(); 
            System.out.printf("Player %d move: ", count%2 == 1? 1 : 2); 
            x = sc.nextInt(); 
            y = sc.nextInt(); 
            if(board.gameBoard[y][x].equals("-") == false){
                System.out.println("The area has been occupied. Retry input."); 
                continue; 
            }
            Game.move(board, count, x, y); 
            
            if(Game.validate(board) == 1){
                board.printBoard(); 
                if(count % 2 == 1) System.out.println("Player 1 (O) has won!"); 
                else System.out.println("Player 2 (X) has won!"); 
                break; 
            } 
            count++;
        }
    }
}