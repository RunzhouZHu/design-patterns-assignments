import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history

    // assignment
    private List<IMemento> redoList;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoList = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        // assignment
        saveToRedo();

    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);

        //
        saveToRedo();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.removeLast();
            model.restoreState(previousState);
            gui.updateGui();

            // assignment
            redoList.add(history.getLast());
            printLists();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    // assignment
    public void redo() {
        if (!redoList.isEmpty()) {
            System.out.println("Memento found in redoList");
            IMemento previousState = redoList.removeLast();
            model.restoreState(previousState);
            gui.updateGui();
            history.add(previousState);

            printLists();
        }
    }

    private void saveToRedo() {
        redoList.clear();
        IMemento currentState = model.createMemento();
        redoList.add(currentState);
    }

    public void printLists() {
        System.out.println("-------------------history");
        for (IMemento m : history) {
            System.out.println(Arrays.toString(((Memento) m).getOptions()));
            System.out.println(((Memento) m).isSelected());
        }
        System.out.println("------------------redoList");
        for (IMemento m : redoList) {
            System.out.println(Arrays.toString(((Memento) m).getOptions()));
            System.out.println(((Memento) m).isSelected());
        }
    }
}
