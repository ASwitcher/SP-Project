public interface Element {

    public int add(Element elem) throws Exception;
    public void remove(Element elem) throws Exception;
    public Element getElement(int index) throws Exception;
    public void accept(Visitor v);
    public void render();
}