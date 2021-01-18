package com.ilp.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ilp.tcs.bean.Account;
import com.ilp.tcs.util.DatabaseUtil;

public class AccountDAO {
public Account searchAccount(int accountid)
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Account a=null;
		con=DatabaseUtil.getConnection();
		try
		{
			ps=con.prepareStatement("select * from TBL_Accounts_1334828 where accountno=?");
			ps.setInt(1,accountid);
			rs=ps.executeQuery();
			while(rs.next())
			{
				a=new Account(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
		}
		return a;
	}
public int getaccountid(int accountid)
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Account a=null;
	int n=0;
		con=DatabaseUtil.getConnection();
		try
		{
			ps=con.prepareStatement("select accountno from TBL_Accounts_1334828 where accountno=?");
			ps.setInt(1, accountid);
			rs=ps.executeQuery();
			while(rs.next())
			{
				n=rs.getInt(1);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
		}
		return n;
}
public int getbalance(int accountid)
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Account a=null;
	int n=0;
		con=DatabaseUtil.getConnection();
		try
		{
			ps=con.prepareStatement("select balance from TBL_Accounts_1334828 where accountno=?");
			ps.setInt(1,accountid);
			rs=ps.executeQuery();
			while(rs.next())
			{
				n=rs.getInt(1);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
		}
		return n;
		
}
public int update(int accountid,int balance)
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Account a=null;
	int n=0;
		con=DatabaseUtil.getConnection();
		try
		{
			ps=con.prepareStatement("update TBL_Accounts_1334828 set balance=? where accountno=?");
			ps.setInt(1,balance);
			ps.setInt(2, accountid);
			n=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
		}
		return n;
}
public int getstatus(int accountid)
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Account a=null;
	int n=0;
		con=DatabaseUtil.getConnection();
		try
		{
			ps=con.prepareStatement("select status from TBL_Accounts_1334828 where accountno=?");
			ps.setInt(1,accountid);
			rs=ps.executeQuery();
			while(rs.next())
			{
				n=rs.getInt(1);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
		}
		return n;
}
}

