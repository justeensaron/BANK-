package com.wipro.bank.acc;
public class RDAccount extends Account {
    public RDAccount(int tenure, float principal) {
        super(tenure, principal);
    }
    public float calculateAmountDeposited() {
        return principal * tenure * 12;
    }
    public float calculateInterest() {
        int months = tenure * 12; 
        float monthlyRate = rateOfInterest / (12 * 100);
        float maturity = (float) (principal * ((Math.pow(1 + monthlyRate, months) - 1) / monthlyRate) * (1 + monthlyRate));
        return maturity - calculateAmountDeposited();
    }
    public float calculateMaturityAmount(float deposited, float interest) {
        return deposited + interest;
    }
}