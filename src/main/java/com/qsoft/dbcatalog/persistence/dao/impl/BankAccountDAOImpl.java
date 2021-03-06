package com.qsoft.dbcatalog.persistence.dao.impl;

import com.qsoft.dbcatalog.persistence.dao.BankAccountDAO;
import javax.persistence.PersistenceContext;
import com.qsoft.dbcatalog.persistence.model.BankAccount;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 * Created with IntelliJ IDEA.
 * User: khiemvx
 * Date: 7/5/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
@Component
public class BankAccountDAOImpl implements BankAccountDAO
{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void saveAccount(BankAccount bankAccount) {
        entityManager.persist(bankAccount);//To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BankAccount findAccount(String number_acc) {
        Query query = entityManager.createQuery("SELECT c FROM com.qsoft.dbcatalog.persistence.model.BankAccount c Where c.number_acc = :number_acc");
        query.setParameter("number_acc", number_acc);
        if(query.getResultList().isEmpty())
            return null;
        else
            return (BankAccount) query.getSingleResult();
    }
}
