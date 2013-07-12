package com.qsoft.dbcatalog.persistence.dao.impl;

import com.qsoft.dbcatalog.persistence.dao.TransactionDAO;
import com.qsoft.dbcatalog.persistence.model.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Khiem
 * Date: 7/10/13
 * Time: 4:30 AM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
@Component
public class TransactionDAOImpl implements TransactionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveTransaction(Transaction transaction) {
        entityManager.persist(transaction);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Transaction> getAllTransaction(String number_account) {
        Query query = entityManager.createQuery("SELECT c FROM com.qsoft.dbcatalog.persistence.model.Transaction c WHERE c.number_account = :number_account");
        query.setParameter("number_account",number_account);
        List<Transaction> transactionList = query.getResultList();
        return transactionList;
    }

    @Override
    public List<Transaction> getAllTransaction(String number_account, long startTime, long stopTime) {
        Query query = entityManager.createQuery("SELECT c FROM com.qsoft.dbcatalog.persistence.model.Transaction c WHERE c.number_account = :number_account AND c.time_stamp > :startTime AND c.time_stamp < :stopTime");
        query.setParameter("number_account",number_account);
        query.setParameter("startTime",startTime);
        query.setParameter("stopTime",stopTime);
        List<Transaction> transactionList = query.getResultList();
        return transactionList;
    }

    @Override
    public List<Transaction> getAllTransaction(String s, int n) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
