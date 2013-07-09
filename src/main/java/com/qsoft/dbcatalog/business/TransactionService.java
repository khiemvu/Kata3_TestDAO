package com.qsoft.dbcatalog.business;

import com.qsoft.dbcatalog.persistence.dao.TransactionDAO;
import com.qsoft.dbcatalog.persistence.model.Transaction;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Khiem
 * Date: 7/10/13
 * Time: 4:34 AM
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionService {

    public void initTransactionDAO(TransactionDAO transactionDAO);

    public Transaction createTransaction(String numberAcc, long time_stamp, double amount, String des);

    public List<Transaction> getAllTransaction(String accNumber);

    public List<Transaction> getAllTransaction(String accNumber, long startTime, long stopTime);

    public List<Transaction> getAllTransaction(String accNumber, int number);
}
