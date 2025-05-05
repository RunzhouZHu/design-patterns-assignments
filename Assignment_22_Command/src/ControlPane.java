public class ControlPane {
    private Command moveCursorUp;
    private Command moveCursorDown;
    private Command moveCursorLeft;
    private Command moveCursorRight;
    private Command togglePixel;
    private Command generateCode;

    public ControlPane(Command moveCursorUp, Command moveCursorDown,  Command moveCursorLeft, Command moveCursorRight, Command togglePixel, Command generateCode) {
        this.moveCursorUp = moveCursorUp;
        this.moveCursorDown = moveCursorDown;
        this.moveCursorLeft = moveCursorLeft;
        this.moveCursorRight = moveCursorRight;
        this.togglePixel = togglePixel;
        this.generateCode = generateCode;
    }

    public void setMoveCursorUp() {
        moveCursorUp.execute();
    }

    public void setMoveCursorDown() {
        moveCursorDown.execute();
    }

    public void setMoveCursorLeft() {
        moveCursorLeft.execute();
    }

    public void setMoveCursorRight() {
        moveCursorRight.execute();
    }

    public void setTogglePixel() {
        togglePixel.execute();
    }

    public void setGenerateCode() {
        generateCode.execute();
    }
}
