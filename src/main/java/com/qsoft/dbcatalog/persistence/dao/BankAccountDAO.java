package com.qsoft.dbcatalog.persistence.dao;

import com.qsoft.dbcatalog.persistence.model.BankAccount;

/**
 * Created with IntelliJ IDEA.
 * User: khiemvx
 * Date: 7/5/13
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BankAccountDAO
{
    public void create(BankAccount account);

    public void update(BankAccount account);

    public void delete (BankAccount account);

    public void delete (long id);

    public BankAccount get(long id);
}
