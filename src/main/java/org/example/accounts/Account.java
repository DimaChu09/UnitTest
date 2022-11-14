package org.example.accounts;

public class Account {

    protected long accountBalance;
    protected String ownerName;

    public void setAccountBalance (long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getAccountBalance () {
        return accountBalance;
    }

    public void setOwnerName (String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName () {
        return ownerName;
    }

    public boolean pay (long amount) {
        accountBalance -= amount;
        return true;
    }

    public boolean add (long amount) {
        accountBalance += amount;
        return true;
    }

    public String toString() {
        return "Owner: " + ownerName + "; Bill: [" + accountBalance + "]";
    }
}
