package pattern.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook(new Book("aaaa"));
        bookShelf.appendBook(new Book("bbbb"));
        bookShelf.appendBook(new Book("cccc"));
        bookShelf.appendBook(new Book("dddd"));
        bookShelf.appendBook(new Book("eee"));
        bookShelf.appendBook(new Book("fff"));
        bookShelf.appendBook(new Book("ggg"));
        bookShelf.appendBook(new Book("hhh"));
        bookShelf.appendBook(new Book("iii"));
        bookShelf.appendBook(new Book("jjj"));
        bookShelf.appendBook(new Book("kkk"));
        bookShelf.appendBook(new Book("mmm"));
        bookShelf.appendBook(new Book("lll"));
        bookShelf.appendBook(new Book("rrr"));
        bookShelf.appendBook(new Book("sss"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
