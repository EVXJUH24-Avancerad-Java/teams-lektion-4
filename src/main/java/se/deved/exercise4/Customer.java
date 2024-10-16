package se.deved.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Product> shoppingCart;

    public Customer(String name) {
        super(name);
        shoppingCart = new ArrayList<Product>();
    }

    public void addToCart(Product product) {
        shoppingCart.add(product);
        System.out.println(name + " added " + product.getName() + " to the cart.");
    }

    public void checkout(CashRegister cashRegister) {
        if (shoppingCart.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
            return;
        }

        double total = 0;
        for (Product product : shoppingCart)
        {
            total += product.getPrice();
        }

        System.out.println("Total: " + total);
        System.out.println("Thank you for your purchase!");
        shoppingCart.clear();
    }
}
