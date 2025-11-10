package homework.Task16;



public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(12, "12345", "BYN", 2500.22);
        Account account2 = new Account(23, "11111", "BYN", 1000.11);
        Account account3 = new Account(22, "22222", "BYN", 3600.33);
        Account account4 = new Account(33, "33333", "BYN", 1000.11);
        Account account5 = new Account(44, "44444", "BYN", 2200.44);

        bank.accounts.add(account1);
        bank.accounts.add(account2);
        bank.accounts.add(account3);
        bank.accounts.add(account4);
        bank.accounts.add(account5);

        try {
            bank.transferMoney("33333", "12345", 1500.00);
            System.out.println("Перевод выполнен успешно");

        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо,что вопользовались услугами банка");
        }

    }
}
