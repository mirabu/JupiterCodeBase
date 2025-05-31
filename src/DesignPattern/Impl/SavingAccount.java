package DesignPattern.Impl;

import DesignPattern.Service.Account;

public class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Retail Saving Account");
    }
}
