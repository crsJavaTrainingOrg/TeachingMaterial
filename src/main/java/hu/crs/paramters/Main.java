package hu.crs.paramters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

public class Main {

    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public static class Dog {
        String name;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = a;
        a = 3;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        Dog dog0 = new Dog("Max");
        Dog dog1 = dog0;
        dog1.setName("Fifi");

        System.out.println("Dog 0 " + dog0 );
        System.out.println("Dog 1 " + dog1);

        System.out.println("Rename dog");
        Dog dog3 = new Dog("Max");
        renameDog0(dog3);
        System.out.println(dog3);

        Dog dog4 = new Dog("Max");
        renameDog1(dog4);
        System.out.println(dog4);

        int[] array = new int[]{1, 2};
        swap(array);
        System.out.println(Arrays.toString(array));
    }

    private static void renameDog0(Dog dog) {
        Dog renamedDog = new Dog("Fifi");
        dog = renamedDog;
    }

    private static void renameDog1(Dog dog) {
        dog.setName("Fifi");
    }

    private static void swap(int[] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
}
