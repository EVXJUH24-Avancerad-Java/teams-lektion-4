package se.deved.exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    static Store store = new Store();
    static Map<String, Person> people = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeData();

        while (true) {
            System.out.println("\nStore Simulation Menu:");
            System.out.println("1. Enter store");
            System.out.println("2. Add product to cart");
            System.out.println("3. Checkout");
            System.out.println("4. Assign cashier to register");
            System.out.println("5. Hire new employee");
            System.out.println("6. Add product to store inventory");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    enterStore();
                    break;
                case "2":
                    addToCart();
                    break;
                case "3":
                    checkout();
                    break;
                case "4":
                    assignCashier();
                    break;
                case "5":
                    hireEmployee();
                    break;
                case "6":
                    addProductToInventory();
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    static void initializeData() {
        people.put("John", new Customer("John"));
        people.put("Alice", new Customer("Alice"));
        people.put("Bob", new Cashier("Bob", 1));
        people.put("Carol", new Manager("Carol", 2));
        people.put("David", new Administrator("David", 3));

        store.employees.add((Employee) people.get("Bob"));
        store.employees.add((Employee) people.get("Carol"));
        store.employees.add((Employee) people.get("David"));

        store.addProduct("Apple", 0.5);
        store.addProduct("Bread", 2.0);
        store.addProduct("Milk", 3.0);
    }

    static void enterStore() {
        System.out.println("Enter person's name: ");
        String name = scanner.nextLine();

        if (!people.containsKey(name)) {
            System.out.println("Person not found.");
            return;
        }

        Person person = people.get(name);
        if (person instanceof Customer) {
            System.out.println("Welcome to the store!");
        } else if (person instanceof Employee) {
            System.out.println("Let's get to work!");
        }
    }

    static void addToCart() {
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();

        Person person = people.get(name);
        if (person instanceof Customer customer) {
            System.out.println("Available products:");
            for (int i = 0; i < store.inventory.size(); i++) {
                System.out.println((i + 1) + ". " + store.inventory.get(i).getName() + " - " + store.inventory.get(i).getPrice());
            }

            System.out.println("Enter product number to add to cart: ");
            int productIndex = scanner.nextInt();
            scanner.nextLine();
            if (productIndex > 0 && productIndex <= store.inventory.size()) {
                customer.addToCart(store.inventory.get(productIndex - 1));
            } else {
                System.out.println("Invalid product number.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    static void checkout() {
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();

        Person person = people.get(name);
        if (person instanceof Customer customer) {
            if (!store.cashRegisters.isEmpty() && store.cashRegisters.getFirst().getAssignedCashier() != null) {
                customer.checkout(store.cashRegisters.getFirst());
            } else {
                System.out.println("No cash register available for checkout.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    static void assignCashier() {
        System.out.print("Enter manager name: ");
        String managerName = scanner.nextLine();

        Person managerPerson = people.get(managerName);
        if (managerPerson instanceof Manager manager) {
            System.out.print("Enter cashier name: ");
            String cashierName = scanner.nextLine();

            Person cashierPerson = people.get(cashierName);
            if (cashierPerson instanceof Cashier cashier) {
                System.out.print("Enter cash register number: ");
                int registerNumber = scanner.nextInt();
                scanner.nextLine();
                if (registerNumber > 0 && registerNumber <= store.cashRegisters.size()) {
                    manager.assignCashier(cashier, store.cashRegisters.get(registerNumber - 1));
                } else {
                    System.out.println("Invalid cash register number.");
                }
            } else {
                System.out.println("Cashier not found.");
            }
        } else {
            System.out.println("Manager not found or doesn't have permission.");
        }
    }

    static void hireEmployee() {
        System.out.print("Enter administrator name: ");
        String adminName = scanner.nextLine();

        Person adminPerson = people.get(adminName);
        if (adminPerson instanceof Administrator admin) {
            System.out.print("Enter new employee name: ");
            String newName = scanner.nextLine();

            System.out.print("Enter role (Cashier/Manager/Employee): ");
            String role = scanner.nextLine();

            admin.hireEmployee(store, newName, role);
            people.put(newName, store.employees.getLast());
        } else {
            System.out.println("Administrator not found or doesn't have permission.");
        }
    }

    static void addProductToInventory() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        store.addProduct(name, price);
    }
}
