package app.biarca;

import app.biarca.operations.Addition;
import app.biarca.operations.Division;
import app.biarca.operations.Exponent;
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
	

        public void testDivision(){
                int a=200;
                int b=10;
                
                int result = Division.divide(a,b);
                System.out.println("Division of a,b is: " + result);  
          }



	public void testSubstraction(){
		int a = 200;
		int b = 150;
		int result = Substraction.minus(a, b);
		System.out.println("Substraction: "+result);
		
	}
<<<<<<< Updated upstream
	private void testExponent() {
		int a = 2;
		int b = 3;
		int result = Exponent.exp(a, b);
		System.out.println("Exponent: "+result);
		
=======
        /**
	 * Function for testing Remainder Framework.
	 */
	public void testREmainder() {
		int a=15;
		int b=2;
		
		int result=Remainder.remainder(a, b);
		System.out.println("Remainder: "+result);
	}
        public void testMultiply(){
               int a=10;
               int b=15;
               int result = Multiplication.multiply(a,b);
               System.out.println("Multiplication : "+result);
		
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

        myApp.testDivision();

		myApp.testSubstraction();
		myApp.testExponent();
                myApp.testMultiply();

	}
}
