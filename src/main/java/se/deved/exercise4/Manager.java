package se.deved.exercise4;

public class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }

    public void assignCashier(Cashier cashier, CashRegister cashRegister) {
        cashRegister.assignCashier(cashier);
        System.out.println("Cashier " + cashier.getName() + " assigned to register " + cashRegister.getId() + ".");
    }
}
