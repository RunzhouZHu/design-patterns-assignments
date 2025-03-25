package view;

public class AFactory extends UIFactory {

    @Override
    Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    Checkbox createCheckbox(String text) {
        return new CheckboxA(text);
    }

    @Override
    TextField createTextField(String text) {
        return new TextFieldA(text);
    }
}
