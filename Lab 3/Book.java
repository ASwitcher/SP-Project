import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chaptersList = new ArrayList<>();

    public Book(){}

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuthor(Author author)
    {
        authors.add(author);
    }

    public int createChapter(String chapterName){
        Chapter ch = new Chapter(chapterName);
        chaptersList.add(ch);

        return chaptersList.indexOf(ch);
    }

    public Chapter getChapter(int index){
        return chaptersList.get(index);
    }

    public void print(){
        System.out.println("Book: " + title + "\n");

        System.out.println("List of authors: ");
        for (Author author : authors){
            author.print();
        }

        for(Chapter ch : chaptersList){
            ch.print();
        }
    }
}
