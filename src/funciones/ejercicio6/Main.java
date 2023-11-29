package funciones.ejercicio6;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short opcion = 0;
        double radio;
        double altura;
        double resultado;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        do{
            try {
                System.out.println("¿Qué quieres calcular?");
                System.out.print("1. Área.\n2. Volumen.\n");
                opcion = sc.nextShort();

                System.out.println("Introduce el radio del cilindro: (cm)");
                radio = sc.nextDouble();

                System.out.println("Introduce la altura del cilindro: (cm)");
                altura = sc.nextDouble();

                resultado = Cilindro.areaVolumen(altura, radio, opcion);
                System.out.printf("El resultado es: %f cm^3", resultado);
            }catch(InputMismatchException e) {
                System.err.println("Dato incorrecto, inténtelo de nuevo.");
            }
        }while(opcion >= 3 && opcion < 0);

    }
}
