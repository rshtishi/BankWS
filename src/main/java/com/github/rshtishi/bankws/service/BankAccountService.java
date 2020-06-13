package com.github.rshtishi.bankws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.github.rshtishi.bankws.entity.Transaction;

@WebService
public interface BankAccountService {
	
	@WebMethod
	public List<Transaction> getTrasactions();
	
	@WebMethod
	public List<Transaction> getTrasactionsForClient(@WebParam String client);

}
