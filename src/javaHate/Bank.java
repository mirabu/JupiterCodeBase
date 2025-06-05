package javaHate;

public class Bank implements Investment,Dept{


    @Override
    public void balance() {
        Dept.super.balance();
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.balance();
    }
}
