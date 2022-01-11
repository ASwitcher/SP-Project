public class Paragraph implements Element {
    private String text;

    Paragraph(String paragraphText) {
        text = paragraphText;
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

    @Override
    public void print() {
        System.out.println(text);
    }
}