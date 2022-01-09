public class ImageProxy implements Element, Picture {
    private String imageName;
    private Image realImage = null;

    ImageProxy(String name) {
        imageName = name;
    }

    public void render() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        realImage.render();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public int add(Element e) throws Exception {
        throw new Exception("Error");
    }

    public void remove(Element e) throws Exception {
        throw new Exception("Error");

    }

    public Element getElement(int index) throws Exception {
        throw new Exception("Error");
    }
}