package se.deved.exercise2;

public abstract class Animal extends PhysicalThing {
    public Animal(String name, double weight) {
        super(name, weight);
    }

    public abstract void eat();
}
