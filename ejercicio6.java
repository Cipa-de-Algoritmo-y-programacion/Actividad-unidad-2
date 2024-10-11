import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        // Declarando variables
        Scanner sc = new Scanner(System.in);
        double venta_sin_comision;
        double[] ventasVendedor = new double[5], comision = new double[5],ventaComisionada = new double[5];

        venta_sin_comision = 1000000;
        int cc;
        for (int i = 0; i < ventasVendedor.length; i++) {
            cc = i+1;
            System.out.println("Ingrese venta mensual del vendedor #" + cc);
            ventasVendedor[i] = sc.nextDouble();
            comision[i] = ventasVendedor[i]*0.09;
            ventaComisionada[i] = venta_sin_comision + comision[i];
            System.out.println("Venta Guardada exitosamente!");
        }

        for (int i = 0; i < 5; i++) {
            cc = i+1;
            System.out.println("Venta más comisión del vendedor #" + cc + "= $" + ventaComisionada[i]);
        }


    }

}
