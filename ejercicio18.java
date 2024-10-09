import java.util.Scanner;

/* EJERCICIO #18:
En una tienda de descuento las personas que van a pagar el valor de sus
compra llegan a la caja y sacan una bolita de color, que les dirá el
descuento que tendrán sobre el total de su compra. Determinar la
cantidad que pagara cada cliente desde que la tienda abre hasta que
cierra. Se sabe que si el color de la bolita es rojo, el cliente obtendrá un
40% de descuento; si es amarillo un 25% y si es blanco no obtendrá
descuento.
 */

public class ejercicio18 {
    public static void main(String[] args) {
        double valorCompra,descuento,valorFinalCompra;
        String ejecucion, color;

        Scanner sc = new Scanner(System.in);

        do{
            //INGRESAR EL VALOR DE LA COMPRA
            System.out.println("Ingrese el valor de la compra: ");
            valorCompra = sc.nextDouble();

            System.out.println("Ingrese el color de la bolita para aplicar el descuento"
                    + "(rojo,amarillo,blanco,)");
            color = sc.next().toLowerCase();

            //VERIFICAR EL COLOR PARA APLICAR EL RESPECTIVO DESCUENTO
            if(color.equals("rojo")){
                descuento = 0.40;
            }else if (color.equals("amarillo")){
                descuento = 0.25;
            }
            else if (color.equals("blanco")){
                descuento = 0;
            }else{
                System.out.println("Color invalido");
                descuento = 0;
            }

            //CALCULAR EL VALOR TOTAL DE LA COMPRA UNA VEZ APLICADO EL DESCUENTO
            valorFinalCompra = (valorCompra) - (valorCompra * descuento);
            System.out.println("El valor total de la compra es de: $"
                    + valorFinalCompra);

            System.out.println("Quiere calcular la compra de otro Cliente? (Si/No)");
            ejecucion = sc.next();

            // COMPROBAR LOS CASOS EN LOS CUALES SE VUELVE A EJECUTAR EL ALGORITMO
        }while(ejecucion.equals("si") || ejecucion.equals("Si") || ejecucion.equals("SI"));
        System.out.println("El programa ha finalizado");


    }
}
