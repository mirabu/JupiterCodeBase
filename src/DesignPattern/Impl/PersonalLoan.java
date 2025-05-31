package DesignPattern.Impl;

import DesignPattern.Service.Loan;

public class PersonalLoan implements Loan {
    @Override
    public void loanType() {
        System.out.println("Personal Loan");
    }
}
