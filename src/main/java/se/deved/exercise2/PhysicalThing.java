package se.deved.exercise2;

public class PhysicalThing extends Thing {

    private double weight;

    public PhysicalThing(String name, double weight) {
        super(name);

        this.weight = weight;
    }
}
