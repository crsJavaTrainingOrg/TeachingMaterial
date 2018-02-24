package hu.crs.generics.domain;

public class PetHotel<T extends Animal> {
    public T identity(T animal) {
        System.out.println("Animal type is: " + animal.getClass().getName());
        return animal;
    }
}
