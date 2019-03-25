/* Word Games Java Program
 * Author: Zaadie Fourie
 *  (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)
   / ._. \      / ._. \      / ._. \      / ._. \      / ._. \      / ._. \
 __\( Y )/__  __\( Y )/__  __\( Y )/__  __\( Y )/__  __\( Y )/__  __\( Y )/__
(_.-/'-'\-._)(_.-/'-'\-._)(_.-/'-'\-._)(_.-/'-'\-._)(_.-/'-'\-._)(_.-/'-'\-._)
   || M ||      || O ||      || N ||      || K ||      || E ||      || Y ||
 _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._
(.-./`-'\.-.)(.-./`-'\.-.)(.-./`-'\.-.)(.-./`-'\.-.)(.-./`-'\.-.)(.-./`-'\.-.)
 `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Word_Games  {
	// The name of the file to open.
    public static String fileName = "dictionary";

    // This will reference one line at a time
    public static String line = null;
    
	// Create a new Scanner object
    public static Scanner sc = new Scanner(System.in);

    
    // Method for Selection Menu 
 	public static void getSelection() {
 		
 		// Declare variable for program selection.
 		String userSelection = "";
 		
 		System.out.printf("%n");
 		System.out.printf("%n");

 		// Print menu selection
 		System.out.println("Welcome to the Word Games program menu.");
 		System.out.println("Select from one of the following options.");
 		System.out.println("1. Substring problem.");
 		System.out.println("2. Points problem.");
 		System.out.println("3. Palindrome problem.");
 		System.out.println("4. Exit.");
 		System.out.print("Enter your selection: ");
 		
 		userSelection = sc.nextLine();
 		
 		switch(userSelection) {
 		case "1":
 			substringProblem();
 			break;
 		case "2": 
 			pointsProblem();
 			break;
 		case "3":
 			palindromeProblem();
 			break;
 		case "4":
 			System.out.println();
 			System.out.println("Goodbye!");
 			break;
 		default:
 			System.out.println();
 			System.out.println("Invalid option. Try again.");
 			getSelection();
 			break;
 		}
 	}
 	
 	// PROBLEM 1
 	public static void substringProblem() {
 		System.out.println();
 		System.out.println("Substring problem.");
 		
 		// Ask for users substring
 		System.out.print("Enter a substring: ");
 		String subString = sc.nextLine();
 		String s = "";
 		if(subString.length() > 0) {
 			s = subString.substring(0, 1);
 		}
 		
 		
 		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            if(s.length() > 0) {
                while((line = bufferedReader.readLine()) != null) {
                	
            		ArrayList<String> result = new ArrayList<>(Arrays.asList(line));
            		
            		if (line.startsWith(s)) {
            			result.add("prefix");
            		}
            		
            		String charInbetween = line.substring(1, line.length()); 
            		if (charInbetween.indexOf(s, 0) != -1) {
            			result.add("infix");
            		}
            		
            		if (line.endsWith(s)) {
            			result.add("suffix");
            		} 
         		
            		if (result.size() == 1) {
            			 result.add("not found");
            		}
            		
            		System.out.println(String.join(" - ", result));   
            }   
           }
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or:
            // ex.printStackTrace();
        }
 		getSelection();
 	}
 		
 	
 	// PROBLEM 2
 	public static void pointsProblem() {
 		System.out.println();
 		System.out.println("Points problem.");
 	    try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {		
            		characterPoints();
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or:
            // ex.printStackTrace();
        }
 	   getSelection();
 	}
 	

 	public static void characterPoints()
 	{
 		char[] wordArr =line.toCharArray();
		int score = 0;
		
		// Loop through array and print out each char and it's position.
		for (int i = 0; i < wordArr.length; i++) {
			
			// Declare letter and save to a variable.
			char letter = wordArr[i];
			
			// Set the score by adding the value of each character.
			score+=getValueLetter(letter);
		}
		
		if (score < 2) {
			System.out.printf("%s is worth %d point. %n", line, score);
		}
		else {
			System.out.printf("%s is worth %d points. %n", line, score);
		}
 		
 	}
 	
 // PROBLEM 3
 	public static void palindromeProblem(){	
 		System.out.println();
 		System.out.println("Palindrome problem.");
 	    try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {		
            		palindromeCheck();
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
 	   getSelection();
 	}
 	
 	public static int getValueLetter(char letter){
        switch (letter){
            case 'g':
            case 'd': return 2;

            case 'b':
            case 'c':
            case 'm':
            case 'p': return 3;

            case 'f':
            case 'h':
            case 'v':
            case 'w':
            case 'y': return 4;

            case 'k': return 5;

            case 'j':
            case 'x': return 8;

            case 'q':
            case 'z': return 10;

            default: return 1;
        }
 	}
 	
 	public static void palindromeCheck() {
 		String reverse = "";
		String original = line;
		
		int length = original.length();
		
		for(int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		if (original.equals(reverse)) {
			System.out.printf("%s is a palindrome.%n", line);
		}
		else {
			System.out.printf("%s is not a palindrome.%n", line);
		}
 	}
 	
    public static void main(String [] args) {
    		 getSelection();
    }
}