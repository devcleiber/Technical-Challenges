package srcTest02.domain;

public class BankAccount {
    public int accountNumber;
    public String holderName;
    public double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
        public void printInfo(){
            System.out.println("Bank Account Information:");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + holderName);
            System.out.println("Balance: $" + balance);
        }
}
