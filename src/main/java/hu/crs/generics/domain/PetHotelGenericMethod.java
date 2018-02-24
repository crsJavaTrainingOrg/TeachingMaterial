package hu.crs.generics.domain;

public class PetHotelGenericMethod {
    public <T, R> R identity(T animal) {
        return (R) animal.getClass().getName();
    }

    public static <T, R> R identityStatic(T animal) {
        return (R) animal.getClass().getName();
    }
}
