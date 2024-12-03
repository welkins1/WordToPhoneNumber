//Programmer Name: Austin
//GitHub Username: welkins1

//Import for Scanner
import java.util.Scanner;

public class WordToPhoneNumber {

    public static void main(String[] args) {

        //ASCII art by Joan Stark via www.asciiart.eu/
        System.out.println("               _.===========================._\n"
                + "            .'`  .-  - __- - - -- --__--- -.  `'.\n"
                + "        __ / ,'`     _|--|_________|--|_     `'. \\\n"
                + "      /'--| ;    _.'\\ |  '         '  | /'._    ; |\n"
                + "     //   | |_.-' .-'.'    -  -- -    '.'-. '-._| |\n"
                + "    (\\)   \\\"` _.-` /                     \\ `-._ `\"/\n"
                + "    (\\)    `-`    /      .---------.      \\    `-`\n"
                + "    (\\)           |      ||1||2||3||      |\n"
                + "   (\\)            |      ||4||5||6||      |\n"
                + "  (\\)             |      ||7||8||9||      |\n"
                + " (\\)           ___|      ||*||0||#||      |\n"
                + " (\\)          /.--|      '---------'      |\n"
                + "  (\\)        (\\)  |\\_  _  __   _   __  __/|\n"
                + " (\\)        (\\)   |                       |\n"
                + "(\\)_._._.__(\\)    |                       |\n"
                + " (\\\\\\\\jgs\\\\\\)      '.___________________.'\n"
                + "  '-'-'-'--'");

        //Program info
        System.out.println("\nThis program allows you to translate a word to a standard letter mapping found "
                + "on a telephone.\n");

        //Creates scanner object
        Scanner input = new Scanner(System.in);

        //Declaring the boolean variable used for restarting the program
        boolean Restart = false;

        //While loop used for restarting the program at this point
        while (!Restart) {

            //Word prompt statement
            System.out.print("\nEnter a word: ");

            /* Input is converted to UpperCase to be less precise for 
           a later nested-if statement */
            String Word = input.next().toUpperCase();

            //This is the string that is going to be displayed as the translated result              
            String phoneNumber = "";

//For-loop used for reading each character based on the length of the word
            for (int i = 0; i < Word.length(); i++) {
                char letter = Word.charAt(i);
//CharAt is cycled thorugh each char of the string based on i

//If statement used for translating each char from the word to a number
                if (Character.isLetter(letter)) {

                    //Middle letter of each set of letters can be skipped
                    if (letter >= 'A' && letter <= 'C') {
                        phoneNumber += 2;
                    } else if (letter >= 'D' && letter <= 'F') {
                        phoneNumber += 3;
                    } else if (letter >= 'G' && letter <= 'I') {
                        phoneNumber += 4;
                    } else if (letter >= 'J' && letter <= 'L') {
                        phoneNumber += 5;
                    } else if (letter >= 'M' && letter <= 'O') {
                        phoneNumber += 6;
                    } else if (letter >= 'P' && letter <= 'S') {
                        phoneNumber += 7;
                    } else if (letter >= 'T' && letter <= 'V') {
                        phoneNumber += 8;
                    } else if (letter >= 'W' && letter <= 'Z') {
                        phoneNumber += 9;
                    }
                } else {

                    //If a non-word is inputted, it is displayed normally and isn't translated
                    phoneNumber += letter;

                }

            }

            //Sout used to simulate loading 
            System.out.print("\nTranslating");

            //Loading simulation lopop
            for (int i = 0; i < 5; i++) {

                //The try-catch is required to use Thread.sleep
                try {
                    //Loading time in miliseconds
                    Thread.sleep(500);
                    //printed to the console based on i < 5
                    System.out.print(".");

                } catch (InterruptedException error) {

                }

            }
            //Spacer
            System.out.println("");

            //Result statement
            System.out.println("\nThe phone letter mapping for  \"" + Word + "\"" + " is " + phoneNumber);

            //Re-do input statement
            System.out.print("\nWould you like to enter another word? Y/N ");

            //Declaring YesNo for restart/re-do program input
            String YesNo = input.next();

            //While statement used for invalid input within YesNo input 
            while (!YesNo.equalsIgnoreCase("Y") && !YesNo.equalsIgnoreCase("N")) {
                System.out.print("Invalid input, please type Y or N ");
                YesNo = input.next();
            }

            //If N is entered into input, while loop Restart is set to true and doesn't loop
            if (YesNo.equalsIgnoreCase("N")) {
                System.out.println("\nThanks for using the program! ☺\n");
                Restart = true;
            }

        }

    }
}
