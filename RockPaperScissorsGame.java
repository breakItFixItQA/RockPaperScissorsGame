package day5;

import java.awt.Choice;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Rock, Paper, Scissors, Game!");
		
		//User input
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0: Rock, 1: Paper, 2: Scissors");
		int userChoice = scanner.nextInt();
		
		// Validate input
		
		if(userChoice<0 || userChoice>2)     // || equals or
		{
			System.out.println("Invalid Choice.class. Please run the program again and enter 0, 1 or 2.");
			return; // return equals exit the program if there is an invalid choice
		}

		//Computer random choice
		
		int computerChoice = (int) (Math.random()*3);
		System.out.println(computerChoice);
		
		// Determine the winner
		
		if (userChoice==computerChoice)
		{
			System.out.println("It's at tie!");
		}
		
		else if ((userChoice==0 && computerChoice == 2) ||
		        (userChoice==1 && computerChoice == 0) ||
		        (userChoice==2 && computerChoice == 1))
		{
			System.out.println("You win! - congratulations!");
		}
		else
		{
			System.out.println("Computer wins!");
		}
			
		 scanner.close();      
	}

}
