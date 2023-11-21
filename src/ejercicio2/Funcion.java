package ejercicio2;

public class Funcion{
    // muestra todos los numeros entre el primer parametro y el segundo sin importar que uno sea mayor o menor
    public static void mostrarIntermedios(int primerParametro, int segundoParametro) {
        if(primerParametro == segundoParametro){
            System.out.println("Ambos parámetros son el mismo.");
        }else if(primerParametro > segundoParametro){
            for(int i = segundoParametro+1; i < primerParametro; i++){
                System.out.println(i);
            }
        }else {
            for(int i = primerParametro+1; i < segundoParametro; i++){
                System.out.println(i);
            }
        }
    }
}
