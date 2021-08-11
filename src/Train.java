import java.awt.*;

public class Train implements Actor{
    
    Cell location;

    public Train(Cell inCell) {
        location = inCell;
    }

    public void paint(Graphics G) {
        location.paint(G, Color.RED);
    }

}
