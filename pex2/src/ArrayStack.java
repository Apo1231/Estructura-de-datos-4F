public class ArrayStack <Jose>{
    private Jose[] pila;
    private int tope;
    private int tamano;

    public ArrayStack(int tamano) {
        this.tamano = tamano;
        this.tope = -1;
        this.pila = (Jose[]) new Object[tamano];
    }

    public void anadir(Jose valor){
        if (tope == tamano-1){
            System.out.println("Esta lllena tu pila w");
            return;
        }
        tope++;
        System.out.println("se añadira " + valor + "en la posicion" + tope );
        pila[tope] = valor;
    }

    public Jose eliminar(){
        if (tope == -1){
            System.out.println("No hay nad apor eliminar");
            return null;
        }
        System.out.println("Se eliminara el ultimo valor");
        Jose valoreliminado = pila[tope];
        tope--;
        return valoreliminado;
    }
    public Jose cima(){
        if (tope == -1){
            System.out.println("No hay nada por consultar");
            return null;
        }
        Jose valorconsultado = pila[tope];
        return valorconsultado;
    }
    public boolean estaVacia(){
        if(tope == -1){
            return true;
        }else return false;
    }
    public boolean estaLlena(){
        if(tope == tamano-1){
            return true;
        }else return false;
    }
    public void imprimir(){
        int x = 0;
        if (tope == -1) {
            System.out.println("Esta vacia tu pila w");
            return;
        }
       for (int i = 0; i <= tope; i++){
           System.out.println(pila[i]);
       }

    }
}
