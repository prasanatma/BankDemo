package com.example.bank.vo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountResponse extends BaseResponse {
	
	Integer accountId;
	Integer customerId;
	Double balance;
	

}
