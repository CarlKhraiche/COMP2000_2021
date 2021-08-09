import java.awt.*;

<<<<<<< HEAD
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
=======
class Grid {
    //fields
    Cell[][] cells = new Cell[20][20];

    // constructor
    public Grid(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,10+35*j);
            }
        }
    }

    // methods
    public void paint(Graphics g, Point mousePos){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j].paint(g, mousePos);
            }
        }
    }
}
>>>>>>> 816bbac67de49d95b4edc6517f7de10efbd6503f
