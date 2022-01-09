public class Table implements Element {

    private String title;

    Table(String tableTitle) {
        title = tableTitle;
    }

    public void print() {
        System.out.println("Table with Title: " + title);
    }

    public int add(Element elem) throws Exception {
        throw new Exception("Error");
    }

    public void remove(Element elem) throws Exception {
        throw new Exception("Error");

    }

    public Element getElement(int index) throws Exception {
        throw new Exception("Error");
    }
}