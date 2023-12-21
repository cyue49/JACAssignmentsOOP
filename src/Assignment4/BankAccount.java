package Assignment4;

import Assignment4.Exception.*;

public class BankAccount {
    private String name; // name of the bank account
    private double balance; // current amount of money in the bank account
    private final static double depositLimit = 500; // max amount that can be deposited
    private final static double withdrawLimit = 500; // max amount that can be withdrawn

    // constructors
    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(String name){
        this(name, 0);
    }

    // getters
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // toString
    @Override
    public String toString() {
        return "Account Info: \n" +
                "\tName: " + name + "\n" +
                "\tBalance: " + balance + "\n";
    }

    /**
     * Deposit money into the account
     * @param depositAmount amount to be deposited
     */
    public void deposit (double depositAmount) throws BankAccountException {
        if (depositAmount < 0)  throw new InvalidAmountException(); // if deposit amount is less than 0, throw invalid amount exception
        if (depositAmount > depositLimit)   throw new DepositLimitException(); // if deposit amount exceeds deposit limit, throw deposit limit exception
        balance += depositAmount; // else deposit amount
    }

    /**
     * Withdraw money from the account
     * @param withdrawAmount amount to be withdrawn
     */
    public void withdraw(double withdrawAmount) throws BankAccountException{
        if (withdrawAmount < 0) throw new InvalidAmountException(); // if withdraw amount is less than 0, throw invalid amount exception
        if (withdrawAmount > withdrawLimit) throw new WithdrawLimitException(); // if withdraw amount exceeds withdraw limit, throw withdraw limit exception
        if (withdrawAmount > balance)   throw new NotEnoughBalanceException(); // if withdraw amount larger than account balance, throw not enough balance exception
        balance -= withdrawAmount; // else withdraw amount
    }
}
