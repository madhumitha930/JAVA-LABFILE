class LibraryBook {
    String title;

    LibraryBook(String title) {
        this.title = title;
    }
}

public class Library {

    static LibraryBook modifyBook(LibraryBook b) {
        b.title = "Advanced Java";
        return b;
    }

    public static void main(String[] args) {

        LibraryBook b = new LibraryBook("Java");

        b = modifyBook(b);

        System.out.println("Book Title: " + b.title);
    }
}