package pattern.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("aaaa"));
        bookShelf.appendBook(new Book("bbbb"));
        bookShelf.appendBook(new Book("cccc"));
        bookShelf.appendBook(new Book("dddd"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
