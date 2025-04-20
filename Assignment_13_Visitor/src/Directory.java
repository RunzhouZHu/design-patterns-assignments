import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{
    private final String name;
    private final List<FileSystemElement> children =  new ArrayList<>();

    public Directory(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    public void addChild(FileSystemElement child){
        children.add(child);
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
