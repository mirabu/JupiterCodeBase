package DesignPattern.Impl;

import DesignPattern.Service.Account;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Corporate current account");
    }
}
