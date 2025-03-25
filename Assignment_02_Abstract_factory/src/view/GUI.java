package view;

public class GUI {

    // Set the styles
    UIFactory factory = new AFactory();
    // UIFactory factory = new BFactory();

    private Button button = factory.createButton("buttonText");
    private Checkbox checkbox = factory.createCheckbox("checkboxText");
    private TextField textField = factory.createTextField("textFiledText");

    public void setText(String buttonText, String checkboxText, String textFiledText) {
        button = factory.createButton(buttonText);
        checkbox = factory.createCheckbox(checkboxText);
        textField = factory.createTextField(textFiledText);

    }

    public void start() {
        button.display();
        checkbox.display();
        textField.display();
    }

}
