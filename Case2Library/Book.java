public class Book {
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
        return "Title: " + title + "\nISBN: " + id + "\nAuthor: " + author + "\nBiography: " + biography;
    }
}
