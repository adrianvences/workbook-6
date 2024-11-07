package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinancialApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("pam", "123", 12500);
        Valuable account2 = new BankAccount("gary","123", 1500);
// try to deposit money into both accounts
        account1.deposit(100.00);
        account2.deposit(100.);
  // Valuable only gives access to those methods.
    }
}
