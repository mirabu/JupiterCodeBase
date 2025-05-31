package DesignPattern.Impl;

import DesignPattern.Service.Loan;

public class BusinessLoan implements Loan {
    @Override
    public void loanType() {
        System.out.println("BusinessLoan");
    }
}
