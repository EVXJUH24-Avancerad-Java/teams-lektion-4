package se.deved.exercise4;

public class Employee extends Person {
    private int id;

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
