import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String name;
    public List<SubChapter> subChapterList = new ArrayList<>();

    public Chapter(String name) {
        name = this.name;
    }

    public int  createSubChapter(String subChapterName){
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapterList.add(subChapter);

        return subChapterList.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index){
        return subChapterList.get(index);
    }


    public void print(){
        System.out.println("Chapter " + name);
        for (SubChapter sch : subChapterList) {
            sch.print();
        }
    }

}
