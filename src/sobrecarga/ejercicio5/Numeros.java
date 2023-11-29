package sobrecarga.ejercicio5;

import java.util.Random;

public class Numeros {
    public static void numerosAleatorios(int cantidad){
        for(int i = 1; i <= cantidad; i++) {
            System.out.println(Math.random());
        }
    }

    public static void numerosAleatorios (int cantidad, int valMax) {
        Random rand = new Random();
        for(int i = 1; i <= cantidad; i++){
            System.out.println(rand.nextInt(valMax));
        }
    }

    public static void numerosAleatorios (int cantidad, int valMin, int valMax) {
        Random rand = new Random();
        for(int i = 1; i <= cantidad; i++){
            System.out.println(rand.nextInt(valMin, valMax));
        }
    }
}
