
import java.util.Scanner;

public class DrivingExamEvaluator {
    public static void main(String[] args) {

        //Creating a scanner to allow the user to input data.
        Scanner input = new Scanner(System.in);

        //A nice little introduction to the program. ^_^
        System.out.println("Welcome the SFSU Driving Exam Evaluator!");
        System.out.println("Please Enter Your Name: ");
        String userName = input.nextLine();



        int charLimit = 70; // This variables holds the limit of characters allowed in the user's name

        //***This if statement validates to see if the users name is within the limit.
        if (userName.length() > charLimit){

            //This if statement will check if the username is long than the character limit.
            System.out.println("There's no way your name can be: " + userName);
            System.out.println("I will set your name to 'Default Name' ");
            userName = "Default Name";
        }

        System.out.println("Hello there, " + userName + "!");

        //This is where the first (Written) score will be entered.
        System.out.println( "Please Enter the Written Exam Score: ");
        int writtenScore = input.nextInt();

       //**********This if statement will validate the users input for writtenScore.*****
        if (writtenScore < 0){
            System.out.println("I'm sorry, I don't accept numbers less than 0");
            System.out.println("Defaulting the Written Exam Score to 0 ");
            writtenScore = 0;
        }
        else if (writtenScore > 650){
            System.out.println("Whoa! The Score Only Goes Up to 650");
            System.out.println("Defaulting the Written Exam Score to 650");
            writtenScore = 650;
        }
        else{
            System.out.println("You Entered: " + writtenScore);
        }
        //******************************************************************************


        //This is where the second (Practical) score will be entered.
        System.out.println("Enter the Practical Exam Score: ");
        int practicalScore = input.nextInt();

        //*****This if statement will validate the users input for Written Exam Scores ****
        if (practicalScore < 0){
            System.out.println("I'm sorry, I don't accept numbers less than 0");
            System.out.println("Defaulting the Written Exam Score to 0");
            practicalScore = 0;
        }
        else if (practicalScore > 650){
            System.out.println("Whoa! The Score Only Goes Up to 650");
            System.out.println("Defaulting the Written Exam Score to 650");
            practicalScore = 650;
        }
        else {
            System.out.println("You entered " + practicalScore);
        }
        //******************************************************************************


        //** Variables to Determine the Results **
        double x = (56*(writtenScore/650.0)); // This equation helps determine the users percentage.
        double y = (44*(practicalScore/650.0));
        double z = (x+y);
        double percentDesignator = 52.0; //This percentage determines if the user is a loser or not.

        //*****************************THE RESULTS SECTION**********************************
        System.out.println("********************************************* ");
        System.out.println("*********  DRIVING EXAM RESULTS  ************ ");
        System.out.println("********************************************* ");
        System.out.println(" ");
        System.out.println("*********************************************");
        System.out.println("************* USERNAME: " + userName + " ************** ");
        System.out.print  ("*******  WRITTEN EXAM PERCENTAGE: " + (int) ((x * 100) / 100.00));
        System.out.println("% ******* ");
        System.out.print  ("******* PRACTICAL EXAM PERCENTAGE: " + (int) ((y * 100) / 100.0));
        System.out.println("% ****** ");
        //***********************************************************************************


        //This if statement will determine if the user passed or not.
        if ( z < percentDesignator){
            System.out.println("*** SORRY, YOU DIDN'T MEET THE TARGET PERCENTAGE REQUIRED TO PASS *** ");
            System.out.println("*** PLEASE HEAD TO THE FRONT DESK FOR FURTHER INSTRUCTIONS ***");
        }
        else if ( z >= percentDesignator){
            System.out.println(" ");
            System.out.println("*********************************************");
            System.out.println("*********** !!! CONGRATULATIONS !!! *********");
            System.out.println("*********************************************");
            System.out.println(" ");

            System.out.println(" *** YOU MEET THE REQUIREMENTS TO DRIVE IN THE STATE OF CALIFORNIA *** ");
            System.out.println(" *** HEAD TO THE FRONT DESK FOR FURTHER INSTRUCTIONS *** ");
        }

    }

}
