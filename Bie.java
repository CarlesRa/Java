public class Cuatre{
    static final char ESPAI=' ';
    public static void Exercici4(){
        String frase;
        String fraseMin;
        String [] arrayFrase;
        String vocals="áàaéèeiíoóòuú";
        String consonants="bcdfghjklmnpqrstvwxyz";
        int numeroConsonants=0;
        int numeroVocals=0;
        System.out.print("Introduixca una frase: ");
        frase=Main.lector.nextLine();
        fraseMin=frase.toLowerCase();
        arrayFrase=fraseMin.split(" ");
        for(String acumulador:arrayFrase){
            numeroVocals=0;
            numeroConsonants=0;
            for (int i=0; i<acumulador.length(); i++){
                for(int x=0; x<vocals.length(); x++){
                    if (acumulador.charAt(i)==vocals.charAt(x)){
                        numeroVocals++;
                    }
                }
                for (int z=0; z<consonants.length();z++){
                    if(acumulador.charAt(i)==consonants.charAt(z)){
                        numeroConsonants++;
                    }
                }
            }
            System.out.println(acumulador + " tiene "+ numeroVocals + " vocales y "+numeroConsonants+" consonantes.");
        }
    }
}