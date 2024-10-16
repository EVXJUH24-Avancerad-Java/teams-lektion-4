package se.deved.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Product> inventory;
    public List<Employee> employees;
    public List<CashRegister> cashRegisters;

    public Store() {
        inventory = new ArrayList<Product>();
        employees = new ArrayList<Employee>();
        cashRegisters = new ArrayList<CashRegister>();

        // Initialize with some cash registers
        for (int i = 1; i <= 3; i++) {
            cashRegisters.add(new CashRegister(i));
        }
    }

    public void addProduct(String name, double price) {
        inventory.add(new Product(name, price));
        System.out.println("Added " + name + " to the inventory. Price: " + price);
    }
}
