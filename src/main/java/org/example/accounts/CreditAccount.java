package org.example.accounts;

public class CreditAccount extends Account {

    @Override
    public void setAccountBalance(long accountBalance) {
        if (accountBalance <= 0) {
            this.accountBalance = accountBalance;
        } else {
            return;
        }
    }

    @Override
    public boolean add(long amount) {
        if ((accountBalance + amount) > 0) {
            return false;
        } else {
            accountBalance -= amount;
            return true;
        }
    }
}
