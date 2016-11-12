package jmexample;

// Copyright 2003 - TIBCO Software Inc.
// ALL RIGHTS RESERVED

/**
 * This class contains customer's balance information.
 */
@SuppressWarnings("serial")
public class Balance implements java.io.Serializable {
    //private members
    private String customerLastName = null;
    private String customerFirstname = null;
    private String accountId = null;

    //public members
    public double checkingBalance = 0;
    public double savingsBalance = 0;

    /**
     * Constructor.
     */
    public Balance() {
    }

    /**
     * Constructor.
     * @param lastName - customer Last name
     * @param firstName - customer first name
     * @param acctId - account Id
     * @param checkBal - checking balance
     * @param savBal - savings balance
     */
    public Balance(String lastName, String firstName, String acctId, double checkBal, double savBal) {
        customerLastName = lastName;
        customerFirstname = firstName;
        accountId = acctId;
        checkingBalance = checkBal;
        savingsBalance = savBal;
    }

    //customerLastName accessor method
    public String getCustomerLastName() {
        return customerLastName;
    }

    //customerFirstname accessor method
    public String getCustomerFirstName() {
        return customerFirstname;
    }

    //accountId accessor method
    public String getAccountId() {
        return accountId;
    }

}
