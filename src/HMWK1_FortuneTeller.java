import java.util.Scanner;

public class HMWK1_FortuneTeller {

	public static void main(String[] args) {
		// Fortune Teller Homework

	Scanner input = new Scanner(System.in);
	
	//FIRST NAME INPUT
	System.out.println("Enter your first name, please."); //prompts user to enter first name
	String firstName = input.nextLine(); //the user will enter their first name
	firstName = firstName.toLowerCase(); //first name will display lowercase
		
	//LAST NAME INPUT
	System.out.println("\nNow your last name."); //prompts user to enter last name
	String lastName = input.nextLine(); //the user will enter their last name
	lastName = lastName.toLowerCase(); //last name will display lowercase
	
	//AGE INPUT
	System.out.println("\nHow old are you?"); //prompts user to enter age
	int age = input.nextInt(); //the user will enter age
	
	//BIRTHMONTH INPUT
	System.out.println("\nWhat month were you born in? (Ex: If it's March, put the number 3.)"); //prompts user to enter their birth month
	int month = input.nextInt(); //the integer of the month	

	//NUMBER OF SIBLINGS
	System.out.println("\nHow many siblings do you have?"); //prompts user to enter the number of siblings they have
	int siblings = input.nextInt(); //the integer of the siblings
	
	//FAVORITE COLOR
	System.out.println("\nWhat's your favorite color?"); //prompts user to enter favorite color
	String colorOption = input.nextLine(); //the string of the color
		
	
	//NUMBER OF SIBLINGS (IF/ELSE STATEMENT)
	int numberOfSiblings;
	if (siblings < 0) {
		System.out.println("\nYou'll be buying");
	} else {
		System.out.println("\nYou'll pay off your student loans in 8 years.");
	} else {
		System.out.println("\nYou'll pay off your student loans in 8 years.");
	} else {
		System.out.println("\nYou'll pay off your student loans in 8 years.");
	}
	

	//AGE ---- WHEN THE USER WILL PAY OFF LOANS (IF/ELSE STATEMENT)
	int loansPaid;
	if (age % 2 == 0) {
		System.out.println("\nYou'll pay off your student loans in 16 years.");
	} else {
		System.out.println("\nYou'll pay off your student loans in 8 years.");
	}
	
	
	//BIRTHMONTH ----WHAT IS THE USER'S FAVORITE SEASON (IF/ELSE STATEMENT)
	int birthMonth;
	if (month >= 1 && month <= 4) {
		System.out.println("\nYour favorite season is spring."); //numbers 1-4 = spring
	} else if (month >= 5 && month <= 8) {
		System.out.println("\nYour favorite season is summer."); //numbers 5-8 = summer
	} else if (month >= 9 && month <= 12) {
		System.out.println("\nYour favorite season is fall."); //numbers 9-12 = fall
	} else {
		System.out.println("\nYour favorite season is winter."); //anything else receives this message
	}
	}
}
