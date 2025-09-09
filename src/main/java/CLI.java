/*
* Java Calculator
 */

import java.util.Scanner;
import dev.iahmadgad.math.expression.Evaluator;

/**
 * CLI class.
 * 
 * @author Ahmad Asaad
 * @version 0.7
 * @since 0.6
 */

public class CLI 
{
	private static Scanner scanner = new Scanner(System.in);
	
	private CLI()
	{
		while(true)
		{
			System.out.print(">>> ");
			String sentence = scanner.nextLine();
			if(sentence.compareTo("exit") == 0) break;
			System.out.println(Evaluator.getEnhancedValue(sentence));
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("--- Java-Calculator 0.8 by Ahmad Asaad ---\nto stop type exit");
		new CLI();
		System.exit(0);
	}
}
