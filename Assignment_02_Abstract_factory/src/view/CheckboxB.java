package view;

public class CheckboxB extends Checkbox {

    CheckboxB(String text) {
        super(text);
    }

    public void display() {
        System.out.println("///");
        System.out.println("/ /" + text);
        System.out.println("///");
    }
}
