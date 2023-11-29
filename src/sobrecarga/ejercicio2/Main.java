package sobrecarga.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        n2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        n3 = sc.nextInt();

        System.out.println("Media de los dos primeros numeros:" + Medias.media(n1, n2));
        System.out.println("Media:" + Medias.media(n1, n2, n3));
        sc.close();
    }
}
