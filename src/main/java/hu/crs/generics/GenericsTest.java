package hu.crs.generics;

import hu.crs.generics.domain.Animal;
import hu.crs.generics.domain.Cat;
import hu.crs.generics.domain.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat());

        //List<Animal> cats = new ArrayList<Cats>(); -- compile error

        //addToAnimalList0(cats); -- compile error
        addToACatsList(cats);
        System.out.println(cats);

        List<Dog> dogs = new ArrayList<>(); //diamond operator
        dogs.add(new Dog());

        printAnimalExtendsList(cats);
        printAnimalExtendsList(dogs);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        //printAnimalExtendsList(integers); //compile error

        List<Animal> animals = new ArrayList<>();
        printAnimalsSuperList(cats);
        printAnimalsSuperList(animals);
        //printCatSuperList(dogs); --compile error

        printList(cats);
        printList(dogs);
        printList(animals);
        printList(integers);
    }

    public static void addToAnimalList0(List<Animal> animals) {
        //animals.add(new Dog()) -- not allowed because of no runtime type info is available of type erasure
    }

    public static void addToACatsList(List<Cat> cats) {
        cats.add(new Cat());
    }

    public static void printAnimalExtendsList(List<? extends Animal> animals) {
        //animals.add(new Dog());
        System.out.println(animals);
    }

    public static void printAnimalsSuperList(List<? super Cat> animals) {
        //animals.add(new Dog());
        animals.add(new Cat());
        System.out.println(animals);
    }

    //List<?> means List<? extends Object>
    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
