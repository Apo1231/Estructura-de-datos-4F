public class BubbleSort {
// Método para imprimir un arreglo
public void imprimirArreglo(int[] arr, String mensaje) {
    System.out.print(mensaje + ": ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println();
}

// Bubble Sort
public void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Intercambiar arr[j] y arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Método para eliminar duplicados (arreglo ya ordenado)
public int[] eliminarDuplicados(int[] arr) {
    if (arr.length == 0) {
        return arr;
    }
    
    // Primero, contar cuántos elementos únicos hay
    int contadorUnicos = 1; // Al menos hay un elemento único
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] != arr[i - 1]) {
            contadorUnicos++;
        }
    }
    
    // Crear nuevo arreglo con el tamaño correcto
    int[] sinDuplicados = new int[contadorUnicos];
    
    // Llenar el nuevo arreglo con valores únicos
    sinDuplicados = arr; // Primer elemento siempre es único
    int indice = 1;
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] != arr[i - 1]) {
            sinDuplicados[indice] = arr[i];
            indice++;
        }
    }
    
    return sinDuplicados;
}
}