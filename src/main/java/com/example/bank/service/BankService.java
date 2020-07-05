package com.example.bank.service;

import com.example.bank.vo.request.CreateAccountRequest;
import com.example.bank.vo.response.CreateAccountResponse;

public interface BankService {

	CreateAccountResponse createAccount(CreateAccountRequest request);

}
