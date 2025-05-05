import java.util.Arrays;

public class DrawingSystem {
    private final int PIXEL_CANVA_WIDTH = 8;
    private final int PIXEL_CANVA_HEIGHT = 8;
    private int[][] matrix = new int[PIXEL_CANVA_WIDTH][PIXEL_CANVA_HEIGHT];
    private GUI gui;

    private int cursor_x = 0;
    private int cursor_y = 0;

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
        if (cursor_y > 0) {
            cursor_y--;
            gui.draw();
        }
        System.out.println(cursor_x + " " + cursor_y);
    }

    public void moveCursorDown() {
        if (cursor_y < PIXEL_CANVA_HEIGHT - 1) {
            cursor_y++;
            gui.draw();
        }
        System.out.println(cursor_x + " " + cursor_y);
    }

    public void moveCursorLeft() {
        if (cursor_x > 0) {
            cursor_x--;
            gui.draw();
        }
        System.out.println(cursor_x + " " + cursor_y);
    }

    public void moveCursorRight() {
        if (cursor_x < PIXEL_CANVA_WIDTH - 1) {
            cursor_x++;
            gui.draw();
        }
        System.out.println(cursor_x + " " + cursor_y);
    }

    public void togglePixel() {
        if (matrix[cursor_x][cursor_y] == 1) {
            matrix[cursor_x][cursor_y] = 0;
            System.out.println(cursor_x + " " + cursor_y + "TOGGLED");
        } else {
            matrix[cursor_x][cursor_y] = 1;
            System.out.println(cursor_x + " " + cursor_y + "UNTOGGLED");
        }
        gui.draw();
    }

    public void generateCode() {
        System.out.println("int[][] pixelArt = {");
        for (int i = 0; i < PIXEL_CANVA_HEIGHT; i++) {
            System.out.print("{");
            for (int j = 0; j < PIXEL_CANVA_WIDTH; j++) {
                System.out.printf(matrix[j][i] + ",");
            }
            System.out.println("}");
        }
        System.out.println("}");
    }

    public int getCursorX() {
        return cursor_x;
    }

    public int getCursorY() {
        return cursor_y;
    }

}
