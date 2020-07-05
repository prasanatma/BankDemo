package com.example.bank.vo.request;

import lombok.Data;

@Data
public class CreateAccountRequest {
	
	
	Integer accountId;
	Integer customerId;
	String accountType;
	Double balance;
	Integer branchId;
	String ifscCode;


}
