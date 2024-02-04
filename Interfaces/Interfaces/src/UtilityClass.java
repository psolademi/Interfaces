import java.util.ArrayList;

public class UtilityClass {
    public static <T> ArrayList<T> collectAll(T[] objects, Filter filter) {
        ArrayList<T> result = new ArrayList<>();
        for (T obj : objects) {
            if (filter.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }
}