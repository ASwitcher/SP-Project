
public class DocumentManager {
    private DocumentManager instance;
    private Book book;

    public DocumentManager getInstance() {
        if(instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book=book;
    }

}