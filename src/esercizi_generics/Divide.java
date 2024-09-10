package esercizi_generics;

public class Divide {

    public static <T extends Number> double divide(T a, T b){

        double dividendo = a.doubleValue();
        double divisore = b.doubleValue();
        return dividendo/divisore;

    }

}
