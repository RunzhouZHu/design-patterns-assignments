public interface FileVisitor {
    void visit(File file);
    void visit(Directory directory);
}
