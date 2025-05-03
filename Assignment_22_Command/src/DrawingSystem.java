public class DrawingSystem {
    private final int PIXEL_CANVA_WIDTH = 8;
    private final int PIXEL_CANVA_HEIGHT = 8;
    private int[][] matrix = new int[PIXEL_CANVA_WIDTH][PIXEL_CANVA_HEIGHT];
    private GUI gui;

    public DrawingSystem(GUI gui) {
        this.gui = gui;
    }

    public int getPixelCanvaWidth() {
        return PIXEL_CANVA_WIDTH;
    }
    public int getPixelCanvaHeight() {
        return PIXEL_CANVA_HEIGHT;
    }
    public int getRect(int x, int y) {
        return matrix[x][y];
    }

    public void moveCursorUp() {
        gui.moveCursorUp();
    }

}
