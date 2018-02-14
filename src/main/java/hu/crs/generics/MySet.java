package hu.crs.generics;

import java.util.ArrayList;
import java.util.List;

public class MySet<T> {
    List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }
}
