package homework.Task16;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    Set<Account> accounts = new HashSet<>();

    public Account findAccountByNumber(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account from = findAccountByNumber(accountNumberFrom);
        Account to = findAccountByNumber(accountNumberTo);

        if (from == null) {
            throw new AccountNotFoundException("Счёт отправителя не найден", "not.found.account");
        }
        if (to == null) {
            throw new AccountNotFoundException("Счёт получателя не найден", "not.found.account");
        }

        if (from.getAmount() < amount) {
            throw new NotEnoughMoneyException("Недостаточно средств на счёте отправителя", "not.enough.money");
        }


        from.setAmount(from.getAmount() - amount);
        to.setAmount(to.getAmount() + amount);
    }


}


