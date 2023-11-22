package ejercicio4;

public class Vocal {
    public static boolean comprobarVocal(char vocal) {
        boolean esVocal = switch(vocal){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                {
                    yield(true);
                }
            default: {yield(false);}
        };
        return esVocal;
    }
}
