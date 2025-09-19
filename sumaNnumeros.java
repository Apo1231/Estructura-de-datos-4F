public class sumaNnumeros {
    /*Instrucciones:
    Calcula de forma recursiva la suma de los primeros n números naturales.
    Ejemplo:
    suma(5) = 5 + 4 + 3 + 2 + 1 + 0 = 15*/
    int x = 5;

    public sumaNnumeros() {
    }

    int suma = 0;

    public void sumaRecursiva(int x){
        for ( int i = 0 ; i <= x ; i++) {
            suma = suma + i;


            if (i == x) {
                System.out.println(suma
                );
            }

        }
        }

}
