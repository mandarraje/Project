package com.mandar;

public class Account {

    private long account_num;
    private String customer_name;
    private String customer_phone;
    private String customer_email;
    //    private double deposit_amt;
    private double balance_amt;

    public Account() {
        this(99999, "default cust", "111-1111-1111", "cust@gmail.com", 0.0);
        System.out.println("Inside empty Constructor");
    }

    public Account(long account_num, String customer_name, String customer_phone, String customer_email, double balance_amt) {

        System.out.println("Inside Constructor with values");
        this.account_num = account_num;
        this.customer_name = customer_name;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.balance_amt = balance_amt;
        System.out.println("Values set in the Constructor with values = " + this.account_num + " " + this.customer_name + " " +
                this.customer_phone + " " + this.customer_email + " " + this.balance_amt);
    }


    public Account(String customer_phone, String customer_email, double balance_amt) {
        this(123456,"DefaultCustomer",customer_phone,customer_email,balance_amt);
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.balance_amt = balance_amt;
    }

    public void setAccount_num(long account_num) {
        this.account_num = account_num;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public void setBalance_amt(double balance_amt) {
        this.balance_amt = balance_amt;

    }

//    public void setDeposit_amt(double deposit_amt) {
//        this.deposit_amt = deposit_amt;
//    }

    public long getAccount_num() {
        return this.account_num;
    }

    public String getCustomer_name() {
        return this.customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

//    public double getDeposit_amt() {
//        return deposit_amt;
//    }

    public double getBalance_amt() {
        return balance_amt;
    }

    public double process_deposit(double deposit_amt) {
        this.balance_amt = this.balance_amt + deposit_amt;
        System.out.println("New Balance after the Deposit of " + deposit_amt + " = " + this.balance_amt);
        return this.balance_amt;
    }

    public double process_withdraw(double withdraw_amt) {
        if (balance_amt - withdraw_amt >= 0) {
            balance_amt = this.balance_amt - withdraw_amt;
//            this.balance_amt -=withdraw_amt;
            return balance_amt;
        } else {
            System.out.println("Insufficient Balance. Transaction was not processed.");
            return this.balance_amt;
        }


    }


}
