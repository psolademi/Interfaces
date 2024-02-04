import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static ArrayList<Object> collectAll(ArrayList<Object> objects,
                                               Filter f) {
        ArrayList<Object> result = new ArrayList<Object>();

        for (Object obj : objects) {
            if (f.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // creating an arraylist of Object type
        ArrayList<Object> list = new ArrayList<Object>();
        // adding 10 rectangles, of different dimensions
        list.add(new Rectangle(100, 20));
        list.add(new Rectangle(3, 1));
        list.add(new Rectangle(2, 2));
        list.add(new Rectangle(5, 2));
        list.add(new Rectangle(20, 10));
        list.add(new Rectangle(1, 1));
        list.add(new Rectangle(5, 10));
        list.add(new Rectangle(2, 1));
        list.add(new Rectangle(0, 0));
        list.add(new Rectangle(3, 2));

        // displaying unfiltered rectangles
        System.out.println("Unfiltered rectangles:");
        for (Object ob : list) {
            Rectangle rect = (Rectangle) ob;
            System.out.println("Rectangle with width: " + rect.width
                    + ", height: " + rect.height + ", perimeter: "
                    + (2 * (rect.width + rect.height)));
        }

        // filtering list using an object of BigRectangleFilter, collecting all
        // filtered data in a different array list
        ArrayList<Object> filtered = collectAll(list, new BigRectangleFilter());

        // displaying filtered rectangles
        System.out.println("\nFiltered rectangles:");
        for (Object ob : filtered) {
            Rectangle rect = (Rectangle) ob;
            System.out.println("Rectangle with width: " + rect.width
                    + ", height: " + rect.height + ", perimeter: "
                    + (2 * (rect.width + rect.height)));
        }
    }
}