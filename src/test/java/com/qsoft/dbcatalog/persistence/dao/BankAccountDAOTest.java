package com.qsoft.dbcatalog.persistence.dao;

import com.qsoft.dbcatalog.persistence.model.BankAccount;
import com.qsoft.dbcatalog.persistence.model.Transaction;
import org.dbunit.DataSourceDatabaseTester;
import org.dbunit.IDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.util.List;

import static junit.framework.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: khiemvx
 * Date: 7/5/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:testContext.xml"})
public class BankAccountDAOTest
{
    @Autowired
    private BankAccountDAO bankAccountDAO;

    @Autowired
    private TransactionDAO transactionDAO;

    @Autowired
    private DataSource dataSourceTest;

    private IDatabaseTester iDatabaseTester;

    @Before
    public void setup() throws Exception
    {
        IDataSet dataSet = readDataSet();
        cleanlyInsert(dataSet);
    }

    private IDataSet readDataSet() throws Exception
    {
        return new FlatXmlDataSetBuilder().build(System.class.getResource("/dataset.xml"));
    }

    private void cleanlyInsert(IDataSet dataSet) throws Exception
    {
        iDatabaseTester = new DataSourceDatabaseTester(dataSourceTest);
        iDatabaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
        iDatabaseTester.setDataSet(dataSet);
        iDatabaseTester.onSetup();
    }

    @After
    public void tearDown() throws Exception
    {
        iDatabaseTester.onTearDown();
    }


    @Test
    public void testGetInfoAccount(){
        //BankAccount account = new BankAccount("0123456789", 10L);
        BankAccount bankAccount = bankAccountDAO.findAccount("0123456789");
        assertEquals("0123456789", bankAccount.getNumber_acc());
        assertEquals("openBankAccount", bankAccount.getDes());
    }
    @Test
    public void testAfterOpentAccountThenGetInfoAccount(){
        BankAccount bankAccount = new BankAccount("9876543210", 10L);
        bankAccountDAO.saveAccount(bankAccount);
        BankAccount checkAccount = bankAccountDAO.findAccount("9876543210");
        assertEquals(bankAccount.getNumber_acc(), checkAccount.getNumber_acc());
    }

    @Test
    public void testGetAllTransaction(){
        List<Transaction> transactionList = transactionDAO.getAllTransaction("0123456789");
        assertEquals(3, transactionList.size());
    }

    @Test
    public void testGetAllTransactionFromStartTimeToStopTime(){
        List<Transaction> transactionList = transactionDAO.getAllTransaction("0123456789", 1000, 50000);
        assertEquals(2, transactionList.size());
    }
}
