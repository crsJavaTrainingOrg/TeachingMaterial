package hu.crs.generics;

import hu.crs.generics.domain.Cat;
import hu.crs.generics.domain.Dog;
import hu.crs.generics.domain.PetHotel;
import hu.crs.generics.domain.PetHotelGenericMethod;

public class GenericsMethodTest {
    public static void main(String[] args) {
        PetHotel<Cat> catPetHotel = new PetHotel<>();
        catPetHotel.identity(new Cat());

        PetHotelGenericMethod dogPetHotelGenericMethod = new PetHotelGenericMethod();
        System.out.println(dogPetHotelGenericMethod.<Dog, String>identity(new Dog()));

        PetHotelGenericMethod.identityStatic(new Dog());
        String dog = PetHotelGenericMethod.<Dog, String>identityStatic(new Dog());
        System.out.println(dog);
        String string = PetHotelGenericMethod.<Dog, String>identityStatic(new Dog());
        System.out.println(string);
    }
}
