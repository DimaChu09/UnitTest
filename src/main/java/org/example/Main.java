package org.example;

import org.example.accounts.CheckingAccount;
import org.example.accounts.CreditAccount;
import org.example.accounts.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        SavingsAccount savingAccount = new SavingsAccount(3000);
        savingAccount.setOwnerName("Dima");
        savingAccount.setAccountBalance(5000);
        savingAccount.pay(1100);
        System.out.println(savingAccount);

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setOwnerName("Ilya");
        checkingAccount.setAccountBalance(1000);
        checkingAccount.pay(2000);
        checkingAccount.add(2000);
        System.out.println(checkingAccount);

        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setOwnerName("Dasha");
        creditAccount.setAccountBalance(5000);
        creditAccount.pay(0);
        creditAccount.add(0);
        System.out.println(creditAccount);

        SavingsAccount savingsAccount1 = new SavingsAccount(2000);
        savingsAccount1.setOwnerName("Danil");
        savingsAccount1.setAccountBalance(-2000);
        System.out.println(savingsAccount1);
    }
}

