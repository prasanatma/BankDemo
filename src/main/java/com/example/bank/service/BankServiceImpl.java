package com.example.bank.service;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.bank.dao.AccountDao;
import com.example.bank.entity.Account;
import com.example.bank.vo.request.CreateAccountRequest;
import com.example.bank.vo.response.CreateAccountResponse;

@Service
public class BankServiceImpl implements BankService{
	
	@Autowired
	AccountDao dao;
	
	@Autowired
	SessionFactory session;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public CreateAccountResponse createAccount(CreateAccountRequest request) {
		
		int i =  dao.createAccount(request,session);
		
		 return new CreateAccountResponse(request.getAccountId(),
				 request.getCustomerId(),
				 request.getBalance());
	}

}
