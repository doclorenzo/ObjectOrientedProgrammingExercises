package esercizi_exeption;

public class CheckLicencePlate {

    public static void checkLicencePlate(String licence){

        if(licence.length() != 7) throw new IllegalArgumentException();

        for(int i=0; i<7; i++){
            if(i<2 || i>4){
                if(!Character.isLetter(licence.charAt(i))) throw new IllegalArgumentException();
            }
            else{
                if(!Character.isDigit(licence.charAt(i))) throw new IllegalArgumentException();
            }
        }

    }

}
