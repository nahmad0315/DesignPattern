public class BankExample { 
public static void main(String[] args) {
 BankAccount bankAccount = new BankAccount(); // Simulating customers checking balances concurrently
 for (int i = 0; i < 3; i++) { 
int customerId = i; new Thread(() -> bankAccount.checkBalance(customerId)).start(); } // Simulating a customer performing a transaction (write) 
new Thread(() -> bankAccount.performTransaction(1001, 200)).start(); } }
