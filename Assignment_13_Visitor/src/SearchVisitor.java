import java.util.Objects;
import java.util.Scanner;

public class SearchVisitor implements FileVisitor{

    @Override
    public void visit(File file) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter the name of the file you want to search: ");
        String name = scanner.next();
        if(Objects.equals(name, file.getFileName())){
            System.out.println("The file " + file.getFileName() + " is found");
        }
        else {
            System.out.println("The file " + file.getFileName() + " is not found");
        }
    }

    @Override
    public void visit(Directory directory) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter the name of the directory you want to search: ");
        String name = scanner.next();
        boolean isFound = false;
        for (FileSystemElement child : directory.getChildren()) {
            if (child instanceof Directory) {
                (child).accept(this);
            } else {
                if (Objects.equals(name, ((File)child).getFileName())) {
                    System.out.println("The file " + name + " is found");
                    isFound = true;
                }
            }
        }
        if(!isFound){
            System.out.println("The file " + name + " is not found");
        }
    }
}
