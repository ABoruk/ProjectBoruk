package homework.Task16;


public class Account {
    private int id;
    private String accountNumber;
    private String currency;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Account(int id, String accountNumber, String currency, double amount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;


    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account a))
            return false;
        return id == a.id && accountNumber.equals(a.accountNumber);
    }

    @Override
    public int hashCode() {
        return id + accountNumber.hashCode() + currency.hashCode() + Double.hashCode(amount);
    }

}
