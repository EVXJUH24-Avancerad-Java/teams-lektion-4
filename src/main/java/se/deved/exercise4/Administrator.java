package se.deved.exercise4;

public class Administrator extends Employee {
    public Administrator(String name, int id) {
        super(name, id);
    }

    public void hireEmployee(Store store, String name, String role) {
        int newId = store.employees.size() + 1;
        Employee newEmployee = switch (role.toLowerCase()) {
            case "cashier" -> new Cashier(name, newId);
            case "manager" -> new Manager(name, newId);
            default -> new Employee(name, newId);
        };

        store.employees.add(newEmployee);
        System.out.println("New " + role + " " + name + " hired with id " + newId);
    }
}
