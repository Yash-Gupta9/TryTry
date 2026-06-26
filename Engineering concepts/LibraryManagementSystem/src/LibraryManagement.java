public class LibraryManagement {

    private Book[] books;
    private int count;

    public LibraryManagement(int size) {
        books = new Book[size];
        count = 0;
    }

    // Add Book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full.");
        }
    }

    // Linear Search
    public void linearSearch(String title) {

        for (int i = 0; i < count; i++) {

            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book Found (Linear Search):");
                books[i].displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Binary Search (Array must be sorted by title)
    public void binarySearch(String title) {

        int low = 0;
        int high = count - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = books[mid].getTitle().compareToIgnoreCase(title);

            if (result == 0) {
                System.out.println("Book Found (Binary Search):");
                books[mid].displayBook();
                return;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Book not found.");
    }

    // Display Books
    public void displayBooks() {

        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }
}