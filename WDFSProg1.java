//Will Shaferly
//CSC-171
//Assignment 1

package package1;

import java.util.Scanner;

public class WDFSProg1 {
	public static void main(String[] args)
	{
		Scanner myKeyboard;
		Scanner (myKeyboard = new Scanner(System.in));
		
		int DegreesF, DegreesC;
		
		System.out.println("Enter the degree in Fahrenheit as an integer:");
	
		DegreesF = myKeyboard.nextInt();
	
		DegreesC = 5 * (DegreesF - 32)/9;
	
		System.out.println("The degree in Celcius is:" + DegreesC);
	}
	
	private static void Scanner(Scanner scanner) {
		
	}
}

/*Pseudocode:
The first thing to happen is text to show up so that the user knows what
to input. The Scanner is used to allow users to input their desired temperature
to be calculated from Fahrenheit to Celsius. The formula is then applied 
as the variables DegreesF (Fahrenheit) and DegreesC (Celsius). The answer is
printed along with some explanatory text. */
