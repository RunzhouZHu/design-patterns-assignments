package view;

public class TextFieldA extends TextField {

    TextFieldA(String text) {
        super(text);
    }

    public void display() {
        System.out.println("----------");
        System.out.println("- " + text + " -");
        System.out.println("----------");
    }
}
