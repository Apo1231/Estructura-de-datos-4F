import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Cliente {
    /*Instrucciones:
Un banco atiende clientes en una cola.
Cada cliente lleva una pila de documentos.
Encola a 3 clientes con su nombre.
A cada cliente apila 2 documentos.
Atiende al primer cliente, mostrando su nombre y retirando sus documentos uno a uno.
Pasa al siguiente cliente.
Ejemplo de salida:
Cliente en atención: Carlos
Documentos retirados: Doc1, Doc2
Cola restante: [María, José]
Notas:
Crea una clase llamada cliente: id,nombre, documentos (debe de ser un stack)
Métodos:
-agregarDocumento(String doc)
-atender()
   debe de vaciar la pila de docs
   Algo como:
   while(!docs.isEmpty()){
         sout("retirando doc: "+docs.pop())
      }
En main:
Crea la Queue de clientes y haz el proceso de antencion*/
    int id  = 0;
    String name ;
    Deque<String> docs;

    Cliente(int id,String name){
        this.id = id;
        this.name = name;
        docs = new ArrayDeque<>();
    }
    public void agregarDoc(String doc){
        docs.push(doc);
        while(!docs.isEmpty()){
            System.out.println("documento retirado "  + docs.pop());
        }

    }
    public void atenderDoc(String doc){
    }

}
