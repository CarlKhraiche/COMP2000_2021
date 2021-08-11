import java.awt.*;

public class Boat implements Actor{
    
    Cell location;

    public Boat(Cell inCell) {
        location = inCell;
    }

    public void paint(Graphics G) {
        location.paint(G, Color.ORANGE);
    }

}
