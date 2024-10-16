package se.deved.exercise4;

public class CashRegister {
    private int id;

    private Cashier assignedCashier = null;

    public CashRegister(int id) {
        this.id = id;
    }

    public void assignCashier(Cashier cashier) {
        assignedCashier = cashier;
    }

    public Cashier getAssignedCashier() {
        return assignedCashier;
    }

    public int getId() {
        return id;
    }
}
