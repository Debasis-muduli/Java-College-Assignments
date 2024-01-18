/*Write an exception handling java program to read two numbers n1,n2 and calculate and print the result of n1/n2. If n2 is Zero (0) then it will be handled by exception handler and again ask the value of n2. In the exception handler the program should display appropriate message to the user. */

import java.util.*;
public class _2_ques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num(n1): ");
        double n1=sc.nextDouble();
        double n2;
        while(true){
            try{
            System.out.println("Enter the Second num(n2): ");
            n2=sc.nextDouble();
            if(n2==0){
                throw new ArithmeticException("Cannot divide by zero.Please enter a non-zero value.");
            }
            double result=n1/n2;
            System.out.println("Resutl is :"+result);
            break;
            }
            catch(ArithmeticException ob){
                System.out.println(ob);
            }
        }

    }
}

