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

public class WordGames {
	
	public static Scanner sc = new Scanner(System.in);
	public static String anotherGame = "";

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
//		System.out.println("Your selcetion was: " + userSelection);
		
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
		System.out.println("Do you wish to select another game? (y/n)");
		anotherGame = sc.next();
		
		if (anotherGame.equals("y")) {
			getSelection();
			System.out.println();
		}

	}
	
	public static void pointsProblem() {
		System.out.println("POINTS PROBLEM");
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
		
		
	
	}

}
