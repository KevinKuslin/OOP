import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookList = new ArrayList<Book>(); 

    public void addBook(Book book){
        bookList.add(book); 
        System.out.println("Book added to library: " + book.getTitle()); 
    }

    public void borrowBook(Borrower borrower, Book book){
        borrower.borrow(book); 
        bookList.remove(book); 
        System.out.println(borrower.getBorrower() + " borrowed: " + book.getTitle()); 
    }

    public void returnBook(Borrower borrower, Book book){
        borrower.returnBook(book); 
        bookList.add(book); 
        System.out.println(borrower.getBorrower() + " returned: " + book.getTitle()); 
    }

    public void displayLibraryBooks(){
        int flag = 0; 
        for(Book book : bookList){
            if(flag == 0){
                System.out.println("Books in Library:"); 
                flag=1; 
            }
            System.out.println(book); 
            System.out.println("----------------------"); 
        } 
    }
}
