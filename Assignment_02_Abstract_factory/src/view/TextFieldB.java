package view;

public class TextFieldB extends TextField {

    TextFieldB(String text) {
        super(text);
    }

    public void display() {
        System.out.println("///////////");
        System.out.println("/ " + text + " /");
        System.out.println("///////////");
    }
}
