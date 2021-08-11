import java.awt.*;

public class Car implements Actor{
    
    Cell location;

    public Car(Cell inCell) {
        location = inCell;
    }

    public void paint(Graphics G) {
        location.paint(G, Color.RED);
    }

}