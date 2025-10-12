package Practicas;

public class sumaNnumeros {
    /*Instrucciones:
    Calcula de forma recursiva la suma de los primeros n números naturales.
    Ejemplo:
    suma(5) = 5 + 4 + 3 + 2 + 1 + 0 = 15*/
    static int suma = 0;

    public static void sumaRecursiva(int x){
        suma = x + suma;
        if ( x == 0) {
            System.out.println("tu numero era " + x + " y tu resultado es");
            System.out.println(suma);
        }else{
                sumaRecursiva(x-1);
            }


        }
        }

