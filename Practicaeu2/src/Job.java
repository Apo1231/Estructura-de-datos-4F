public class Job {
    private String id;

    public Job(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id;
    }
}