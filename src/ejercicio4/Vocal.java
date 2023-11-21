package ejercicio4;

public class Vocal {
    public static boolean comprobarVocal(char vocal) {
        boolean esVocal = switch(vocal){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                {
                    yield(true);
                }
            default: {yield(false);}
        };

        return esVocal;
    }
}
