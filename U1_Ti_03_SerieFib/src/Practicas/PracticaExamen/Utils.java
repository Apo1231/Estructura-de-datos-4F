package Practicas.PracticaExamen;

import java.util.*;

public class Utils {
    public List<Pedido> pedidos = new ArrayList<Pedido>();
    public List<Pedido> pedidosI = new ArrayList<Pedido>();
    public Queue<Pedido> pedidosEstandar, pedidosUrgentes = new ArrayDeque<Pedido>();
    public Deque<Pedido> pedidosServidos;

    public void iniciarPedidos(){
        pedidos.add(new Pedido("Pedro", 1, "Urgente"));
        pedidosI.add(new Pedido("alfoonso", 2, "Normal"));
        pedidosI.add(new Pedido("jaciel", 3, "Urgente"));
        pedidosI.add(new Pedido("omar", 4, "Normal"));
        pedidosI.add(new Pedido("mit", 5, "Normal"));
        pedidosI.add(new Pedido("Pedro", 6, "Normal"));

    }
    public List<Pedido> voltearPedidos(int id, List<Pedido> pedidos){
        if(id > 5){
            return pedidos;


        }
       // pedidosI = pedidosI.reversed();

        return pedidos;
    }
}
