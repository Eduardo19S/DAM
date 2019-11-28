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
        if (birthday){//Si es mi cumpleaños el guardia me quita 5 de velocidad
            velocidad -= 5;
        }
        if (velocidad <= 60){
            return 0;
        }
        if (velocidad > 60 && velocidad <= 80){
            return 1;
        }
        return 2;//El resto de casos , que son en los que voy a más de 80
    }
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, true));
        System.out.println(ejercicios.fiestaArdillas(70, true));
        
        //Testeo el segundo ejercicio
        System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(65, true));
    }
    
}
