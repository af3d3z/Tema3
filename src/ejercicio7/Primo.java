package ejercicio7;

public class Primo {
    public static boolean esPrimo(int n){
        boolean primo = true;

        for(int i = 2; i < n; i++){
            if (n % i == 0){
                primo = false;
                break;
            }
        }

        return primo;
    }
}
