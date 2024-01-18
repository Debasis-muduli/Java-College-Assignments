/*Write an exception handling java program to print the index position of an existing interger array. The index value will be entered by user. It will be handled by exception handler if index position is greated then the size of array. In the exception handler the program should display appropriate message to the user. */

import java.util.*;
public class _3_ques {
  public static void main(String[] args) {
    int ar[]={1,2,3,4,5};
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the index position: ");
    int i=sc.nextInt();
    try{
      int value=ar[i];
      System.out.println("value at entered index: "+value);
    }
    catch(ArrayIndexOutOfBoundsException ob){
      System.out.println("Please enter a valid index position within the array size.");
    }

  }
}