
import java.util.Scanner;

public class HMWK1_FortuneTeller {

	public static void main(String[] args) {
		// Fortune Teller Homework

		Scanner input = new Scanner(System.in);

		// FIRST NAME INPUT
		System.out.println("Enter your first name, please."); // prompts user to enter first name
		String firstName = input.nextLine(); // the user will enter their first name\
	

		// LAST NAME INPUT
		System.out.println("\nNow your last name."); // prompts user to enter last name
		String lastName = input.nextLine(); // the user will enter their last name

		// AGE INPUT
		System.out.println("\nHow old are you?"); // prompts user to enter age
		int age = input.nextInt(); // the user will enter age

		// BIRTHMONTH INPUT
		System.out.println("\nWhat month were you born in? (Ex: If it's March, put the number 3.)"); // prompts user to enter their birthmonth
		int month = input.nextInt(); // the integer of the month

		// NUMBER OF SIBLINGS INPUT
		System.out.println("\nHow many siblings do you have?"); // prompts user to enter the number of siblings they have
		int siblings = input.nextInt(); // the integer of the siblings

		//FAVORITE COLOR INPUT
		System.out.println("\nWhat is your favorite ROYGBIV color? Type \"help\" to list the color options.");
		String colorOption = input.nextLine();
		do {
  			System.out.println("Type \"help\" to list options. ");
  			colorOption = input.nextLine();
  			if(colorOption.equals("help")) {
   			 System.out.println("Color Options (ROYGBIV): Red, Orange, Yellow, Green, Blue, Indigo or Violet.");
  			} 
			} while(colorOption.equals("help"));
			input.close();

		System.out.println("\nHello, " + firstName + " " + lastName + "!");

		// AGE ---- WHEN THE USER WILL PAY OFF LOANS (IF/ELSE STATEMENT)
		if (age % 2 == 0) {
			System.out.println("You will pay off their student loans in 16 years."); // if the age is divisible by 2
		} else {
			System.out.println("You will pay off your student loans in 8 years."); // if the age isn't divisible by 2
		}

		// BIRTHMONTH ----WHAT IS THE USER'S FAVORITE SEASON (IF/ELSE STATEMENT)
		if (month >= 1 && month <= 4) {
			System.out.println("Your favorite season is spring."); // numbers 1-4 = spring
		} else if (month >= 5 && month <= 8) {
			System.out.println("Your favorite season is summer."); // numbers 5-8 = summer
		} else if (month >= 9 && month <= 12) {
			System.out.println("Your favorite season is fall."); // numbers 9-12 = fall
		} else {
			System.out.println("Your favorite season is winter."); // anything else receives this message
		}

		// NUMBER OF SIBLINGS (IF/ELSE STATEMENT)
		if (siblings == 0) {
			System.out.println("You'll be buying a earrings in a few months.");
		} else if (siblings == 1) {
			System.out.println("You'll be buying a tattoo in a few months.");
		} else if (siblings == 2) {
			System.out.println("You'll be buying lipstick in a few months.");
		} else if (siblings == 3) {
			System.out.println("You'll be buying sneakers in a few months.");
		} else if (siblings > 3) {
			System.out.println("You'll be buying a vehicle in a few months.");
		} else {
			System.out.println("You'll be buying rotten candy in a few months.");
		}

		  
		//COLOR OPTIONS (DO/WHILE CONTINUED)
		  if(colorOption.equals("help")) {
		    System.out.println("\nColor Options (ROYGBIV): Red, Orange, Yellow, Green, Blue, Indigo or Violet.");
		 } else if(colorOption.equals("red")) {
			System.out.println("Your favorite food is chicken.");
		 } else if(colorOption.equals("orange")) {
		    System.out.println("Your favorite food is pasta.");
		 } else if(colorOption.equals("yellow")) {
		   System.out.println("Your favorite food is crab legs.");
		 } else if(colorOption.equals("green")) {
		   System.out.println("Your favorite food is spinach.");
		 } else if(colorOption.equals("blue")) {
		   System.out.println("Your favorite food is tortilla soup.");
		 } else if(colorOption.equals("indigo")) {
		   System.out.println("Your favorite food is sushi.");
		 } else if(colorOption.equals("violet")) {
			    System.out.println("Your favorite food is cobb salad."); 
		}
	
	}
}
