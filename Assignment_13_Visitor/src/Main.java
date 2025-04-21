public class Main {
    public static void main(String[] args) {
        // create the file system
        File file1 = new File("file1", 10);
        File file2 = new File("file2", 20);
        File file3 = new File("file3", 30);
        Directory directory = new Directory("dir1");

        directory.addChild(file1);
        directory.addChild(file2);

        // Create a visitor
        SizeCalculatorVisitor visitor = new SizeCalculatorVisitor();
        visitor.visit(directory);

        SearchVisitor searchVisitor = new SearchVisitor();
        searchVisitor.visit(directory);

    }
}
