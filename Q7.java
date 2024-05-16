
 abstract class Account {
    private int accountNumber;
    private double balance;
    public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    }
    public int getAccountNumber() {
    return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
    }
    public double getBalance() {
    return balance;
    }
    public void setBalance(double balance) {
    this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    }
     class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
    super(accountNumber, balance);
    this.interestRate = interestRate;
    }
    public double getInterestRate() {
    return interestRate;
    }
    public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
    }
    public void deposit(double amount) {
    setBalance(getBalance() + amount);
    }
    public boolean withdraw(double amount) {
    if (getBalance() >= amount) {
    setBalance(getBalance()- amount);
    return true;
    }
    return false;
    }
    public String toString() {
    return "SavingsAccount [accountNumber=" + getAccountNumber() + ", balance=" + getBalance() + ", interestRate="
    +interestRate + "]";
    }
    }
     class CurrentAccount extends Account {
    private double overdraftLimit;
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
    super(accountNumber, balance);
    this.overdraftLimit = overdraftLimit;
   }
    public double getOverdraftLimit() {
    return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
    }
    public void deposit(double amount) {
    setBalance(getBalance() + amount);
    }
    public boolean withdraw(double amount) {
    if (getBalance() + overdraftLimit >= amount) {
    setBalance(getBalance()- amount);
    return true;
    }
    return false;
    }
    public String toString() {
    return "CurrentAccount [accountNumber=" + getAccountNumber() + ", balance=" + getBalance() + ",
    overdraftLimit=" + overdraftLimit + "]";
    }
    }
     class BankingApplication {
    public static void main(String[] args) {
    Account savingsAccount = new SavingsAccount(12345, 1000, 0.05);
    Account currentAccount = new CurrentAccount(67890, 500, 200);
    System.out.println("Savings Account: " + savingsAccount);
    savingsAccount.deposit(200);
    savingsAccount.withdraw(50);
    System.out.println("Updated Savings Account: " + savingsAccount);
    System.out.println();
    System.out.println("Current Account: " + currentAccount);
    currentAccount.deposit(300);
    currentAccount.withdraw(800);
    System.out.println("Updated Current Account: " + currentAccount);
    }
}