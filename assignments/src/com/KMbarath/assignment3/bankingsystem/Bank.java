package com.KMbarath.assignment3.bankingsystem;

public class Bank {
	 private static int totalAccounts = 0;

	    // Constructor increments totalAccounts when new account created
	    public Bank() {
	        totalAccounts++;
	    }

	    // Static method to get total accounts
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }

}
