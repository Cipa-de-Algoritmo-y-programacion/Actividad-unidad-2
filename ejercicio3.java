/*
Realice un Programa, Digitado 5 Ventas en el Almacén XYZ Calcular:
    ¿Cuántas ventas Fueron Mayores 1.000.000?
    ¿El Promedio de las Ventas?
    ¿Cuál Fue la Mayor Venta?
    ¿Cuál Fue la Menor Venta?
 */

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //Declarar entrada del usuario
        Scanner sc = new Scanner(System.in);
        String answer;

        // Formato para formatear numeros
        NumberFormat formatter = NumberFormat.getInstance(Locale.US);

        // Declarar
        double valorVenta,minVenta,maxVenta,promedio;
        int numeroVenta,ventasMayores;

        try{ //Control de flujo de errores

            minVenta = 0;
            maxVenta = 0;
            ventasMayores = 0;
            promedio = 0;



            for(numeroVenta = 0; numeroVenta < 5; numeroVenta++){

                System.out.println("Ingrese el valor de la venta: ");
                valorVenta = sc.nextDouble();
                sc.nextLine();

                if(numeroVenta < 1){
                    minVenta = valorVenta;
                    maxVenta = valorVenta;
                }

                promedio += valorVenta;

                // Capturando y contando las ventas mayores a 1,000,000
                if(valorVenta > 1000000){
                    ventasMayores++;
                }
                // Atrapar las ventas menores
                if(valorVenta < minVenta){
                    minVenta = valorVenta;
                }

                // Atrapar las ventas mayores
                if(valorVenta > maxVenta){
                    maxVenta = valorVenta;
                }



                if(numeroVenta < 4){
                    System.out.println("¿Desea agregar una nueva venta? si/no");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    if(answer.equals("si")){
                        System.out.println("Guardando venta actual...");
                        System.out.println("Venta Guardada existosamente!");
                    }else{break;}
                }else{
                    System.out.println("Guardando venta actual...");
                    System.out.println("Venta Guardada existosamente!");
                }


            }
            promedio = promedio/5;

            System.out.println("Ventas mayores a 1.000.000: " + ventasMayores);
            System.out.println("Promedio de las ventas: " + formatter.format(promedio));
            System.out.println("Venta minima: " + formatter.format(minVenta));
            System.out.println("Venta maxima: " + formatter.format(maxVenta));

        } catch (InputMismatchException e) {
            System.out.println("Error al ingresar un dato invalido");
        }

        sc.close();
    }
}
