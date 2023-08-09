/*Purpose: Creating a calculator 
   version: 1.0
   date: 1/14/23
   author: Justin Lee
*/

import java.util.Scanner;

public class JleeCalculator {
   public static void main(String[] args){
      //creating variable for the 2 numbers to enter
      int num1;
      int num2;
      int result;
      
      //creating scanner
      Scanner scan = new Scanner(System.in);
      
      //getting the numbers and operators
      System.out.println("Enter the first number (only whole numbers): ");
      num1 = scan.nextInt();
      System.out.println("Enter the second number: ");
      num2 = scan.nextInt();
      System.out.println("Would you like to add, subtract, multiply or divide(enter the operator symbol +, -, *, /)");
      char operator = scan.next().charAt(0);

      //mathematical calculation and display
      switch (operator) {
           case '+':
               result = num1 + num2;
               System.out.println(num1 + "+" + num2 + "= " + result);
               break;
           case '-':
               result = num1 - num2;
               System.out.println(num1 + "-" + num2 + "= " + result);
               break;
           case '*':
               result = num1 * num2;
               System.out.println(num1 + "*" + num2 + "= " + result);
               break;
           case '/':
               result = num1 / num2;
               System.out.println(num1 + "/" + num2 + "= " + result);
               break;
           default:
               System.out.printf("You have entered an invalid operator");
               return;
       }
   }//end of main
   
}//end of class