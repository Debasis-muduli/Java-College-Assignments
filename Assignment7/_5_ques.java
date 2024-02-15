/*Write a java program to create your own exception which creates insufficient fund 
exception whenever an account holder in the bank wants to withdraw money 
greater than that he has in his account? */

import java.util.*;
public class _5_ques {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
      System.out.println("Enter amount you want to with draw: ");
      double amount=sc.nextDouble();
      if(amount>20000){
        throw new FundException("You have 20k rupees in your account.");
      }
      else{
        System.out.println("You have withdrawn your amount.");
      }
    }catch(FundException ob){
      System.out.println(ob);
    }
  }
}
class FundException extends Exception{
  FundException(String st){
    super(st);
  }
}