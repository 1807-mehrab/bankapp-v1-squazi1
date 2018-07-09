package com.revature.bankapp;

public class Main extends BankApp{
    public static void main(String[] args){
         BankApp bApp = new BankApp();
         bApp.getBalance();
         bApp.getAccountNumber();
         bApp.getName();

         System.out.println("The balance account is: " + bApp.getBalance() + " The account number is: " + 
         bApp.getAccountNumber() + " The name is: " + bApp.getName());
    }
}