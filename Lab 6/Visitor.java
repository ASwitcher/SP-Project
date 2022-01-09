public interface Visitor {
    void visit(Book book);
    void visit(Section sectie);
    void visit(TableOfContent toc);
    void visit(Paragraph paragraph);
    void visit(ImageProxy imageproxy);
    void visit(Image image);
    void visit(Table table);
}