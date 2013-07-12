package com.qsoft.dbcatalog.persistence.dao;

import com.qsoft.dbcatalog.persistence.model.Transaction;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Khiem
 * Date: 7/10/13
 * Time: 4:28 AM
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionDAO {

    void saveTransaction(Transaction capture);

    List<Transaction> getAllTransaction(String s);

    List<Transaction> getAllTransaction(String s, long startTime, long stopTime);

    List<Transaction> getAllTransaction(String s, int n);
}
