/*-------------------------------------------------------------
// AUTHOR: Nicholas Amancio
// FILENAME: Assignment2.java
// SPECIFICATION: The program will ask users to submit positive integers. The program will determine whether it is an prime number or not.
//Then when a user enters -1, the program will determine the maximum, minimum, sum, count, and average.
// FOR: CS 1400- Assignment #4
// TIME SPENT: 4 hours
//-----------------------------------------------------------*/
import java.util.Scanner;

//class name should match the file name 
public class Assignment4 
{	
	//main method
		/*//hold an integer
		int number = 0;
		//counter for numbers
		int counter = 0;
		//int for adding all the numbers together
		int summing = 0;
		//int for the maximum number and minimum number
		int maxNumber = 0;
		int minNumber = 0;

		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//asks for the input of the user
		System.out.println("Enter a positive integer. Enter -1 to quit.");
		number = input.nextInt();
		maxNumber = number;
		minNumber = number;
		
		//set a while loop to allow the user to input positive integers until they enter -1
		while (number != -1)
		{
			isPrime(number);
			
			counter++;
			
			summing += number;
			
			if (number > maxNumber)		//replaces the maxNumber if the number inputed is bigger than the Maximum
			{
				maxNumber = number;
			}
			
			if (number < minNumber)		//replaces the minNumber if the number inputed is smaller than the Minimum
			{
				minNumber = number;
			}
			System.out.println("Enter a positive integer. Enter -1 to quit.");
			number = input.nextInt();
		}	
		
		//when -1 is entered, the program will output the following: Maximum, Minimum, Sum, Counter, and Average.
		System.out.println("The maximum positive number is: " + maxNumber);
		System.out.println("The minimum positive number is: " + minNumber);
		System.out.println("The sum is: " + summing);
		System.out.println("The count of number(s): " + counter);
		System.out.printf("The average is %.2f", average(summing, counter));
		
		//close the input
		input.close();
	}
	/**
	 * for loop to calculate whether the number is prime, not prime, or neither.
	 * loop goes through each i from 2 all the way to number/2 and then sees if the remainder is 0
	 * if it is 0, then it is not prime, if it goes through all the int i and the remainder is 0, then it is prime
	 * 
	 * @param number	integer inputed by the user
	 * @return			determines whether the integer is prime, not, or neither
	 */
	/*private static String isPrime(int number)
	{
		//holds the results
	
		//holds a boolean
		boolean flag = false;
		
		//1 is the only exception. It is neither prime or not prime. But the code will still count it.
		if (number == 1)
		{
			String result = "The number " + number + " is neither";
			return result;
		}	
	
		for (int i = 2; i <= number / 2; i++)
		{
			if (number % i == 0 )
			{
				flag = true;
					break;
			}
			
		}
		if (!flag)
		{
			String result = "The number " + number + " is a prime number.";
			return result;
		}
		else
		{
			String result = "The number " + number + " is not a prime number.";
			return result;
		}	
		
	}
	
	/**
	 * Find the average taken from the sum and the count of numbers
	 * 
	 * @param counter	An int that is incremented once every time a user inputs a new number
	 * @param summing	An int that is updated every time a user inputs a new number
	 * @return			The average from the sum divided by the counter
	 */
	/*private static double average(int summing, int counter)
	{
		double result = 0;
		
		result = summing / counter;
		return result;
	}*/
	public static void main(String[] args) {
		int number, minNumber, maxNumber = 0;
		int counter = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		//asks for the input of the user
		System.out.println("Enter a positive integer. Enter -1 to quit.");
		number = input.nextInt();
		minNumber = number;
		
		while (number != -1) {
			isPrime(number);
			
			counter++;
			
			sum += number;
			
			if (number > maxNumber)		//replaces the maxNumber if the number inputed is bigger than the Maximum
			{
				maxNumber = number;
			}
			
			if (number < minNumber)		//replaces the minNumber if the number inputed is smaller than the Minimum
			{
				minNumber = number;
			}
			System.out.println("Enter a positive integer. Enter -1 to quit.");
			number = input.nextInt();
			}
			
		//when -1 is entered, the program will output the following: Maximum, Minimum, Sum, Counter, and Average.
			System.out.println("The maximum positive number is: " + maxNumber);
			System.out.println("The minimum positive number is: " + minNumber);
			System.out.println("The sum is: " + sum);
			System.out.println("The count of number(s): " + counter);
			average(sum, counter);
				
			//close the input
			input.close();	
		}
			
			
	
	
	public static void isPrime(int number) {
		//holds the results
		
		//holds a boolean
		boolean flag = false;
		
		//1 is the only exception. It is neither prime or not prime. But the code will still count it.
		if (number == 1)
		{
			System.out.println("The number " + number + " is neither");
			
		}	
	
		for (int i = 2; i <= number / 2; i++)
		{
			if (number % i == 0 )
			{
				flag = true;
					break;
			}
			
		}
		if (!flag)
		{
			System.out.println("The number " + number + " is a prime number.");
			
		}
		else
		{
			System.out.println("The number " + number + " is not a prime number.");
		}	
		
	}
		//hello world
	public static void average(int sum, int counter) {
		double result = 0;
		
		result = sum / counter;
		System.out.printf("The average of the numbers are %.2f", result);

	}
	
}
	
