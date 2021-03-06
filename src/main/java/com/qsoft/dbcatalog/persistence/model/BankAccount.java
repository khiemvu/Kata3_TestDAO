package com.qsoft.dbcatalog.persistence.model;

import javax.persistence.*;


/**
 * Created with IntelliJ IDEA.
 * User: khiemvx
 * Date: 7/5/13
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "bank_account")
@SequenceGenerator(name = "id_acc_seq", sequenceName = "id_acc_seq", allocationSize= 1)
public class BankAccount
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_acc_seq")
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="number_acc")
    private String number_acc;

    @Column(name="balance")
    private double balance;

    @Column(name="des")
    private String des;

    @Column(name="time_stamp")
    private long time_stamp;

    public BankAccount(String number_acc, long time_stamp) {
        this.number_acc = number_acc;
        this.time_stamp = time_stamp;
    }
    public BankAccount(){

    }

    public Long getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(long time_stamp) {
        this.time_stamp = time_stamp;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getNumber_acc()
    {
        return number_acc;
    }

    public void setNumber_acc(String number_acc)
    {
        this.number_acc = number_acc;
    }

    public String getDes()
    {
        return des;
    }

    public void setDes(String des)
    {
        this.des = des;
    }
}
