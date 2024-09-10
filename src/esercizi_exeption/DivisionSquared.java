package esercizi_exeption;

public class DivisionSquared {

    public static int divisionSquared(int a, int b){

        try{
            return (a/b)^2;
        }
        catch (ArithmeticException e){
            return 0;
        }
    }

}
