package decorator.example1;

public abstract class Component {

    private String name;

    public abstract void doJob();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
