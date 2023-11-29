package sobrecarga.ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n, n1;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Introduce el primer numero:");
        n = sc.nextDouble();
        System.out.println("Introduce el segundo numero:");
        n1 = sc.nextDouble();

        System.out.println("Suma de enteros: " + Sumas.suma((int) n, (int) n1));
        System.out.println("Suma de decimales: " + Sumas.suma(n, n1));
        sc.close();
    }
}
