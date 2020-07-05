package com.example.bank.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bank.entity.Account;
import com.example.bank.vo.request.CreateAccountRequest;

@Repository
public class AccountDaoImpl implements AccountDao {
	
	 @Autowired
	 EntityManagerFactory entityManager;

	@Override
	public int createAccount(CreateAccountRequest request, SessionFactory session) {
		 
		Account acc = new Account(request.getAccountId(), 
				request.getCustomerId(), 
				request.getAccountType(),
				request.getBalance(),
				request.getBranchId(),
				request.getIfscCode());
		
		 session = entityManager.unwrap(SessionFactory.class);
		
		session.getSessionFactory().getCurrentSession().save(acc);
		
		return 0;
	}

}
