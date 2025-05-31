package DesignPattern.Impl;

import DesignPattern.Service.Account;
import DesignPattern.Service.BankProductFactory;
import DesignPattern.Service.Loan;

public class RetailBankFactory implements BankProductFactory {
    @Override
    public Account createAccount() {
        return new SavingAccount();
    }

    @Override
    public Loan createLoan() {
        return new PersonalLoan();
    }
}
