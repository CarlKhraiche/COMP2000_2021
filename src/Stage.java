import java.awt.*;

public class Stage {

    Grid grid;
    Actor[] actArr;
    Actor train;
    Actor car;
    Actor boat;
    
    public Stage() {
        grid = new Grid();
        train = new Train(grid.cells[0][0]);
        car = new Car(grid.cells[2][3]);
        boat = new Boat(grid.cells[10][1]);
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);
        train.paint(g);
        car.paint(g);
        boat.paint(g);
    }

}
