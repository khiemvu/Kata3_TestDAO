package com.qsoft.dbcatalog.business.impl;

import com.qsoft.dbcatalog.business.TransactionService;
import com.qsoft.dbcatalog.persistence.dao.TransactionDAO;
import com.qsoft.dbcatalog.persistence.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Khiem
 * Date: 7/10/13
 * Time: 4:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionDAO transactionDAO;

    @Override
    public void initTransactionDAO(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @Override
    public Transaction createTransaction(String numberAcc, long time_stamp, double amount, String des) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Transaction> getAllTransaction(String accNumber) {
        List<Transaction> transactionList = transactionDAO.getAllTransaction(accNumber);
        if(transactionList == null)
            return null;
        else
            return transactionList;
    }

    @Override
    public List<Transaction> getAllTransaction(String accNumber, long startTime, long stopTime) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Transaction> getAllTransaction(String accNumber, int number) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
