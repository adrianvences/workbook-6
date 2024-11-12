import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    // List to store items
    private List<T> items;
    // Max size of list
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            System.out.println("Cannot add to list. List is full.");
        }
    }

    public List<T> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
