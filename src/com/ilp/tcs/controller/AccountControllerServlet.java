package com.ilp.tcs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilp.tcs.bean.Account;
import com.ilp.tcs.service.AccountService;

/**
 * Servlet implementation class AccountControllerServlet
 */
public class AccountControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("searchaccount"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("searchaccount.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("depositamount"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Depositamount.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		int n=0,n1=0;
		Account a=new Account();
		if(action.equals("search"))
		{
			int accountno=Integer.parseInt(request.getParameter("accountno"));
			AccountService s=new AccountService();
			a=s.searchAccount(accountno);
			if(a!=null)
			{
				request.setAttribute("Account",a);
				RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
						rd.forward(request, response);
			}
			
		}
		if(action.equals("deposit"))
		{
			int accountno=Integer.parseInt(request.getParameter("accountno"));
			int deposit=Integer.parseInt(request.getParameter("deposit"));
			AccountService s=new AccountService();
			n=s.update(accountno, deposit);
			a=s.searchAccount(accountno);
			n1=s.status(accountno);
			if(n!=0)
			{
				if(a.getStatus().equals("active"))
				{
					request.setAttribute("deposited", deposit);
				request.setAttribute("Account",a);
				RequestDispatcher rd=request.getRequestDispatcher("display1.jsp");
				rd.forward(request,response);
			}
			}	
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("invalidaccount.jsp");
				rd.forward(request,response);
			}
			if(n1!=0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("invalidstatus.jsp");
				rd.forward(request,response);
			}
			
		}
	}

}
