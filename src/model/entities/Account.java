package model.entities;

import model.entities.exceptions.AccountExceptions;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Account(String msg) {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void Withdraw(double amount) throws AccountExceptions{
        if (amount > withdrawLimit){
            throw new AccountExceptions("Withdrawal requested greater than the limit you can withdraw");
        }
        if (amount > balance) {
            throw new AccountExceptions("Withdrawal requested greater than amount available in the account");
        }
            balance -= amount;
    }

    @Override
    public String toString() {
        return "Number account: "
                + number
                + ", Name: "
                + holder
                + ", Balance: "
                + balance;
    }
}