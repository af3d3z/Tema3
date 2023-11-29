package funciones.ejercicio3;

public class Maximo {
    // duda: el procesado para por ejemplo evitar que se introduzcan dos numeros iguales debe hacerse aqui o en el main?
    public static int maximo(int primerParametro, int segundoParametro){
        if(primerParametro > segundoParametro){
            return primerParametro;
        } else {
            return segundoParametro;
        }
    }
}
