import java.util.Scanner;

public class resta {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //declarar variables (divisor y dividendo)
        int dividendo, divisor;
        //mostrar en pantalla
        System.out.print("ingrese el dividendo(debe ser mayor que 1):");
        dividendo= scanner.nextInt();
        System.out.print("Ingrese el divisor (debe ser mayor que 1):");
        divisor= scanner.nextInt();
        //Declara variables (residuo y cociente)
        int cociente=0, residuo=dividendo;
        //restar el dividendo del divisor hasta que el resultado sea menor que el divisor
        while (residuo>= divisor){
            residuo= residuo-divisor;
            cociente++;
        }
        //Mostrar el resultado en pantalla
        System.out.print("cociente:"+cociente);
        System.out.print("residuo:"+residuo);
    }
}
