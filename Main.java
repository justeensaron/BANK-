package com.wipro.bank.main;
import java.util.Scanner;
import com.wipro.bank.service.BankService;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Tenure Period (5 or 10): ");
    	int tenure = sc.nextInt();
    	System.out.print("Enter Principal Amount (minimum 500): ");
        float principal = sc.nextFloat();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender (Male/Female): ");
        String gender = sc.nextLine();
        BankService bs = new BankService();
        bs.validateData(principal, tenure, age, gender);
        bs.calculate(principal, tenure, age, gender);
        sc.close();
    }
}