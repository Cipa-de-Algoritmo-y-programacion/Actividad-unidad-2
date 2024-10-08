
import java.util.InputMismatchException;
import java.util.Scanner;


public class Apto{    // Solicitar información del deportista para comprobar si es apto para ejercer

    /* Condiciones:
        a. Que sea mayor de 15 años
        b. Que sea colombiano
        c. Que tengo un peso entre 60 y 90 kilos
    */

    //variables locales
    static String red = "\033[1;91m";
    static String green = "\033[1;92m";
    static String yellow = "\033[1;93m";
    static  String white = "\033[1;97m";
    static String reset = "\033[0m";
    

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in); // Entrada para el usuario
     String nombre,pais; int edad; double peso; // Declarando variables
     
     imprimir("b","Formulario de registro para deportistas");
     imprimir("a","Ingrese el nombre completo del deportista"+white);
        
        try {
            nombre = input.nextLine();
            
            imprimir("a", "Ingrese el país de origen del deportista");

            pais = input.nextLine();

            
        } catch (InputMismatchException e) {
            imprimir("r", "Error inesperado: has ingresado un valor invalido");
        }

    }


    static String imprimir(String color,String texto){  //imprimir en la consola
        switch(color) {
            case "b":
                System.out.println(white+"\r"+texto);
                break;
            
            case "r":
                System.out.println(red+"\r"+texto);
                break;
            case "v":
                System.out.println(green+"\r"+texto);
                break;
            case "a":
                System.out.println(yellow+"\r"+texto);
                break;
        
            default:
                System.out.println(reset+"\r"+texto);
                break;
        }
        return texto;
    }

}