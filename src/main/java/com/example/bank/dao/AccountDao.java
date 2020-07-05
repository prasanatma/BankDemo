package com.example.bank.dao;

import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entity.Account;
import com.example.bank.vo.request.CreateAccountRequest;

public interface AccountDao {

	int createAccount(CreateAccountRequest request, SessionFactory session);



}
