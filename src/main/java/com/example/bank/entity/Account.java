package com.example.bank.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="account_data")
@Data
@AllArgsConstructor
public class Account {
	@Id
	@Column(name= "account_id")
	Integer accountId;
	@Column(name= "customer_id")
	Integer customerId;
	@Column(name= "account_type")
	String accountType;
	@Column(name= "balance")
	Double balance;
	@Column(name= "branch_id")
	Integer branchId;
	@Column(name= "ifsc_code")
	String ifscCode;

	
}
