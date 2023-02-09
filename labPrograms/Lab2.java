package com.labPrograms;

public class Lab2 {

    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", 101);
        Accounts account1 = new SBI(1001, customer1, 5000.0);
        System.out.println("Interest earned by customer " + customer1.getName() + " in SBI account: " + account1.calculateInterest());

        Customer customer2 = new Customer("Jane Doe", 102);
        Accounts account2 = new ICICI(1002, customer2, 7000.0);
        System.out.println("Interest earned by customer " + customer2.getName() + " in ICICI account: " + account2.calculateInterest());

        Customer customer3 = new Customer("Jim Brown", 103);
        Accounts account3 = new PNB(1003, customer3, 9000.0);
        System.out.println("Interest earned by customer " + customer3.getName() + " in PNB account: " + account3.calculateInterest());
    }
}

class Customer {
    private String name;
    private int id;

    Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName () {
        return name;
    }
}
abstract class Accounts {

    private Customer customer;
    private int accNo;
    private double balance;

    public Accounts(Customer customer, int accNo, double balance) {
        this.customer = customer;
        this.accNo = accNo;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }
    public int getAccNo() {
        return accNo;
    }
    public double getBalance() {
        return balance;
    }

    abstract double calculateInterest();
}


class RBI {
    private static final double MIN_INTEREST_RATE = 4.0;

    public static double getMinInterestRate() {
        return MIN_INTEREST_RATE;
    }
}

class SBI extends Accounts {
    public SBI(int accNo, Customer customer, double balance) {
        super(customer, accNo, balance);
    }

    @Override
    public double calculateInterest() {
        return (getBalance() * RBI.getMinInterestRate()) / 100;
    }
}

class ICICI extends Accounts {
    public ICICI(int accountId, Customer customer, double balance) {
        super(customer, accountId, balance);
    }

    @Override
    public double calculateInterest() {
        return (getBalance() * (RBI.getMinInterestRate() + 0.5)) / 100;
    }
}

class PNB extends Accounts {
    public PNB(int accountId, Customer customer, double balance) {
        super(customer, accountId, balance);
    }

    @Override
    public double calculateInterest() {
        return (getBalance() * (RBI.getMinInterestRate() + 1.0)) / 100;
    }
}