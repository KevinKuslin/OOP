public class Board {
    String[][] gameBoard = new String[3][3]; 

    public Board(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                gameBoard[i][j] = "-"; 
            }
        }
    }

    public void printBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(gameBoard[i][j]); 
            } 
            System.out.println(); 
        }
    }
}
