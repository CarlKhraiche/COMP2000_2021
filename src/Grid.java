import java.awt.*;

public class Grid {
    // values 
    int row;
    int column;
    int width = 35;

    // Define constructors 
    Grid(int x, int y, int width) {
        row = y;
        column = x;
        this.width = width;
    }

    public void paint(Graphics cell) {
        for (int i = 0; i < row; i += 1) {
            for (int j = 0; j < column; j += 1) {
                Cell temp = new Cell(j, i, width);
                System.out.println("Grid.java - X = " + j + ", Y = " + i);
                temp.paint(cell);
            }
        }
    }
    // methods 
}
