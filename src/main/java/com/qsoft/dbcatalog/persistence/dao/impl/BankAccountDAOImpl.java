package com.qsoft.dbcatalog.persistence.dao.impl;

import com.qsoft.dbcatalog.persistence.dao.BankAccountDAO;
import javax.persistence.PersistenceContext;
import com.qsoft.dbcatalog.persistence.model.BankAccount;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;


/**
 * Created with IntelliJ IDEA.
 * User: khiemvx
 * Date: 7/5/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class BankAccountDAOImpl implements BankAccountDAO
{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void saveAccount(BankAccount capture) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BankAccount findAccount(String accNumber) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
