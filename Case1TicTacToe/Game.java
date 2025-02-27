public class Game {
    public static void move(Board board, int count, int x, int y){
        if(count % 2 == 1) board.gameBoard[y][x] = "O"; 
        else board.gameBoard[y][x] = "X"; 
    }

    public static int validate(Board board){
        //Cek Horizontal 
        int count = 0; 
        for(int i=0; i<3; i++){
            count = 0; 
            for(int j=1; j<3; j++){
                if(board.gameBoard[i][j].equals("-") == false && board.gameBoard[i][j].equals(board.gameBoard[i][j-1])){
                    count++; 
                }
                if(count == 2) return 1; 
            }
        }

        //Cek Vertikal 
        for(int i=0; i<3; i++){
            count = 0; 
            for(int j=1; j<3; j++){
                if(board.gameBoard[j][i].equals("-") == false && board.gameBoard[j][i].equals(board.gameBoard[j-1][i])){
                    count++; 
                }
                if(count == 2) return 1; 
            }
        }

        //Cek Diagonal Turun 
        count = 0; 
        for(int i=1; i<3; i++){
            if(board.gameBoard[i][i].equals("-") == false && board.gameBoard[i][i].equals(board.gameBoard[i-1][i-1])){
                count++; 
            }
            if(count == 2) return 1; 
        }

        //Cek Diagonal Naik 
        count = 0; 
        for(int i=1; i<3; i++){
            if(board.gameBoard[i][2-i].equals("-") == false && board.gameBoard[i][2-i].equals(board.gameBoard[i-1][3-i])){
                count++; 
            }
            if(count == 2) return 1; 
        }
        return 0; 
     }
}
