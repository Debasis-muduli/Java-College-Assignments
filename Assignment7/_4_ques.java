/*Write a java program to read two numbers x and y and calculate x/(x-y). The 
program should check the value of x-y. Before dividing with x, it should throw an 
exception if x-y is zero. In the exception handler the program should display 
appropriate message to the user. */

import java.util.*;
public class _4_ques {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the value of x and y: ");
    double x=sc.nextDouble();
    double y=sc.nextDouble();
    try{
      if(x-y==0){
        throw new ArithmeticException("x-y should be non zero");
      }
      System.out.println("The value is: "+(x/(x-y)));
    }
    catch(Exception ob){
      System.out.println(ob);
    }
  }
}