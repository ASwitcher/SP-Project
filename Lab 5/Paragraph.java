public class Paragraph implements Element {
    private String text;
    private AlignStrategy align;

    Paragraph(String paragraphText) {
        text = paragraphText;
    }
    public AlignStrategy getAlignStrategy() {
        return align;
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
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