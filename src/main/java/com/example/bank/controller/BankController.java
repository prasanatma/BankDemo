package com.example.bank.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bank.service.BankService;
import com.example.bank.vo.request.CreateAccountRequest;
import com.example.bank.vo.response.CreateAccountResponse;

@Controller
public class BankController {
	
	@Autowired
	BankService service;
	
	
	@RequestMapping(value= "/api/create/account",method = RequestMethod.POST)
	@ResponseBody
	public CreateAccountResponse createAccount(@RequestBody CreateAccountRequest request) {
		CreateAccountResponse response= new CreateAccountResponse();
		response = service.createAccount(request);
		if (!Objects.isNull(response)) {
		response.setStatus(200);
		response.setStatusMessage("AccountCreated Successfully");
		}else {
			response.setStatus(400);
			response.setStatusMessage("Account Not Created");
		}
		return response;
		
		
	}

}
