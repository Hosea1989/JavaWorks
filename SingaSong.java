/*
 * Assignment: Project 4
 * Description: This is a BankAccount program. It gives the user the option of checking their available balance,
 *              depositing funds, withdrawing funds, changing their security answer.
 * Name: Damien Hosea
 * ID: 921395901
 * Class: CSC 210-07
 * Semester: Fall 2020
 */

public class SingaSong {

    //This is the Animal and Sound Method that accepts 2 string parameters.
    public static void AnimalandSound(String animal, String animalSounds){
        System.out.println("Old MacDonald had a farm ");
        System.out.println("Ee i ee i o");
        System.out.println("And on his farm he had some " + animal);
        System.out.println("Ee i ee i oh");
        System.out.println("With a " + animalSounds + "-" + animalSounds + " here");
        System.out.println("And a " + animalSounds + "-" + animalSounds + " there");
        System.out.println("Here a " + animalSounds + " there a " + animalSounds);
        System.out.println("Everywhere a " + animalSounds + "-" + animalSounds);

    }

    //Main method
    public static void main(String[] args) {
        //Variables that hold the Animal Names
        String cow = ("Cows");
        String chick = ("Chicks");
        String pig = ("Pigs");

        //Variables that hold the Animal Sounds
        String cowSound = ("Moo");
        String chickSound = ("Cluck");
        String pigSound = ("Oink");

        //Calling the method and passing Animal name and Sounds to it.
        AnimalandSound(cow, cowSound);
        AnimalandSound(chick,chickSound);
        AnimalandSound(pig,pigSound);

    }
}
