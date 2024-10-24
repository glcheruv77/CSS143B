// Glenn Cheruvathur
// CSSSKL143
/** 
 * Account.java
 * This Account class represents bank accounts that store money for an owner.
 * Author: (put your name here)
 */
class Account {
    // Instance variables
    private double balance; // invariant: balance >= 0 (should never be negative)
    private String owner;

    // Constructor
    public Account(String name) {
        balance = 0;
        owner = name;
    }

    // Instance methods
    /** Deposits 'amount' into the account */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /** 
     * Withdraws 'amount' from the account.
     * This only makes sense if amount <= balance.
     * This method ensures that there is no possibility of having a negative balance.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.err.println("Error: Insufficient funds or invalid amount");
        }
    }

    /** Returns the balance of the Account */
    public double getBalance() {
        return balance;
    }

    /** Returns the owner of the Account */
    public String getOwner() {
        return owner;
    }
}
