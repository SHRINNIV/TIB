package jmexample;

import java.util.Hashtable;
import java.util.Collection;
import java.util.Enumeration;
import java.util.ArrayList;

// Copyright 2003 - TIBCO Software Inc.
// ALL RIGHTS RESERVED
@SuppressWarnings("serial")
public class LocalBank implements java.io.Serializable {

    @SuppressWarnings("rawtypes")
	private Hashtable balanceList = new Hashtable();

    /**
     *Constructor.
     */
    @SuppressWarnings("unchecked")
	public LocalBank() {
        //create balance for customer Smith
        String lastName = "Smith";
        String firstName = "John";
        Balance balance = new Balance(lastName,firstName,"100-5001", 3500, 7400);
        balanceList.put(lastName+firstName, balance);

        //create balance for customer Tanaka
        lastName = "Tanaka";
        firstName = "Ben";
        balance = new Balance(lastName,firstName,"100-5002", 4532, 6934);
        balanceList.put(lastName+firstName, balance);

        //create balance for customer Miller
        lastName = "Miller";
        firstName = "Nancy";
        balance = new Balance(lastName,firstName,"100-5003", 2300, 14234);
        balanceList.put(lastName+firstName, balance);
    }

    /**
     * get customer balance.
     * @param account
     * @return
     * @throws InvalidAccountException
     */
    public Balance getBalance(Account account) throws InvalidAccountException {
        if (account == null)
           throw new InvalidAccountException();

        //get balance for the account
        Balance balance = (Balance)balanceList.get(account.customerLastName+account.customerFirstName);
        if (balance == null)
            throw new InvalidAccountException("Not a valid customer name");

        return balance;
    }

    /**
     * get all the Balance objects contained in this class.
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Collection getAllBalance() {
        Enumeration balanceEnum = balanceList.elements();
        ArrayList balanceArrayList = new ArrayList();

        while (balanceEnum.hasMoreElements()) {
            balanceArrayList.add(balanceEnum.nextElement());
        }

        return balanceArrayList;
    }


}
