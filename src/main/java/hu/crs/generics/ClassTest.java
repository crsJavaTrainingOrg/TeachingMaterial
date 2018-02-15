package hu.crs.generics;

import hu.crs.generics.domain.Animal;
import hu.crs.generics.domain.Cat;
import hu.crs.generics.domain.Dog;

import java.util.Arrays;

public class ClassTest {

    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getClass().getName());
        }

        try {
            Animal[] dogs = new Dog[2];
            dogs[0] = new Dog();
            dogs[1] = new Cat();

            for (int i = 0; i < dogs.length; i++) {
                System.out.println(dogs[i].getClass().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Animal[] cats = new Cat[2];
        cats[0] = new Cat();
        addToArray(cats);
        System.out.println(Arrays.toString(cats));
    }


    public static void addToArray(Animal[] animals) {
        animals[1] = new Dog();
    }
}
