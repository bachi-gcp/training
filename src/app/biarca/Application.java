package app.biarca;

import app.biarca.operations.Addition;

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
	}
}
