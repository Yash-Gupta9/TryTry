public class Main {

    public static void main(String[] args) {

        LibraryManagement library = new LibraryManagement(5);

        library.addBook(new Book(101, "Algorithms", "Thomas Cormen"));
        library.addBook(new Book(102, "Clean Code", "Robert Martin"));
        library.addBook(new Book(103, "Design Patterns", "Erich Gamma"));
        library.addBook(new Book(104, "Java Programming", "Herbert Schildt"));

        System.out.println("Library Books:");
        library.displayBooks();

        System.out.println("\nLinear Search:");
        library.linearSearch("Java Programming");

        System.out.println("\nBinary Search:");
        library.binarySearch("Java Programming");
    }
}