public class ImageProxy implements Element, Picture {
    private String imageName;
    private Image realImage = null;

    ImageProxy(String name) {
        imageName = name;
    }

    public void print() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        realImage.print();
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
