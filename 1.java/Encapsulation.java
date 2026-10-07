package Encapsulation;
class Book{
    private int bookId;
    private String title;
    private String author;

Book(int bookId, String title, String author){
    this.bookId = bookId;
    this.title = title;
    this.author = author;
}

void displayBook(){
    System.out.println("BookId: " + bookId);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    
}
public String getTitle(){
    return title;
}
public void setTitle(String title){
    this.title = title;
}
}
public class Book_Library {
    public static void main(String[] args) {
        Book b1 = new Book(1 , "Atomic Habits" , "James Clear");
        b1.displayBook();
        b1.setTitle("Rich Dad Poor Dad");
        b1.displayBook();
        System.out.println("Current Title: "+ b1.getTitle());
    }}
