public class TableOfContent implements Element {

    private String title;


    public int add(Element elem) throws Exception {
        throw new Exception("Error");
    }

    @Override
    public void remove(Element e) {

    }

    public Element getElement(int index) throws Exception {
        throw new Exception("Error");
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void render() {
        System.out.print("Table: "+this.title);
    }
}