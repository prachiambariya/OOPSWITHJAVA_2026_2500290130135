package Question_practice_mse1;
class Book{
    private String title;
    private String author;
    private double price;
    private String isbn;
    static int bookCount = 0;
    public static final String libraryName = "Sunrise Public Library";
Book(String title, String author, double price, String isbn){
    this.title = title;
    this.author = author;
    this.price = price;
    this.isbn = isbn;
    bookCount++; 
}
public String getTitle(){
    return title;
}
public String getAuthor(){
    return author;
}
public double getprice(){
    return price;
}
public String getisbn(){
    return isbn;
}
public void setTitle(String title){
    this.title = title;
}
public void setAuthor(String author){
    this.author = author;
}
public void setPrice(double price){
    this.price = price;
}
public void setisbn(String isbn){
    this.isbn = isbn;
}

}
public class UseCase1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "J.Author",350.0,"ISBN001");
        Book b2 = new Book("OOP Cpncepts","K.Writer", 420.0,"ISBN002");
        System.out.println(b1.getTitle()+ " by " + b1.getAuthor());
          System.out.println("Price: "+ b2.getprice());
           System.out.println("Library:" + Book.libraryName);
           System.out.println("Total books added: " +  Book.bookCount);
    }}
