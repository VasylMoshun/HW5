package homework5.HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList<T extends Number> {
    private final List<T> arraylist;

    public MyList() {
        arraylist = new ArrayList<>();
    }

    public void add(T element) {
        arraylist.add(element);
    }

    public T smallestElement() {
        return arraylist.stream().sorted().findFirst().orElseThrow(() -> new NoSuchElementException("List is empty"));
    }

    public T largestElement() {
        return arraylist.stream().min(Collections.reverseOrder()).orElseThrow(() -> new NoSuchElementException("List is empty"));
    }

    @Override
    public String toString() {
        return "MyList{" +
                "arraylist=" + arraylist +
                '}';
    }
}


