package hu.crs.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add("a");
        strings.add("b");
        System.out.println(strings);

        List ints = new ArrayList();
        ints.add(1);
        ints.add(2);
        ints.add("alma");
        System.out.println(ints);

        for (int i = 0; i < ints.size(); i++) {
            System.out.println("Is " + ints.get(i) + " integer?");
            System.out.println(ints.get(i) instanceof Integer);
        }

        try {
            for (int i = 0; i < ints.size(); i++) {
                int tmp = (int) ints.get(i);
                System.out.println(tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Integer integer = identity(1);
        String string = identity("alma");
        BigDecimal bigDecimal = identity(BigDecimal.ZERO);

        MySet<Integer> myIntegerSet = new MySet<>();
        myIntegerSet.add(1);
        myIntegerSet.add(2);

        System.out.println(myIntegerSet.contains(2));

        MySet<String> myStringSet = new MySet<>();
        myStringSet.add("alma");
        myStringSet.add("korte");
        System.out.println(myStringSet.contains("citrom"));
        System.out.println(myStringSet.contains("alma"));

        int size = Main.<Integer, String>function(myIntegerSet, myStringSet);
        System.out.println(size);
    }

    private static <T> T identity(T element) {
        return element;
    }

    private static <T, R> int function(MySet<T> set0, MySet<R> set1) {
        return set0.elements.size() + set1.elements.size();
    }

}
