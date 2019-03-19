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

import java.util.Scanner;
//import java.io.*;

public class WordGames {
	
	public static Scanner sc = new Scanner(System.in);
	public static String anotherGame = "";
	public static String subString = "";
	
	
	// Declare a constant for dictionary.txt file
	public static final String DICTIONARY = "dictionary.txt"; 


	// Method for Selection Menu 
	public static void getSelection() {
		
		// Declare variable for program selection.
		int userSelection = 0;
		
		// Create a new Scanner object
		
		// Print menu selection
		System.out.println("Welcome to the Word Games program menu.");
		System.out.println("Select from one of the following options.");
		System.out.println("1. Substring problem.");
		System.out.println("2. Points problem.");
		System.out.println("3. Palindrome problem.");
		System.out.println("4. Exit.");
		System.out.println("Enter your selection: ");
		
		userSelection = sc.nextInt();
//		System.out.println("Your selection was: " + userSelection);
		
		switch(userSelection) {
		case 1:
			substringProblem();
			break;
		case 2: 
			pointsProblem();
			break;
		case 3:
			palindromeProblem();
			break;
		case 4:
			System.out.println("EXIT");
		default:
			System.out.println("Incorrect Input");
			break;
		}
	}
	
	public static void substringProblem() {
		System.out.println("SUBSTRING PROBLEM");
		System.out.println("Enter a substring: ");
		subString = sc.next();
		
		// Read each word and check if is prefix, infix , suffix or not found
		//...
		// A switch statement that analyses:
		// Prefix at index 0
		// Infix at index 1 - word.length() - 1;
		// Suffix at index word.length
		// If suffix doesn't match anything then - not found
		// Print word out with out come
		// NOTE watch out for double ups e.g. tattarrattat as a infix multiple
		// times. Avoid this by setting the reading the index and setting to see if the
		// infix state is 'true'
		
		System.out.println("Do you wish to select another game? (y/n)");
		anotherGame = sc.next();
		
		if (anotherGame.equals("y")) {
			getSelection();
			System.out.println();
		}

	}
	
	public static void pointsProblem() {
		System.out.println("POINTS PROBLEM");

		// Declare selected word variables.
		String selectedWord;
		int wordScore = 0;
		
		// Read word and assign it to a variable in order to evaluate each letters point value.
		selectedWord = sc.next();
		char[] wordArr = selectedWord.toCharArray();
		
		// Determine how much each letter is worth.
		for (int i=0;i<wordArr.length;i++) {
			
			// 1 Point Letters
			if(wordArr[i] == 'a'|| wordArr[i] == 'e' || wordArr[i] == 'i'){
				wordScore++;
			}
			else if (wordArr[i] == 'l'|| wordArr[i] == 'n' || wordArr[i] == 'o') {
				wordScore++;
			} 
			else if (wordArr[i] == 'r'|| wordArr[i] == 's' || wordArr[i] == 't') {
				wordScore++;
			}
			else if (wordArr[i] == 'u') {
				wordScore++;
			}
			// 2 Point Letters
			else if (wordArr[i] == 'd'|| wordArr[i] == 'g') {
				wordScore += 2;
			}
			// 3 Point Letters
			else if (wordArr[i] == 'b'|| wordArr[i] == 'c') {
				wordScore += 3;
			}
			else if (wordArr[i] == 'm'|| wordArr[i] == 'p') {
				wordScore += 3;
			}
			// 4 Point Letters
			else if (wordArr[i] == 'f'|| wordArr[i] == 'h') {
				wordScore += 4;
			}
			else if (wordArr[i] == 'v'|| wordArr[i] == 'w' || wordArr[i] == 'y') {
				wordScore += 4;
			}
			//5  Point Letters
			else if (wordArr[i] == 'k') {
				wordScore += 5;
			}
			// 8 Point Letters
			else if (wordArr[i] == 'j' || wordArr[i] == 'x') {
				wordScore += 8;
			}
			// 10 Point Letters
			else if (wordArr[i] == 'q' || wordArr[i] == 'z') {
				wordScore += 10;
			}
			
		}
		
		// Print final word score
		System.out.println("Your entered word was: " + selectedWord);
		System.out.println("Score: " + wordScore);
		System.out.println();
		
		//System.out.println(wordArr.length);
		System.out.println("Do you wish to select another game? (y/n)");
		anotherGame = sc.next();
		
		if (anotherGame.equals("y")) {
			getSelection();
		}
	}
	
	public static void palindromeProblem() {
		System.out.println("PALINDROME PROBLEM");
		System.out.println("Do you wish to select another game? (y/n)");
		anotherGame = sc.next();
		
		if (anotherGame.equals("y")) {
			getSelection();
		}
	}

	// Represents the game method runner.
	public static void main(String[] args) {
		
		getSelection();
//		pointsProblem();

	}

}
