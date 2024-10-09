
import java.util.Scanner;

public class Punto23 {
    public static void main(String[] args) {
        Scanner entero = new Scanner(System.in);
        int numero = 0; // variable

        //Control de errores
        try{
            System.out.print("Introduce cualquier número entero ya sea positivo o negativo: ");
            numero = entero.nextInt();
        }catch(InputMismatchException e){
            System.out.println("No es válido. Por favor, intentelo denuevo.");
        }

        // Convertir a binario
        String binario = Integer.toBinaryString(numero);
        System.out.println("El número entero " + numero + " en binario es: " + binario);

        entero.close();
    }
}
