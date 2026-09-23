package Challenge03.src.domain;

public class BankAccount {
    private String holder;
    private int accountNumber;
    private double balance;

    public BankAccount(String holder, int accountNumber, double balance) {
        setHolder(holder);
        setAccountNumber(accountNumber);
        setBalance(balance = 0);
    }
    public BankAccount(String holder, int accountNumber) {
        setHolder(holder);
        setAccountNumber(accountNumber);
        setBalance(balance = 0);
    }
    //getters and setters

    public void setHolder(String holder) {
        if (holder ==null || holder.trim().isEmpty()) {
            System.out.println("Invalid holder. Please enter a valid holder.");
            return;
        }
        this.holder = holder;
    }
    public void getHolder() {
        return this.holder;
    }
    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            System.out.println("Invalid account number. Please enter a valid account number.");
            return;
        }
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance. Please enter a valid balance.");
            return;
        }
        this.balance = balance;
    }
    public void getBalance() {
        return this.balance;
    }
    //create deposit
    public void deposit(double depositAmount){
        if (depositAmount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a valid amount.");
            return;
        }
        balance += depositAmount;
    }
    //create withdraw
    public void withdraw(double withdrawAmount){
        if (withdrawAmount <= 0) {
            System.out.println("Invalid withdraw amount. Please enter a valid amount.");
            return;
        }
        if (withdrawAmount > balance) {
            System.out.println("Insufficient funds. Please enter a valid amount.");
            return;
        }
        balance -= withdrawAmount;
    }
    //display class
    public void display() {
        System.out.println("Holder: " + this.holder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }
    //boolean balance
    public boolean hasBalance(){
        return this.balance > 0;
    }



}


