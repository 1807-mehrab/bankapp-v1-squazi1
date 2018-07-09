package com.revature.bankapp;
import java.io.*;

public class BankApp implements Serializable{
  private int cent, dollar, accountNumber;
  private String name;

  public BankApp(){
      dollar = 0; cent = 0; accountNumber = 0; name = null;
  }

  public BankApp(int dollar, int cent, int accountNumber, String name){
      this.dollar=dollar; this.cent=cent; this.accountNumber=accountNumber; this.name=name;
  }
  
  public void deposit(int dollar, int cent){
      this.dollar=this.dollar+dollar;
      this.cent=this.cent+cent;

      if(this.cent>100){
          this.dollar++;
      }
      this.cent=(this.cent+cent)%100;
  }
  public int[] getBalance(){
    int[] Balance = {dollar, cent};
    return Balance;
  }

  public boolean withdrawal(int dollar, int cent){
      if((this.dollar<dollar) || (this.dollar==dollar && this.cent<cent))
      {
          return false;
      }
      else{
            this.dollar=this.dollar-dollar;
            if(cent>this.cent){
                this.dollar--;
                this.cent=(this.cent-cent)+100;
            } else{
                this.cent=this.cent-cent;
            }
            return true;
      }
    }

  public void setAccountNumber(int accountNumber){
       this.accountNumber=accountNumber;
  }

  public int getAccountNumber(){
      return accountNumber;
  }
  public void setName(String name){
      this.name=name;
  }

  public String getName(){
     return name;
  }
}