import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;

    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void render() {
        System.out.println("Image with name:" + imageName);
    }

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