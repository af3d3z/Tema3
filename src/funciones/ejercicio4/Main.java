package funciones.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        boolean esVocal;

        System.out.println("Introduce un carácter: (Si se introducen más de uno se tomará en cuenta el primero)");
        letra = sc.next().charAt(0);

        esVocal = Vocal.comprobarVocal(letra);

        if(esVocal){
            System.out.printf("%c es una vocal.", letra);
        }else {
            System.out.printf("%c no es una vocal.", letra);
        }
        sc.close();
    }
}
