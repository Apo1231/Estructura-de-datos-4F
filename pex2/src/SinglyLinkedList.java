

public class SinglyLinkedList <K> {
    private Nodo<K> head ;
    private Nodo<K> tail ;
    private int size = 0;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //primer metodo
    public void anadirPrimero(K valor){
        Nodo<K> n = new Nodo<>(valor);

        if (head == null){
            head = n;
            tail = n;
        }else{
            n.siguiente = head;
            head = n;
        }
        size++;
    }
    public void anadirUltimo(K valor){
        Nodo<K> n = new Nodo<>(valor);
        if (head == null){
            head = n;
            tail = n;
        }else {
            tail.siguiente = n;
            tail = n;
        }
        size++;
    }

    public K eliminarPrimero(){
        if (head == null){
            System.out.println(
                    "No se encontro algo para eliminar");
            return null;
        }else{
            if(head == tail){
                K valor1 = head.valor;
                head = null;
                tail = null;
                size --;
                return valor1;
            }
            K valor1 = head.valor;
            head=head.siguiente;
            size--;
            return valor1;
        }
    }

    public K eliminarUltimo(){
        if (head == null){
            System.out.println("No hay nada por eliminar");
            return null;
        }  K valor1 = tail.valor;


        if (head == tail){
            head = null;
            tail = null;

        }else{
            Nodo<K> current = head;
            while (current.siguiente != tail){
                current = current.siguiente;
            }
            tail = current;
            current.siguiente = null;
            }
        size--;

        return  valor1;
    }


    //metodo para imprimir la lista
    public void imprimir(){
        Nodo<K> current =  head;
        while (current != null){
            System.out.println(current.valor);
            current = current.siguiente;
        }
    }
}
