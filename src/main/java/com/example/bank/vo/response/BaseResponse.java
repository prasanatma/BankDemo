package com.example.bank.vo.response;

import lombok.Data;

@Data
public class BaseResponse {
	
	Integer status;
	String statusMessage;
	String errorMessage;	
	
}
