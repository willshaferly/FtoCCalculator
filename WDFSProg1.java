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