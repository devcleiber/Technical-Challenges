package Challenge03.src;
import Challenge03.src.domain.BankAccount;

public class Technical03 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("01177", 0711076769021, 021000.0);
        bank.display();

        bank.deposit(2500);
        bank.display();

        bank.withdraw(3000);
        bank.display();

        BankAccount banktwo = new BankAccount("qa01177", 0711076769021);
        banktwo.deposit(0); // balance not = 0
        banktwo.display();
        banktwo.withdraw(280);//error withdraw>balance
        banktwo.display();

        BankAccount errorbank = new BankAccount("  ", 0, -1202.60);//error bank
        errorbank.display();

    boolean hasBalance = errorbank.hasBalance(); // false < 0
    System.out.println("Has balance: " + hasBalance);

    boolean hasBalance2 = bank.hasBalance(); // true > 0
    System.out.println("Has balance: " + hasBalance2);


}

