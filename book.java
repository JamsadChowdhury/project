class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "JC";
        author = "Jamsad";
        price = 0.0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("JC", "Jamsad");
        Book b3 = new Book("JC", "Jamsad", 550.0);

        b1.display();
        b2.display();
        b3.display();
    }
}
