import java.util.Scanner;

public class MyOwnIdea {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter Your Name: ");
        String userName = input.nextLine();

        System.out.println("You find yourself inside of a giant Pyramid...");
        System.out.println("A Dark Sphinx appears before you...");
        System.out.println(" ");
        System.out.println("What will you do? ");
        System.out.println(" ");
        System.out.println("1. Attack, 2. Run!");

        int userInput = input.nextInt();

        int atkOption = 1;
        int runAway = 2;

        if (userInput == runAway){
            System.out.println( "Got away safely!");
            System.exit(1);
        }

        int monsterHP = 0;

        if (userInput == atkOption){

            int userHits = (int) (Math.random()* 4 +1);

            int diceRoll = (int)(Math.random()* 6 + 1 );

            if(diceRoll == 1){
                System.out.println("POKE POKE!!!");
                System.out.println( userName + " hit the monster for 1 Damage");
                int poke = 1;
                System.out.println("The monster has " + (monsterHP + poke));
            }
            else if (diceRoll == 2){
                System.out.println("Slash!");
                int slash1 = 50;
                System.out.println("The monster has " + (monsterHP + slash1));
            }
            else if (diceRoll == 3){
                System.out.println("Slash!");
                int slash2 = 50;
                System.out.println("The monster has " + (monsterHP + slash2));
            }
            else if (diceRoll == 4){
                System.out.println("Slash!");
                int slash3 = 50;
                System.out.println("The monster has " + (monsterHP + slash3));
            }
            else if (diceRoll == 5){
                System.out.println("Slash!");
                int slash4 = 50;
                System.out.println("The monster has " + (monsterHP + slash4));
            }
            else if (diceRoll == 6){
                System.out.println(" POKE POKE!!");
                int poke = 1;
                System.out.println("The monster has " + (monsterHP + poke));
            }

        }

        int monsterHits = (int) (Math.random()* 4 +1);
        int counterB = 0;
        int userHP = 0;

        while (counterB < monsterHits){

            int diceRoll = (int)(Math.random()* 6 + 1 );

            if (diceRoll == 1){
                System.out.println(" Fire ");
                int fireDamage = 100;
                System.out.println(userName + " just lost " + fireDamage + "HP");
                System.out.println(userName + " has " + (userHP - fireDamage) + " HP left");
            }
            else if(diceRoll == 2) {
                System.out.println(" Ice ");
                int iceDamage = 70;
                System.out.println(userName + " just lost " + iceDamage + "HP");
                System.out.println(userName + " has " + (userHP - iceDamage) + " HP left");
            }
            else if(diceRoll == 3) {
                System.out.println(" Lightning ");
                int lightningDamage = 80;
                System.out.println(userName + " just lost " + lightningDamage + "HP");
                System.out.println(userName + " has " + (userHP - lightningDamage) + " HP left");
            }
            else if(diceRoll == 4){
                System.out.println(" Psychic ");
                int psychicDamage = 80;
                System.out.println(userName + " just lost " + psychicDamage + "HP");
                System.out.println(userName + " has " + (userHP - psychicDamage) + " HP left");
            }
            else if (diceRoll == 5){
                System.out.println(" Bolder Throw ");
                int bolderDamage = 90;
                System.out.println(userName + " just lost " + bolderDamage + "HP");
                System.out.println(userName + " has " + (userHP - bolderDamage) + " HP left");
            }
            else if (diceRoll == 6){
                System.out.println(" Bite ");
                int biteDamage = 100;
                System.out.println(userName + " just lost " + biteDamage + "HP");
                System.out.println(userName + " has " + (userHP - biteDamage) + " HP left");
            }


            counterB ++;
        }


    }
}
