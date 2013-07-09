package com.qsoft.dbcatalog.persistence.dao.impl;

import com.qsoft.dbcatalog.persistence.dao.TransactionDAO;
import com.qsoft.dbcatalog.persistence.model.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Khiem
 * Date: 7/10/13
 * Time: 4:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDAOImpl implements TransactionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Transaction saveTransaction(Transaction capture) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Transaction> getAllTransaction(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Transaction> getAllTransaction(String s, long startTime, long stopTime) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Transaction> getAllTransaction(String s, int n) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
