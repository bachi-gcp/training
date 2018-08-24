package app.biarca;

import app.biarca.operations.Addition;
import app.biarca.operations.Substraction;

/**
 * Application class that is implementing 'Add', 'Substraction',
 *  'Multiplication', 'Division', 'Remainder' and  'Exponent'
 *  
 * @author Bhaskar
 *
 */
public class Application {
	
	/**
	 * Function for testing 'Add' framework.
	 */
	public void testAddition() {
		int a = 100;
		int b = 200;
		
		int result = Addition.sum(a, b);
		System.out.println("Addition: " + result);
	}
	
	public void testSubstraction(){
		int a = 200;
		int b = 150;
		int result = Substraction.minus(a, b);
		System.out.println("Substraction: "+result);
		
	}
	
	/**
	 * Application main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Initialising application */
		Application myApp = new Application();
		
		/* Test addition of two number  */
		myApp.testAddition();
		myApp.testSubstraction();
	}
}
