package com.qsoft.dbcatalog.business.impl;

import com.qsoft.dbcatalog.business.BankAccountService;
import com.qsoft.dbcatalog.persistence.dao.BankAccountDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: khiemvx
 * Date: 7/5/13
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountDAO bankAccountDAO;

}
