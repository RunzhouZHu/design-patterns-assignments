import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
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
        clearRedoList();
        gui.updateGui();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);

        // assignment
        clearRedoList();
        gui.updateGui();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.removeLast();

            // <assignment>
            addToRedoList(previousState);
            // </assignment>

            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    // <assignment>
    public void redo() {
        if (!redoList.isEmpty()) {
            System.out.println("Memento found in redoList");
            IMemento previousState = redoList.removeLast();
            model.restoreState(previousState);
            gui.updateGui();
            history.add(previousState);
        }
    }

    private void addToRedoList(IMemento m) {
            IMemento currentState = model.createMemento();
            redoList.add(currentState);
    }

    private void clearRedoList() {
        redoList.clear();
    }

    public ObservableList<IMemento> getHistory() {
        return FXCollections.observableList(history);
    }

    public void restore(IMemento m) {
        model.restoreState(m);
        gui.updateGui();
        clearRedoList();
    }

    // </ assignment>
}
