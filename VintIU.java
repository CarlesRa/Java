import java.util.Scanner;
import java.util.Random;
public class VintIU{
    public static final int LONG_ARRAY=10;
    public static Scanner lector=new Scanner(System.in);
    public static Random rnd=new Random();
    public static void main(String[] args){
        int [] vector=new int [LONG_ARRAY];
        int seleccio;
        do{
            System.out.println("\u001B[H\u001B[2JMENÚ PRINCIPAL");
            System.out.println("\n===============");
            System.out.println("1.-Omplir array");
            System.out.println("2.-Visualitzar contingut de l'array");
            System.out.println("3.-Visualitzar contingut parell");
            System.out.println("4.-Visualitzar contingut multiple de 3");
            System.out.println("0.-Eixir del menu");
            System.out.print("Seleccione una opció: ");
            seleccio=lector.nextInt();
            lector.nextLine();
            switch (seleccio){
                case 0:
                break;
                case 1:
                crearArray(vector);
                barraCarrega();
                System.out.print("Array generat prega intro per continuar: ");
                lector.nextLine();
                break;
                case 2:
                visualitzarArray(vector);
                System.out.print("Prega intro per continuar: ");
                lector.nextLine();
                break;
                case 3:
                visualitzarParell(vector);
                System.out.print("Prega intro per continuar: ");
                lector.nextLine();
                break;
                case 4:
                visualitzarMultiple3(vector);
                System.out.print("Prega intro per continuar: ");
                lector.nextLine();
                break;
                default:
                System.out.println("\u001B[1;41mDada incorrecta!!\u001B[0m");
                System.out.print("Prega intro per continuar: ");
                lector.nextLine();
            }
        }while (seleccio!=0);
    }
    /**
     * Metode per omplir un array amb nombres aleatoris.
     * @param vector li pasem un array buit.
     */
    public static void crearArray(int []vector){
        int max=60;
        int min=0;
        for (int i=0; i<vector.length; i++){
            int num=rnd.nextInt(max-min+1)-min;
            vector[i]=num;
        }
    }
    /**
     * li pasem un array i per visualitzar-lo.
     * @param vector Pasarli un array.
     */
    public static void visualitzarArray(int[] vector){
        StringBuilder mostrarArray=new StringBuilder();
        for (int z=0; z<vector.length; z++){
            mostrarArray.append(vector[z]).append(" ");
        }
        System.out.println(mostrarArray);
    }
    /**
     * mostra els elements del array que son parells.
     * @param vector li pasem un array.
     */
    public static void visualitzarParell(int[] vector){
        for (int z=0; z<vector.length; z++){
            if (vector[z]%2==0){
                System.out.printf("%s%02d es parell i esta en la posició \u001B[1;31;43m%02d\u001B[0m\n"
                ,"El numero ",vector[z],z);
            }
        }
    }
    /**
     * mostra els elements del array que son multiples del numero seleccionat.
     * @param vector pasarli un array.
     */
    public static void visualitzarMultiple3(int[] vector){
        for (int z=0; z<vector.length; z++){
            int multiple=3;
            if (vector[z]%multiple==0){
                System.out.printf("%s%02d es multiple de %02d i esta en la posició \u001B[1;31;43m[%02d]\u001B[0m\n"
                ,"El numero ",vector[z],multiple,z);
            }
        }
    }
    /**
     * Metode per fer apareixer ubna barra de cárrega.
     */
    public static void barraCarrega(){
    
        for (int i = 0; i<40; i++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                
            }
            System.out.print("\u001B[44m ");
        }
        System.out.println("\u001B[0m");
    }
}

