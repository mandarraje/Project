package com.mandar;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Account Chase = new Account();
//        System.out.println("Account Name is " + Chase.getAccount_name());
//        Chase.setAccount_name("Customer 1 - Om");
//        Chase.setAccount_num(24892489);
//        Chase.setBalance_amt(50000);
//        Chase.setDeposit_amt(2000);
//        System.out.println("Account Name is " + Chase.getAccount_name());
//        System.out.println("Account Number is " + Chase.getAccount_num());
//        System.out.println("Current Account Balance is " + Chase.getBalance_amt());
//        System.out.println("Deposit Amount Name is " + Chase.getDeposit_amt());
//        private long account_num;
//        private String customer_name;
//        private String customer_phone;
//        private String customer_email;
//        private double deposit_amt;
//        private double balance_amt;

        Account Cust1 = new Account();
//  public  Account(long account_num, String customer_name, String customer_phone, String customer_email, double balance_amt){

        Account Cust2 = new Account(123435, "Krishna", "888-8888-88888", "krishna@world.com", 999999.99);

        //        Account Cust2 = new Account();
        Cust1.setAccount_num(24892489);
        Cust1.setCustomer_name("Krishna");
        Cust1.setBalance_amt(1000000.0);
        System.out.println("Customer 1 Name = " + Cust1.getCustomer_name());
        System.out.println(Cust1.getCustomer_name() + " has " + Cust1.getBalance_amt() + " in their account");
        System.out.println("Lets try a deposit of amount 5000 for Customer " + Cust1.getCustomer_name());
        double newBalance = Cust1.process_deposit(5000.0);
        System.out.println("Account Balance after the deposit " + Cust1.getBalance_amt());
        System.out.println("Lets try a withdrawal of amount 5000 for Customer " + Cust1.getCustomer_name());
        Cust1.process_withdraw(5000.0);
        System.out.println("Account Balance after the withdrawal " + Cust1.getBalance_amt());

//        Cust2.setAccount_num(55555555);
//        Cust2.setBalance_amt(1000000);
//        System.out.println("Customer 2 Name before setting = " + Cust2.getCustomer_name());
//        Cust2.setCustomer_name("Ram");
//        System.out.println("Customer 2 Name = " + Cust2.getCustomer_name());
//        Cust2.process_deposit(2000);
        System.out.println("Fun with constructors");
        System.out.println("");
        Account cust3 = new Account("925-999-9999","cust3@email.com",555.45);
        System.out.println("Setting constructor with 3 parameters. Getting the name now from constructor " +cust3.getCustomer_name() );


    }
}
