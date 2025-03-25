import java.util.ArrayList;
import java.util.List;

public class Department extends Component {

    private List<Component> children = new ArrayList<Component>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void printData() {

        System.out.println("<" + this.name + ">");

        // print the info
        System.out.println("<name>" + this.name + "</name>");
        System.out.println("<totalSalary>" + getTotalSalary() + "</totalSalary>");

        // print the contents of all children
        System.out.println("<children>");
        for (Component child : this.children) {
            child.printData();
        }
        System.out.println("</children>");

        System.out.println("</" + this.name + ">");
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Component child : this.children) {
            if (child instanceof Employee) {
                totalSalary += ((Employee) child).getSalary();
            } else {
                totalSalary += ((Department)child).getTotalSalary();
            }
        }
        return totalSalary;
    }

    public void printTotalSalary() {
        System.out.printf("Total salary: %.2f\n", getTotalSalary());
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return this.children.get(index);
    }
}
