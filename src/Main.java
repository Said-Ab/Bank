import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setId(1);
        account1.setUser("Said");
        account1.setBalance(1000);
        Account account2 = new Account();
        account2.setId(2);
        account2.setUser("Enes");
        account2.setBalance(2000);
        Account account3 = new Account();
        account3.setId(3);
        account3.setUser("Dias");
        account3.setBalance(3000);
        Account[] accounts = {account1, account2, account3};
        Scanner scanner = new Scanner(System.in);

        Account.l(accounts);
    }
}