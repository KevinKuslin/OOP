import java.util.ArrayList;

public class Borrower {
    private String borrower; 
    ArrayList<Book> borrowedBook = new ArrayList<Book>(); 

    public Borrower(String borrower){
        this.borrower = borrower; 
    }

    public String getBorrower(){
        return borrower; 
    }

    public void borrow(Book book){
        borrowedBook.add(book); 
    }

    public void returnBook(Book book){
        borrowedBook.remove(book); 
    }

    public void displayBorrowedBooks(){
        int flag = 0; 
        for(Book book : borrowedBook){
            if(flag == 0){
                System.out.println(borrower + "'s Borrowed Books:"); 
                flag=1; 
            }
            System.out.println(book); 
            System.out.println("----------------------"); 
        }
    }
}
