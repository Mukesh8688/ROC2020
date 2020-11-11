package com.bankapplication.dao;

import java.util.List;


import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.RegisterModel;
import com.bankapplication.model.account.BankAccountRegister;
import com.bankapplication.model.customer.CustomerInfo;

public interface BankServicesDAOInterface {
	
	
	public int registerUsername(String username,String password,String email) throws BusinessException;
	
	public List<RegisterModel> getUserRegisterDetail(String username,String password) throws BusinessException;
	
	public int getUserType(String username) throws BusinessException;
	
	public boolean isVerifyExistUsername(String username,String email) throws BusinessException;
	
	public int createCustomerProfile(CustomerInfo customerInfo) throws BusinessException;
	
	public int createCustomerProfile(CustomerInfo customerInfo,int userId) throws BusinessException;
	
	public int createBankAccount(BankAccountRegister bankAccountRegister, int customerId) throws BusinessException;
	
	public BankAccountRegister updateBankAccount(int accountNumber, double enteredAmount, int transactionType) throws BusinessException;
	
	public void updateBankAccOnly(int accountNumber, double enteredAmount, int transactionType) throws BusinessException;
	 
	public int createTransaction(int transactionType ,double amount,int accountNumber) throws BusinessException;
	
	public int insertTranactionata(int transType,double amount, int accountNumber) throws BusinessException;
	
	public int getUserId(String username) throws BusinessException;
	
	public int getCustomerId(int userId) throws BusinessException;
	
	public double getAccountBalance(int accountNumber) throws BusinessException;
	
	public BankAccountRegister getAllAccDetailsByAccountNumber(int accountNumber) throws BusinessException;
	
	public List<BankAccountRegister> getAllAccDetailsListByAccountNumber(int accountNumber) throws BusinessException;
	
	public List<BankAccountRegister> getAllAccountBalanceByUserId(int customerId) throws BusinessException;
	
	
	public List<BankAccountRegister> getAllAccountByCustomerIdandAccountTYpe(int customerId,int accountType) throws BusinessException;
	
	public BankAccountRegister transferAmount(int sendingAccountNumber,int receivingAccountNumber, double transferAmount) throws BusinessException;
	
	
	
	


	

}