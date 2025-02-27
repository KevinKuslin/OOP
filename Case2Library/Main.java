import java.util.ArrayList; 

public class Main{

    public Main(){
        Author author1 = new Author("James Gosling", "Creator of the Java programming language.");
        Author author2 = new Author("Robert C. Martin", "Known for his works on software craftsmanship.");
        
        Book book1 = new Book("Java Programming", "123456789", author1); 
        Book book2 = new Book("Clean Code", "987654321", author2); 

        Library library = new Library();

        library.addBook(book1); 
        library.addBook(book2); 

        Borrower borrower = new Borrower("Alice");

        library.borrowBook(borrower, book1);
        library.borrowBook(borrower, book2); 

        borrower.displayBorrowedBooks();

        library.returnBook(borrower, book1); 

        borrower.displayBorrowedBooks();
        
        library.displayLibraryBooks();
    }
    public static void main(String[] args){
        new Main(); 
    }
}

class Author{
    private String author; 
    private String biography; 

    public Author(String author, String biography){
        this.author = author; 
        this.biography = biography; 
    }

    public String getAuthor(){
        return author; 
    }

    public String getBiography(){
        return biography;
    }
}

class Book{
    private String title; 
    private String id; 
    private String author; 
    private String biography; 

    public Book(String title, String id, Author author){
        this.title = title; 
        this.id = id; 
        this.author = author.getAuthor(); 
        this.biography = author.getBiography(); 
    }

    public String getTitle(){
        return title; 
    }

    public String getId(){
        return id; 
    }

    public String getAuthor(){
        return author; 
    }

    public String getBiography(){
        return biography; 
    }

    public String toString(){
        return "Title: " + title + "\nISBN: " + id + "\nAuthor: " + author + "\nBiography: " + biography + "\n";
    }
}

class Borrower{
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

class Library{
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