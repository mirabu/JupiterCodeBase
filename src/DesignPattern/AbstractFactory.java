package DesignPattern;

import DesignPattern.Impl.CorporateBankFactory;
import DesignPattern.Impl.RetailBankFactory;
import DesignPattern.Service.Account;
import DesignPattern.Service.BankProductFactory;
import DesignPattern.Service.Loan;

public class AbstractFactory {
    public static void main(String[] args) {

        BankProductFactory factory= new RetailBankFactory();
        Account account=factory.createAccount();
        Loan loan = factory.createLoan();

        account.accountType();
        loan.loanType();


        BankProductFactory factory2 =new CorporateBankFactory();
        Account account1 = factory2.createAccount();
        Loan loan1 = factory2.createLoan();

        loan1.loanType();
        account1.accountType();

    }
}
