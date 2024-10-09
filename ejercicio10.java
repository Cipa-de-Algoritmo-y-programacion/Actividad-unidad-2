import java.util.Scanner;

/* EJERCICIO #10:
Crear un algoritmo para calcular los salarios semanales de unos
empleados a los que se les paga $15.000 por hora si éstas no superan
las 35 horas. Cada hora por encima de 35 se considerará extra y se paga
a $27.000. El programa pide las horas del trabajador y devuelve el salario
que se le debe pagar. Además el programa debe preguntar si deseamos
calcular otro salario, si es así el programa se vuelve a repetir

 */


public class ejercicio10 {
    public static void main(String[] args) {
        int numHorasTrabajadas, horasExtra;
        double valorHoraNormal, salario, valorHoraExtra;
        String ejecucion;

        Scanner sc = new Scanner(System.in);

        valorHoraNormal = 15000;
        valorHoraExtra = 27000;

        do{
            System.out.println("Ingrese el numero de horas trabajas por el empleado");
            numHorasTrabajadas = sc.nextInt();
            //VERIFICAR LAS HORAS TRABAJADAS
            if(numHorasTrabajadas <= 35){
                salario = numHorasTrabajadas * valorHoraNormal;
            }else{
                // CALCULAR LAS HORAS EXTRAS Y EL SALARIO INCLUYENDO EL VALOR DE LA HORA EXTRA
                horasExtra = numHorasTrabajadas - 35;
                salario = (35 * valorHoraNormal) + (horasExtra * valorHoraExtra);
            }
            System.out.println("El salario del empleado es: $" + salario);
            System.out.println("Quiere calcular otro Salario? (Si/No)");
            ejecucion = sc.next();

            // COMPROBAR LOS CASOS EN LOS CUALES SE VUELVE A EJECUTAR EL ALGORITMO
        }while(ejecucion.equals("si") || ejecucion.equals("Si") || ejecucion.equals("SI"));
        System.out.println("El programa ha finalizado");


    }
}
