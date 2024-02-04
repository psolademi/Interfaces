import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        // ensuring that x is of type Rectangle
        if (x instanceof Rectangle) {
            // safe type cast
            Rectangle r = (Rectangle) x;
            // returning true if perimeter (2*(width+height)) is bigger than 10,
            // else false
            return 2 * (r.width + r.height) > 10;
        }
        return false; // x is not rectangle
    }

}