package HW2;

import java.util.Scanner;

public class Languages {

    // Fields
    private String alphabet; // type of alphabet
    private int numberOfLetters;// number of letters in the alphabet


    // Constructors
    public Languages() {
    }

    public Languages(String alphabet, int numberOfLetters) {
        this.alphabet = alphabet;
        this.numberOfLetters = numberOfLetters;
    }


    // Methods

    void printLanguage() {
        System.out.println("This language is using " + alphabet + " alphabet " +" with " + numberOfLetters + " letters in it.");
    }

    void chooseLanguage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type in your name ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "! ");
        System.out.println("Do you want to know how to ask 'What is your name?' in 3 different languages? ");
        System.out.println("Make your choice: S - Spanish, R - Russian, G - German.");

        String chosenLanguage = scan.nextLine();

        switch (chosenLanguage) {
            case "S":
                System.out.println("You chose Spanish : '¿Cuál es su nombre?'");
                break;
            case "R":
                System.out.println("You chose Russian : 'Как вас зовут?'");
                break;
            case "G":
                System.out.println("You chose German : 'Wie heißen Sie?'");
                break;
            default:
                System.out.println("Please, choose language! ");
        }
    }
}
