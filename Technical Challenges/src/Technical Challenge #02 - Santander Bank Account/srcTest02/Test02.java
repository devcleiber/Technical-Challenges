package srcTest02;
import srcTest02.domain.BankAccount;

public class Test02 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(07170, "Cleiber", 0711.07);
        bankAccount.printInfo();
    }
}
