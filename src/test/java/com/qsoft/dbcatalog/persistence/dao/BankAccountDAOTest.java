package com.qsoft.dbcatalog.persistence.dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created with IntelliJ IDEA.
 * User: khiemvx
 * Date: 7/5/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/testContext.xml"})
public class BankAccountDAOTest
{
    @Autowired
    private BankAccountDAO bankAccountDAO;

    @org.junit.Test
    public void testGet() throws Exception {
        System.out.println(bankAccountDAO.get(2l));
    }
}
