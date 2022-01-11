import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors = new ArrayList<Author>();
    private List<Element> content = new ArrayList<Element>();

    Book(String bookTitle) {
        title = bookTitle;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int addContent(Element e) {
        content.add(e);
        return content.indexOf(e);
    }

    public void removeContent(Element e) {
        content.remove(e);
    }

    public Element getElement(int index) {
        return content.get(index);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println();
        System.out.println("Authors: ");
        for (Author a : authors) {
            a.print();
        }
        System.out.println();
        for (Element e : content) {
            e.print();
        }

    }
}