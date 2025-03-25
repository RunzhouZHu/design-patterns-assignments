package view;

public class ButtonB extends Button {

    ButtonB(String text) {
        super(text);
    }

    public void display() {
        System.out.println("{ " + text + " }");
    }
}
