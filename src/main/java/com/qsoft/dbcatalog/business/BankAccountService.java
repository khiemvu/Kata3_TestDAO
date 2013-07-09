package com.qsoft.dbcatalog.business;

import com.qsoft.dbcatalog.persistence.dao.BankAccountDAO;
import com.qsoft.dbcatalog.persistence.model.BankAccount;
import com.qsoft.dbcatalog.persistence.model.Transaction;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: khiemvx
 * Date: 7/5/13
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BankAccountService{

    public void  setAccountDAO(BankAccountDAO bankAccountDAO);

    public BankAccount createAccount(String numberAcc, long time_stamp);

    public BankAccount getAccount(String numberAcc);

    public BankAccount doDeposit(String accNumber, double amount, String des);

    public BankAccount doWithdraw(String accNumber, double amount, String des);

    public List<Transaction> getAllTransaction(String numberAcc);

    public List<Transaction> getAllTransaction(String accNumber, long timeStart, long timeStop);

    public List<Transaction> getAllTransaction(String accNumber, int numRecord);
}
