package Practicas;

import java.util.ArrayList;

public class ListaMaterias {
    private ArrayList<String> materias;

    public ListaMaterias() {
        materias = new ArrayList<>();
    }

    public void agregar(String materia) {
        materias.add(materia);
    }

    public boolean contiene(String materia) {
        for (String m : materias) {
            if (m.equals(materia)) {
                return true;
            }
        }
        return false;
    }
    public void imprimir() {
        System.out.println("Materias: " + materias);
    }
//U1_Ti_02_PromedioDeSueldos
    public static void main(String[] args) {
        ListaMaterias lista = new ListaMaterias();

        // 1) Insertar al menos 5 materias
        lista.agregar("Matemáticas");
        lista.agregar("Física");
        lista.agregar("Quimica");
        lista.agregar("Historia");
        lista.agregar("Programación");

        lista.imprimir();

        // 2 Definir materia a buscar
        String materiaABuscar = "Programación";
        System.out.println("Búsqueda: " + materiaABuscar);

        // 3 Usar contiene y mostrar resultado
        if (lista.contiene(materiaABuscar)) {
            System.out.println("Resultado: Materia encontrada");
        } else {
            System.out.println("Resultado:Materia no encontrada");
        }
    }
}
