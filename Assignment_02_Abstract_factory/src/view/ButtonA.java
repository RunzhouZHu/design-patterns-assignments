package view;

public class ButtonA extends Button {

    ButtonA(String text) {
        super(text);
    }

    public void display() {
        System.out.println("[- " + text + " -]");
    }
}
