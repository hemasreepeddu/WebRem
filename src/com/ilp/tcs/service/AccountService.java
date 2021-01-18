package com.ilp.tcs.service;

import com.ilp.tcs.bean.Account;
import com.ilp.tcs.dao.AccountDAO;

public class AccountService {
AccountDAO d=new AccountDAO();
public Account searchAccount(int accountid)
{
	return d.searchAccount(accountid);
}
public int getaccount(int accountid)
{
	return d.getaccountid(accountid);
}
public int getbalance(int accountid)
{
	return d.getbalance(accountid);
}
public int update(int accountid,int balance)
{
	int id=d.getaccountid(accountid);
	int bal=d.getbalance(accountid)+balance;
	return d.update(id, bal);
}
public int status(int accountid)
{
	return d.getstatus(accountid);
}
}
