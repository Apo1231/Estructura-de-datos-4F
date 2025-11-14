public class App {
    public static void main(String[] args) {
        // Crear instancia de la clase BubbleSort
        BubbleSort sorting = new BubbleSort();
        
        // Arreglo original con duplicados
        int[] arr = {4, 2, 9, 2, 4, 7, 1};
        
        // 1. Imprimir arreglo original
        sorting.imprimirArreglo(arr, "Arreglo original");
        
        // 2. Ordenar usando Bubble Sort
        sorting.bubbleSort(arr);
        
        // 3. Imprimir después de ordenar
        sorting.imprimirArreglo(arr, "Arreglo ordenado");
        
        // 4. Crear nuevo arreglo sin duplicados
        int[] sinDuplicados = sorting.eliminarDuplicados(arr);
        
        // 5. Imprimir ambos arreglos
        System.out.println("\n--- Resultado Final ---");
        sorting.imprimirArreglo(arr, "Arreglo ordenado (con duplicados)");
        sorting.imprimirArreglo(sinDuplicados, "Arreglo sin duplicados");
    }
}