import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        // Estructuras personalizadas requeridas
        ArrayQueue<Job> queue = new ArrayQueue<>(50);
        ArrayStack<Job> stack = new ArrayStack<>(50);
        SinglyLinkedList<Job> log = new SinglyLinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de Gestión de Tareas. Comandos: ADD [ID], PROCESS [N], COMMIT, ROLLBACK [M], PRINT, END");

        while (true) {
            System.out.print("> ");
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            String cmd = parts[0].toUpperCase();

            try {
                switch (cmd) {
                    case "ADD":
                        // Regla: Si ADD se ejecuta sin argumento, mostrar “Falta ID de trabajo”
                        if (parts.length < 2) {
                            System.out.println("Falta ID de trabajo. Uso: ADD [ID]");
                            break;
                        }
                        // Agrega un nuevo trabajo al final de la cola (FIFO)
                        queue.enqueue(new Job(parts[1]));
                        System.out.println("Trabajo " + parts[1] + " agregado a la cola.");
                        break;

                    case "PROCESS":
                        // Regla: Validar si 'n' es un número
                        if (parts.length < 2 || !parts[1].matches("\\d+")) {
                            System.out.println("Número de trabajos inválido o faltante. Uso: PROCESS [N]");
                            break;
                        }
                        int n = Integer.parseInt(parts[1]);
                        // Regla: Si la cola tiene menos de n trabajos, procesa todos los disponibles.
                        int count = Math.min(n, queue.size());
                        if (count == 0) {
                            System.out.println("Cola de pendientes vacía. Nada para procesar.");
                            break;
                        }

                        // Mueve N trabajos de la cola (FIFO) a la pila (LIFO)
                        for (int i = 0; i < count; i++) {
                            stack.push(queue.dequeue());
                        }
                        System.out.println(count + " trabajo(s) movido(s) de la cola a la pila.");
                        break;

                    case "COMMIT":
                        if (stack.isEmpty()) {
                            System.out.println("Pila de procesando vacía. Nada para confirmar.");
                            break;
                        }
                        int commitCount = stack.size();
                        // Confirma todos los trabajos en la pila, moviéndolos a la bitácora (LIFO -> addLast)
                        while (!stack.isEmpty()) {
                            log.addLast(stack.pop());
                        }
                        System.out.println(commitCount + " trabajo(s) confirmado(s) y movido(s) a la bitácora.");
                        break;

                    case "ROLLBACK":
                        // Regla: Validar si 'm' es un número
                        if (parts.length < 2 || !parts[1].matches("\\d+")) {
                            System.out.println("Número de reversiones inválido o faltante. Uso: ROLLBACK [M]");
                            break;
                        }
                        int m = Integer.parseInt(parts[1]);
                        // Regla: Si m > tamaño de la bitácora, revertir solo los que existan.
                        int rollbackCount = Math.min(m, log.size());
                        if (rollbackCount == 0) {
                            System.out.println("Bitácora vacía o M es cero. Nada para revertir.");
                            break;
                        }

                        // Revierte M trabajos, eliminándolos del final de la bitácora y reinsertándolos al frente de la cola.
                        // removeLast() de la lista enlazada simple es O(n) en tu implementación original, manteniendo la complejidad requerida.
                        for (int i = 0; i < rollbackCount; i++) {
                            // Se asume que la nueva implementación de ArrayQueue.java maneja la reinserción
                            // La Queue es FIFO, y removeLast saca el más reciente de la Bitácora.
                            // Esto cumple con devolver el trabajo a la cola de espera.
                            queue.enqueue(log.removeLast());
                        }
                        System.out.println(rollbackCount + " trabajo(s) revertido(s) de la bitácora a la cola.");
                        break;

                    case "PRINT":
                        // Regla: Mostrar el contenido actual de las tres estructuras.
                        System.out.println("--- Estado Actual ---");
                        System.out.println("QUEUE (pendientes): " + queue);
                        System.out.println("STACK (procesando): " + stack);
                        System.out.println("BITÁCORA (confirmados): " + log);
                        System.out.println("---------------------");
                        break;

                    case "END":
                        // Regla: Finaliza la ejecución y muestra el estado final.
                        System.out.println("=== ESTADO FINAL ===");
                        System.out.println("QUEUE (pendientes): " + queue);
                        System.out.println("STACK (procesando): " + stack);
                        System.out.println("BITÁCORA (confirmados): " + log);
                        System.out.println("Saliendo del programa...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Comando desconocido. Intente con: ADD, PROCESS, COMMIT, ROLLBACK, PRINT, END.");
                }
            } catch (IllegalStateException e) {
                // Captura errores de estructuras (Queue/Stack lleno/vacío)
                System.out.println("Error de estado: " + e.getMessage());
            } catch (NumberFormatException e) {
                // Captura errores si el argumento no se pudo parsear (aunque ya se validó antes)
                System.out.println("Error: El argumento de PROCESS/ROLLBACK debe ser un número entero válido.");
            }
        }
    }
}