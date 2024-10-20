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

        for (int j = 0; j < 1; ) {
            System.out.println("напишите ваш ID");
            int id = scanner.nextInt();

            boolean check = false;

            for (Account account : accounts) {
                if (id == account.getId()) {
                    check = true;

                    while (true) {
                        System.out.println("Menu \n1;balance\n2;deposit\n3;withdrawal\n4;transaction\n5;Status account\n0;Exit");
                        int menu = scanner.nextInt();

                        if (menu == 0) {
                            break;
                        } else {
                            if (menu == 1) {
                                account.checkBalance(id, accounts);
                            }
                            if (menu == 2) {
                                account.deposit(id, accounts);
                            }
                            if (menu == 3) {
                                account.withdrawal(id, accounts);
                            }
                            if (menu == 4) {
                                account.transaction(id, accounts);
                            }
                            if (menu == 5) {
                                account.tet(id, accounts);
                            }

                        }
                    }
                    break;
                }
            }
        }
    }
}