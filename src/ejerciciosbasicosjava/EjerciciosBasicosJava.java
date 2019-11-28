package ejerciciosbasicosjava;

/**
 *
 * @author Eduardo Suárez
 */
public class EjerciciosBasicosJava {
    
    public boolean fiestaArdillas (int numBellotas , boolean finDeSemana){
        if(finDeSemana){
            return true;
        }
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
    
    public int multa (int velocidad , boolean birthday){
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, true));
        System.out.println(ejercicios.fiestaArdillas(70, true));
    }
    
}
