public class AlignRight implements AlignStrategy{
    public void render(Paragraph paragraph, String context) {
        System.out.println("                              Paragraph: " + paragraph + "; Context: " + context);
    }

}