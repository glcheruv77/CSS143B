// Glenn Cheruvathur
// CSSSKL143
class DebuggingExercise4 {
    public static void main(String[] args) {
        // Initialize the Account object
        Account a = new Account("OwnerName"); // Assuming the constructor takes an owner name

        a.deposit(100); 
        System.out.println(a.getOwner() + " has $" + a.getBalance());
        
        a.withdraw(200); 
        System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
    }
}
