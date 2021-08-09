<<<<<<< HEAD
import java.awt.Color;
import java.awt.*;

public class Cell {
    // Define values if any
    int xPos = 0;
    int yPos = 0;
    int width = 35;
    int xEnd = 0;
    int yEnd = 0;
    Color fillColour = Color.black;
    Color borderColour = Color.white;

    // Define constructors if any
    Cell(int x, int y) {
        this.xPos = x * this.width;
        this.yPos = y * this.width;
    }

    Cell(int x, int y, int width) {
        this.width = width;
        this.xPos = x * this.width;
        this.yPos = y * this.width;
    }

    public void paint(Graphics cell) {
        cell.setColor(fillColour);
        cell.fillRect(xPos, yPos, width, width);
        cell.setColor(borderColour);
        cell.drawRect(xPos, yPos, width, width);
        System.out.println("Cell.java - X = " + xPos + ", Y = " + yPos);
    }
}

=======
import java.awt.*;

class Cell{
    // fields
    int x;
    int y;
    static int size = 35;

    //constructors
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    boolean contains(Point p){
        if (p != null){
            return (x < p.x && x+size > p.x && y < p.y && y+size > p.y);
        } else {
            return false;
        }
    }
}
>>>>>>> 816bbac67de49d95b4edc6517f7de10efbd6503f
