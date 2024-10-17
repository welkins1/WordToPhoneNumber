//
package wordtophonenumber;

import java.util.Scanner;

public class WordToPhoneNumber {

    
    public static void main(String[] args) {
        
        
        
        System.out.println("               _.===========================._\n" +
"            .'`  .-  - __- - - -- --__--- -.  `'.\n" +
"        __ / ,'`     _|--|_________|--|_     `'. \\\n" +
"      /'--| ;    _.'\\ |  '         '  | /'._    ; |\n" +
"     //   | |_.-' .-'.'    -  -- -    '.'-. '-._| |\n" +
"    (\\)   \\\"` _.-` /                     \\ `-._ `\"/\n" +
"    (\\)    `-`    /      .---------.      \\    `-`\n" +
"    (\\)           |      ||1||2||3||      |\n" +
"   (\\)            |      ||4||5||6||      |\n" +
"  (\\)             |      ||7||8||9||      |\n" +
" (\\)           ___|      ||*||0||#||      |\n" +
" (\\)          /.--|      '---------'      |\n" +
"  (\\)        (\\)  |\\_  _  __   _   __  __/|\n" +
" (\\)        (\\)   |                       |\n" +
"(\\)_._._.__(\\)    |                       |\n" +
" (\\\\\\\\jgs\\\\\\)      '.___________________.'\n" +
"  '-'-'-'--'");
        
        System.out.println("\nThis program allows you to translate a word to a standard letter mapping found "
                + "on a telephone.\n");
        
        Scanner input = new Scanner(System.in);
        
        boolean Restart = false;
        
       while   (!Restart) {
        
        System.out.print("\nEnter a word: ");
      String Word = input.next().toUpperCase();
      
      String phoneNumber = "";
      
      
        for (int i = 0; i < Word.length(); i++) {
            char letter =  Word.charAt(i);
            
            if (Character.isLetter(letter)) {
                
                if (letter >= 'A' && letter <= 'C') {
                    phoneNumber +=2;
                } else if (letter >= 'D' && letter <= 'F') {
                    phoneNumber +=3;
                } else if (letter >= 'G' && letter <='I') {
                    phoneNumber +=4;
                } else if (letter >= 'J' && letter <= 'L') {
                    phoneNumber +=5;
                } else if (letter >= 'M' && letter <= 'O') {
                    phoneNumber +=6; 
                } else if (letter >= 'P' && letter <= 'S') {
                    phoneNumber +=7;
                } else if (letter >= 'T' && letter <= 'V') {
                    phoneNumber +=8;
                } else if (letter >= 'W' && letter <= 'Z') {
                    phoneNumber +=9;
                } 
            } else {
                phoneNumber += letter;
                   
                
                
                
                
            }
                
               
             
        }
        
        System.out.println("\nThe phone letter mapping for  \"" + Word + "\"" + " is " + phoneNumber);
       
        
        
           System.out.print("\nWould you like to enter another word? Y/N ");
           String YesNo = input.next();
           
         
           
           while (!YesNo.equalsIgnoreCase("Y") && !YesNo.equalsIgnoreCase("N")) {
               System.out.print("Invalid input, please type Y or N ");
               YesNo = input.next();
           }
           
           if (YesNo.equalsIgnoreCase("N")) {
               System.out.println("\nThanks for using the program! ☺\n");
               Restart = true;
           }
       
    }
    
}
}