package BankingSystem;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch("MH");
        bank.addCustomer("MH", "Anirudh", 100000);
        bank.addCustomer("MH", "Abhishek", 20000);
        bank.addCustomer("MH", "Aayush", 30000);

        bank.addBranch("RJ");
        bank.addCustomer("RJ", "Aki", 50000);

        bank.addCustomerTransaction("RJ", "Aki", 5000);
        bank.addCustomerTransaction("RJ", "Aki", 15000);
        bank.addCustomerTransaction("MH", "Abhishek", 1000);

        bank.listCustomers("MH", true);
        bank.listCustomers("RJ", true);
    }
}
