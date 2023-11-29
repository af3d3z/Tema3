package funciones.ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dia, mes, anio;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Introduzca el día:");
            dia = sc.nextInt();
            System.out.println("Introduzca el mes:");
            mes = sc.nextInt();
            System.out.println("Introduzca el año:");
            anio = sc.nextInt();

            if(Fecha.validarFecha(dia, mes, anio)){
                System.out.println("La fecha es correcta.");
            }else {
                System.out.println("La fecha no existe.");
            }
        }catch(InputMismatchException e) {
            System.err.println("Ha introducido un dato incorrecto.");
        }

        sc.close();
    }
}
