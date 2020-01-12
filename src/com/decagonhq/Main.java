package com.decagonhq;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("AccessBank");
	bank.addBranch("lekki");
	bank.addCustomer("lekki", "jide", 89.00);
	bank.addCustomer("lekki", "ofor", 89.00);
	bank.addCustomer("lekki", "joel", 89.00);

	bank.addBranch("ijesha");
	bank.addCustomer("ijesha", "mike", 89.00);
	bank.addCustomerTransaction("lekki", "jide", 300000);
	bank.addCustomerTransaction("lekki", "jide", 300000);
	bank.addCustomerTransaction("lekki", "jide", 300000);

	bank.listCustomers("ijesha", true);

//	if(!bank.addCustomer("just", "jide", 80.00)){
//		System.out.println("ok");
//	}

		if(!bank.addBranch("ijesha")){
			System.out.println("ok");
		}
    }
}
