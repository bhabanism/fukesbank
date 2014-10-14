/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fukes.transaction;


import com.fukes.session.validation.SessionValidator;
import com.fukes.account.validation.AccountValidator;
import com.fukes.dataaccess.DataAccess;
import com.fukes.dataaccess.DataQuery;
import com.fukes.dataaccess.QueryConstants;
        
/**
 *
 * @author bmishra
 */
public class FundTransfer {
    
    public boolean transferFund(int fromAccountId, int toAccountId, double amount) {
        boolean status = false;
        
        status = SessionValidator.hasAccountCustomerSession(fromAccountId);
        if(!status) return status;
        
        status = AccountValidator.isAccountActive(fromAccountId);
        if(!status) return status;
        
        status = AccountValidator.isAccountActive(toAccountId);
        if(!status) return status;
        
        DataAccess dataAccess = new DataAccess();  
        DataQuery query = new DataQuery();
        query.put("QUERY", QueryConstants.FUND_TRANSFER);
        query.put("FROM_ACCOUNT_ID", fromAccountId);
        query.put("TO_ACCOUNT_ID", toAccountId);
        query.put("AMOUNT", amount);
        
        status = dataAccess.execute(query);
        
        return status; 
    }
    
}
