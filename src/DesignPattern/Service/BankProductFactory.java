package DesignPattern.Service;

public interface BankProductFactory {
    Account createAccount();
    Loan createLoan();
}
