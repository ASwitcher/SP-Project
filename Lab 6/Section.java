import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    public String title;
    public List<Element> content = new ArrayList<Element>();

    Section(String sectionTitle) {
        title = sectionTitle;
    }

    public int add(Element e) throws Exception {
        content.add(e);
        return content.indexOf(e);
    }

    public void remove(Element e) throws Exception {
        content.remove(e);
    }

    public Element getElement(int index) throws Exception {
        return content.get(index);

    }
    @Override
    public void render() {
        System.out.println(title);
        for (Element e : content) {
            e.render();
        }
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}