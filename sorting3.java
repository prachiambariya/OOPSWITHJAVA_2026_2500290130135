import java.util.ArrayList;
import java.util.Comparator;

class Lib{
    int bookID;
    String title;
    int page;
    Lib(int bookID, String title, int page){
        this.bookID = bookID;
        this.title = title;
        this.page = page;
    }
}
class LibComparator implements Comparator<Lib>{
    public int compare(Lib a, Lib b){
        if(a.page > b.page){
            return 1;
        }
        if(a.page<b.page){
            return -1;
        }
        return a.title.compareTo(b.title);
    }
}
public class sorting3{
    public static void main(String[] args) {
               ArrayList<Lib> books = new ArrayList<>();

        books.add(new Lib(101, "Java Basics", 150));
        books.add(new Lib(104, "Data Structures", 150));
        books.add(new Lib(103, "Computer Networks", 250));
        books.add(new Lib(102, "Operating Systems", 400));

        books.sort(new LibComparator());

        for (Lib b : books) {
            System.out.println(b.bookID + " " + b.title + " " + b.page);
        }
    }
}
