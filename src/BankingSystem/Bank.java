package BankingSystem;

import java.util.ArrayList;

public class Bank {

    private final ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public void addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
        }
    }

    public void addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.newCustomer(customerName, initialAmount);
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, amount);
        }
    }

    public Branch findBranch(String branchName) {
        for (Branch checkedBranch : this.branches) {
            if (checkedBranch.getName().equals(branchName))
                return checkedBranch;
        }
        return null;
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + branchCustomer.getName() + "[" + i + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
        }
    }
}
