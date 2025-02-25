public class Book {
    String title;
    String author;
    int pageCount;
    boolean isHardcover;

    public Book(String title, String author, int pages, boolean hardcover) {
        this.title = title;
        this.author = author;
        this.pageCount = pages;
        this.isHardcover = hardcover;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pageCount);
        System.out.println("Hardcover: " + isHardcover);
    }
}
