package com.wipro.bank.service;
import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;
public class BankService {
    public boolean validateData(float principal, int tenure, int age, String gender) {
        try {
            if (principal < 500) {
                throw new BankValidationException();
       }
     if (tenure != 5 && tenure != 10) {
                throw new BankValidationException();
            }
            if (age < 1 || age > 100) {
                throw new BankValidationException();
            }
         if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")) {
                throw new BankValidationException();
       }
           return true;
       } catch (BankValidationException e) { 
        		return false;
        }
    }
    public void calculate(float principal, int tenure, int age, String gender) {
   	 if (validateData(principal, tenure, age, gender)) {
       RDAccount rd = new RDAccount(tenure, principal);
       rd.setInterest(age, gender);
       float interest = rd.calculateInterest();
       System.out.println("Interest = " + interest);
       float deposited = rd.calculateAmountDeposited();
       System.out.println("Amount Deposited = " + deposited);
       float maturity = rd.calculateMaturityAmount(deposited, interest);
       System.out.println("Maturity Amount = " + maturity);
   }}}

