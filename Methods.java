import java.util.Scanner;
public class Methods{
   
    /**
     * method for display a menu
     * @param s string vector with menu elements
     */
    public static void mosrtrarMenu(String [] s){
        System.out.println("\u001B[H\u001B[2JMENU PRINCIPAL");
        System.out.println("**************\n");
        for(int i=0; i<s.length; i++){
            System.out.println((i+1)+"- "+s[i]);
        }
        System.out.println("0- Salir.....");
    }
}