package ejerciciosbasicosjava;

/**
 *
 * @author Eduardo Suárez
 */
public class EjerciciosBasicosJava {
    
    // Ejercicio 1
    
    public boolean fiestaArdillas (int numBellotas , boolean finDeSemana){
        if(finDeSemana){
            return true;
        }
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
    
    //Ejercicio 2
    
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
    
    //Ejercicio 3
    
    public boolean muyVanidoso(int numero){
        if (numero % 11 == 0 || numero % 11 == 1){
            return true;
        }
        return false;
        
        // Otra posible solución es :
        // return (numero % 11 == 0 || numero % 11 == 1)
    }
    
    //Ejercicio 4
    
    public boolean contesta( boolean matinal , boolean madre , boolean dormido){
        if (matinal && madre){
            return true;
        }
        if (dormido){
            return false;
        }
        if (matinal){
            return false;
        }
        return true;
    }
    
    // Ejercicio 5
    
    public boolean menorPor10 ( int a , int b , int c){
        if (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10){
            return true;
        }
        return false;
    }
    
    //Ejercicio 6
    
    public boolean digitoIgual(int a , int b){
        int aIzq = a / 10;
        int aDer = a % 10;
        int bIzq = a / 10;
        int bDer = a % 10;
        if (aIzq == bIzq || aIzq == bDer || aDer == bIzq || aDer == bDer){
            return true;
        }
        return false;
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
        
        // Testeo tercer ejercicio
        System.out.println("muyVanidoso(22) " + ejercicios .muyVanidoso(22));
        System.out.println("muyVanidoso(23) " + ejercicios .muyVanidoso(23));
        System.out.println("muyVanidoso(24) " + ejercicios .muyVanidoso(24));
        
        //Testeo cuarto ejercicio
         System.out.println("contesta (false , false , false) " + ejercicios .contesta (false , false , false));
         System.out.println("contesta (false , true , false) " + ejercicios .contesta (false , false , true));
         System.out.println("contesta (true , false , false) " + ejercicios .contesta (false , false , false));
         
         //Testeo quinto ejercicio
         System.out.println("menorPor10 (1 , 7 , 11) " + ejercicios.menorPor10 (1 , 7 , 11));
         System.out.println("menorPor10 (10 , 7 , 10) " + ejercicios.menorPor10(1 , 7 , 10));
         System.out.println("menorPor10 (11 ,1  ,7 ) " + ejercicios.menorPor10 (11 , 1 , 7));
         
         //Testeo el sexto ejercicio
         System.out.println("digitoIgual (12 , 23 ) " + ejercicios.digitoIgual (12 , 23));
         System.out.println("digitoIgual (12 , 43 ) " + ejercicios.digitoIgual (12 , 43));
         System.out.println("menorPor10 (12 , 44) " + ejercicios.digitoIgual (12 , 44));
    }
    
}
