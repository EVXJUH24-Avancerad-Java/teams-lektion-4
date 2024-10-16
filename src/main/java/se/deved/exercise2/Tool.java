package se.deved.exercise2;

public abstract class Tool extends PhysicalThing {
    public Tool(String name, double weight) {
        super(name, weight);
    }

    public abstract void use();
}
