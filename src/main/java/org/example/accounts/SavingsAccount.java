package org.example.accounts;

public class SavingsAccount extends Account {

    private long minBalance;

    public SavingsAccount(long minBalance) {

        setMinBalance(minBalance);
    }


    private long setMinBalance(long minBalance) {
        if (minBalance > 0) {
            this.minBalance = minBalance;
            return minBalance;
        } else {
            return 0;
        }
    }

    @Override
    public void setAccountBalance(long accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance = accountBalance;
        } else {
            return;
        }
    }

    @Override
    public boolean pay(long amount) {
        if ((this.accountBalance - amount) < minBalance) {
            return false;
        } else {
            super.pay(amount);
            return true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Min Balance: " + minBalance;
    }
}
