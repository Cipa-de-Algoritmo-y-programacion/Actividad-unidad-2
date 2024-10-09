import java.util.*;

public class PicasYFijas {

    // Método para generar un número de 4 dígitos no repetidos
    public static String generarNumeroSecreto() {
        Random random = new Random();
        Set<Integer> digitos = new LinkedHashSet<>();
        while (digitos.size() < 4) {
            digitos.add(random.nextInt(10));
        }
        StringBuilder numeroSecreto = new StringBuilder();
        for (int digito : digitos) {
            numeroSecreto.append(digito);
        }
        return numeroSecreto.toString();
    }

    // Método para calcular las Picas y Fijas
    public static int[] calcularPicasYFijas(String numeroSecreto, String intento) {
        int picas = 0;
        int fijas = 0;

        for (int i = 0; i < 4; i++) {
            if (intento.charAt(i) == numeroSecreto.charAt(i)) {
                fijas++;
            } else if (numeroSecreto.contains(Character.toString(intento.charAt(i)))) {
                picas++;
            }
        }
        return new int[]{picas, fijas};
    }

    // Método para verificar si un número tiene dígitos repetidos
    public static boolean tieneDigitosRepetidos(String numero) {
        Set<Character> digitos = new HashSet<>();
        for (char digito : numero.toCharArray()) {
            if (!digitos.add(digito)) {
                return true; // Hay dígitos repetidos
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroSecreto = generarNumeroSecreto();
        String intento;
        int intentos = 0;
        int[] resultado = {0, 0};  // Inicializar la variable resultado

        System.out.println("Bienvenido al juego de Picas y Fijas. Adivina el número de 4 dígitos no repetidos.");

        // Bucle hasta que el jugador acierte las 4 fijas
        do {
            System.out.print("Ingresa tu intento de 4 dígitos: ");
            intento = scanner.next();

            // Verificar si el intento tiene 4 dígitos y que no estén repetidos
            if (intento.length() != 4 || tieneDigitosRepetidos(intento)) {
                System.out.println("El número debe tener 4 dígitos no repetidos. Intenta de nuevo.");
                continue;
            }

            // Calcular picas y fijas
            resultado = calcularPicasYFijas(numeroSecreto, intento);
            intentos++;

            // Mostrar el resultado
            System.out.println("Picas: " + resultado[0] + ", Fijas: " + resultado[1]);

        } while (resultado[1] != 4); // El juego termina cuando hay 4 fijas

        System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto + " en " + intentos + " intentos.");
    }
}
