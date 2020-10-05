/*
* Assignment: Project 4
* Description: This is a BankAccount program. It gives the user the option of checking their available balance,
*              depositing funds, withdrawing funds, changing their security answer.
* Name: Damien Hosea
* ID: 921395901
* Class: CSC 210-07
* Semester: Fall 2020
 */

import java.util.Scanner;

public class BankAccount {

    //************************************************************************************
    //The Check Balance Method
    //************************************************************************************
     public static void checkBalance(double balance, String answer, int accountNo){
         Scanner a = new Scanner (System.in);

         System.out.println("What city were you born in? :");
         String city = a.nextLine();

         //This if statement compares strings to see if the answer the user entered matches the existing answer. If it
         // does match then ask for the users account number.
         if (city.equals(answer)){

             System.out.println("What is your account number?: ");
             int accNo = a.nextInt();

             if (accNo == accountNo){
                 System.out.println(balance);
             }
             else {
                 System.out.println( "Wrong ");
             }
         }
         else{
             System.out.println( "Wrong ");
         }
    }

    //************************************************************************************
    //The Deposit Money Method
    //************************************************************************************
    //THis method takes a dollar amount and adds it to the users existing balance.
    //************************************************************************************

    public static double depositMoney(double balance){
        Scanner b = new Scanner(System.in);
        System.out.println("Enter Amount you want to deposit: ");
        double deposit = b.nextDouble();

        return (balance + deposit);
    }

    //************************************************************************************
    //The Withdraw Money Method
    //************************************************************************************
    //This method subtracts an amount (entered by the user) from the users account.
    //************************************************************************************

     public static double withdrawMoney(double balance) {
         Scanner c = new Scanner(System.in);
         System.out.println("How Much Do You Want To Withdraw?: ");
         double amt = c.nextDouble();

         //This while loop will run as long as the dollar amount entered by the user is larger than their
         //existing balance amount.
         while (amt > balance) {
             System.out.println(" INSUFFICIENT FUNDS ");

             System.out.println("How Much Do You Want To Withdraw?: ");
             amt = c.nextDouble();

         }

         return (balance - amt);
     }

     //************************************************************************************
     //The Change Answer to Security Question
     //************************************************************************************
     // This method replaces the existing security answer with a new one from the user.
     //************************************************************************************
     public static String changeAnsOfSecurityQuestion(){
         Scanner d = new Scanner(System.in);

         System.out.println("What City were you born in? ");

         return d.nextLine();
     }

    //************************************************************************************
    //The Main Method
    //************************************************************************************

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //************************************************************************************
        //Variables holding default values
        //************************************************************************************

        double balance = 500;
        String answer = ("SF");
        int accountNo = 1234567890;
        //************************************************************************************

        System.out.println(" WELCOME TO THE BANK OF HOSEA");

        //************************************************************************************
        //An infinite while loop that only ends through the Switch statement
        //************************************************************************************

        while (true) {
            System.out.println("________________________________________");
            System.out.println("Operations");
            System.out.println("1. CHECK BALANCE");
            System.out.println("2. DEPOSIT MONEY");
            System.out.println("3. WITHDRAW MONEY");
            System.out.println("4. CHANGE ANSWER TO SECURITY QUESTION");
            System.out.println("5. EXIT");
            System.out.println("_________________________________________");
            System.out.println("ENTER YOUR CHOICE: ");

            int menuChoice = input.nextInt();

            if (menuChoice < 1 || menuChoice > 5) {
                System.out.println("NUMBERS 1 THROUGH 5 ONLY ACCEPTABLE");
            }

            //************************************************************************************
            //A Switch statement displaying a list of operations
            //************************************************************************************
            switch (menuChoice) {
                case 1:
                    //Method call for Check Balance
                    checkBalance(balance,answer,accountNo);
                    break;
                case 2:
                    //Method call for Deposit Money
                   balance = depositMoney(balance);

                    break;
                case 3:
                    //Method call for Withdraw Money
                 balance  =  withdrawMoney(balance);
                    break;
                case 4:
                    //Method call for Change Security Password
                    answer = changeAnsOfSecurityQuestion();
                    break;
                case 5:
                    // Case for Exit
                    System.out.println("THANK YOU FOR USING BANK OF HOSEA, GOODBYE!");
                    System.exit(1);
                    break;

            }
        }
    }
}







