package BankingSystem;

import java.util.ArrayList;

public class Branch {
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
        }
    }

    public void addCustomerTransaction(String customerName, double amount) {
        if (findCustomer(customerName) != null) {
            Customer existingCustomer = findCustomer(customerName);
            if (existingCustomer != null) {
                existingCustomer.addTransaction(amount);
            }
        }
    }

    public Customer findCustomer(String customerName) {
        for (Customer checkedCustomer : this.customers) {
            if (checkedCustomer.getName().equals(customerName))
                return checkedCustomer;
        }
        return null;
    }
}
