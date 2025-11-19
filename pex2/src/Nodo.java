public class Nodo <K> {
    K valor ;
        Nodo <K> siguiente;

    public Nodo(K valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                '}';
    }
}
