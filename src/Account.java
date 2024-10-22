import java.util.Scanner;

public class Account {
    private double balance;
    private String user;
    private int id;

    public Account() {
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void checkBalance(int id,Account[]accounts) {
        for(Account account:accounts){
            if (id==account.id){
                System.out.println(account.balance);
            }
        }
    }

    public void deposit(int id,Account[]accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("положите деньги");
        for(Account account:accounts){
            if(id==account.id){
        double deposit = scanner.nextDouble();
        account.balance = account.balance + deposit;}
    }
    }
    public void withdrawal(int id,Account[]accounts){
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько хотите снять");
        for(Account account:accounts){
            if(id==account.id){
                double deposit = scanner.nextDouble();
                if (account.balance-deposit>=0){
                account.balance = account.balance - deposit;}
            else {
                System.out.println("акча жетишсиз");
            }}
    }}

    public void transaction(int id , Account[]accounts) {
        Scanner scanner1 = new Scanner(System.in);
        for (Account account : accounts) {
            if(id==account.id){
            System.out.println("кому хотите перевести (id)");
            int idUser = scanner1.nextInt();
            System.out.println("сколько хотите перевести?");
            double withdrawal1 = scanner1.nextDouble();
            if(account.balance-withdrawal1>=0){
            for (Account ids : accounts) {
                if(idUser==id){
                    System.out.println("Error");
                }
                else {
                if (idUser == ids.id) {
                    ids.balance = ids.balance + withdrawal1;
                    account.balance=account.balance-withdrawal1;
                }}
            }}else {
                System.out.println("акча жетишсиз");
            }
        }
    }}

    public static void tet(int id,Account[]accounts){
        Scanner scanner = new Scanner(System.in);
        for (Account account:accounts){
            if (id==account.id){
                System.out.println(account);
                break;
            }
        }
        System.out.println("андай ID жок");
    }
    public static void l(Account[]accounts){
        for (int j = 0; j < 1; ) {
            Scanner scanner = new Scanner(System.in);
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
    @Override
    public String toString() {
        return "    Account\n" +
                "\nid:" + id +
                "\nuser:'" + user +
                "\n\nbalance:" + balance;
    }
}
