package com.ilp.tcs.bean;

public class Account {
int accountno;
String accounttype;
int balance;
String branch;
String status;
public int getAccountno() {
	return accountno;
}
public void setAccountno(int accountno) {
	this.accountno = accountno;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Account(int accountno, String accounttype, int balance, String branch, String status) {
	super();
	this.accountno = accountno;
	this.accounttype = accounttype;
	this.balance = balance;
	this.branch = branch;
	this.status = status;
}
public Account() {
	super();
}

}
