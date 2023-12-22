import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 1000; // Initial balance
    private final Lock lock = new ReentrantLock();
    private final Lock readLock = new ReentrantLock();
    private final Lock writeLock = new ReentrantLock();
    private int readers = 0;

    public void checkBalance(int customerId) {
        try {
            readLock.lock();
            readers++;
            if (readers == 1) {
                writeLock.lock(); // Acquire exclusive access during reads
            }
            System.out.println("Customer " + customerId + " is checking balance: $" + balance);
            Thread.sleep(1000); // Simulate read operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
            readers--;
            if (readers == 0) {
                writeLock.unlock(); // Release exclusive access after reads
            }
        }
    }

    public void performTransaction(int customerId, int amount) {
        try {
            writeLock.lock();
            System.out.println("Customer " + customerId + " is performing a transaction...");
            Thread.sleep(2000); // Simulate write operation
            balance -= amount;
            System.out.println("Transaction complete. New balance: $" + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }
}