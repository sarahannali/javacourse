public class BankAccount { // to use, BankAccount account = new BankAccount()
    private double balance;

    public BankAccount(double amount) //constructor (no return type, same name as class)
    {
        balance = amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public double getBalance()
    {
        return balance;
    }
}