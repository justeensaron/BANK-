package com.wipro.bank.acc;
public class RDAccount extends Account {
    public RDAccount(int tenure, float principal) {
        super(tenure, principal);
    }
    @Override
    public float calculateAmountDeposited() {
        return principal * tenure;
    }
    @Override
    public float calculateInterest() {
        float r = rateOfInterest / 100.0f;
        int n = 12;
        float t = tenure / 12.0f;
        return (float)(principal * (Math.pow((1 + r / n), n * t) - 1));
    }
}