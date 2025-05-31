package DesignPattern.Impl;

import DesignPattern.Service.Account;
import DesignPattern.Service.BankProductFactory;
import DesignPattern.Service.Loan;

public class CorporateBankFactory implements BankProductFactory {
    @Override
    public Account createAccount() {
        return new CurrentAccount();
    }

    @Override
    public Loan createLoan() {
        return new BusinessLoan();
    }
}
