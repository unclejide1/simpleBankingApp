package com.decagonhq;

import java.util.ArrayList;

public class Branch {
    private  String branchName;
    private ArrayList<Customer> customers;


    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransactions(amount);
            return true;
        }
        return false;

    }

    private Customer findCustomer(String customerName){
        for (Customer checkedCustomers : this.customers) {
            if (checkedCustomers.getName().equals(customerName)) {
                return checkedCustomers;
            }
        }
        return null;
    }
}
