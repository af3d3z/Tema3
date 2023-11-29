package funciones.ejercicio8;

import funciones.ejercicio7.Primo;

public class Primos {
    public static int nPrimos(int n){
        int contadorPrimos = 0;
        for(int i = 2; i < n; i++) {
            if(n % i == 0 && Primo.esPrimo(i)){
                contadorPrimos++;
            }
        }

        return contadorPrimos;
    }
}
