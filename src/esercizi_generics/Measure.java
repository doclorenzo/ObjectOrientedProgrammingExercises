package esercizi_generics;

public class Measure {

    public interface Measurer<T> {
        double measure(T obj);
    }

    public static <T> T max(T[] array, Measurer<T> measurer){

        T max=array[0];
        for(T e: array){
            if(measurer.measure(max) < measurer.measure(e)){
                max=e;
            }
        }
        return max;
    }
    public static <T> T min(T[] array, Measurer<T> measurer){
        T min=array[0];
        for(T e: array){
            if(measurer.measure(min) > measurer.measure(e)){
                min=e;
            }
        }
        return min;
    }

}
