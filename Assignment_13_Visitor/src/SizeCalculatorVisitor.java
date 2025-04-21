public class SizeCalculatorVisitor implements FileVisitor {

    @Override
    public void visit(File file) {
        System.out.println("The size of the file is: " + file.getSize());
    }

    @Override
    public void visit(Directory directory) {
        int size = 0;
        for (FileSystemElement child : directory.getChildren()) {
            if (child instanceof Directory) {
                (child).accept(this);
            } else {
                size += ((File) child).getSize();
            }
        }
        System.out.println("The size of the directory is: " + size);
    }
}
