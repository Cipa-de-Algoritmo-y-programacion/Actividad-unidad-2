
import java.util.Scanner;

public class Punto23 {
    public static void main(String[] args) {
        Scanner entero = new Scanner(System.in);
        int numero = 0; // variable

        // Bucle 
        do {
            System.out.print("Introduce un número entero ya sea positivo o negativo: ");
            while (!entero.hasNextInt()) {
                System.out.println("No es válida. Por favor, intentelo denuevo.");
                entero.next(); // No válida
            }
            numero = entero.nextInt(); // Leer el número entero
        } while (false); 

        // Convertir a binario
        String binario = Integer.toBinaryString(numero);
        System.out.println("El número entero " + numero + " en binario es: " + binario);

        entero.close();
    }
}
