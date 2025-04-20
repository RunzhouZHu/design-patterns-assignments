public class File implements FileSystemElement{
    private final String fileName;
    private final int size;

    public  File(String fileName, int size){
        this.fileName = fileName;
        this.size = size;
    }

    public String getFileName(){
        return this.fileName;
    }
    public int getSize(){
        return this.size;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
