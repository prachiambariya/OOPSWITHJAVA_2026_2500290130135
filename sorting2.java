import java.util.*;

class Product {
    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

// Comparator class
class ProductComparator implements Comparator<Product> {

    public int compare(Product a, Product b) {

        // Price: highest to lowest
        if (a.price != b.price) {
            return b.price - a.price;
        }

        // Same price: alphabetical order
        return a.name.compareTo(b.name);
    }
}

public class sorting2 {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Mobile", 60000));
        products.add(new Product(2, "Laptop", 60000));
        products.add(new Product(3, "Tablet", 30000));
        products.add(new Product(4, "Mouse", 1000));

        Collections.sort(products, new ProductComparator());

        for (Product p : products) {
            System.out.println(p.name + " " + p.price);
        }
    }
}
