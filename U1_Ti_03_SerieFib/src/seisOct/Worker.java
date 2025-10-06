package seisOct;

public class Worker {
    private int id;
    private String name;
    private String position;

    public Worker(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Métodos Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    // Método toString para una representación amigable
    @Override
    public String toString() {
        return "Worker [ID: " + id + ", Name: " + name + ", Position: " + position + "]";
    }
}