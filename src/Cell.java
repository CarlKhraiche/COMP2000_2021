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

