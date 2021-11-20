
//Exercise 5.11 Solution: Small.java
//Author Mike Knoles
//Program finds the smallest of several integers
import java.util.Scanner;

public class Small {

	// finds the smallest integer
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int smallest = 0; // smallest number
		int number = 0; // number entered by user
		int integers; // number of integers

		System.out.print("Enter number of integers: ");
		integers = input.nextInt();

		for (int counter = 1; counter <= integers; counter++) {
			System.out.print("Enter integer: ");
			number = input.nextInt();
			// captures initial input as smallest value
			if (counter == 1) {
				smallest = number;
			}
			// compares number on subsequent iterations against smallest
			else if (number < smallest) {
				smallest = number; // replaces smallest if new number is smaller
			}
		}

		System.out.printf("Smallest Integer is: %d%n", smallest);
	}

} // end class Small
