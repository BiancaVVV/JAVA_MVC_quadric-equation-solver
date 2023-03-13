

// The Model performs all the calculations needed
// and that is it. It doesn't know the View 
// exists

public class CalculatorModel {

	// Holds the value of the solution of the equation made with the numbers
	// entered in the view
	
	
	
	 //String[] rootArray = new String[2];
	String[] rootArray;
	//private ArrayList<Double> arrayList = new ArrayList<Double>(Arrays.asList(solution1));  
	
	
	public void equation(int a, int b, int c){
		
		//calculationValue = firstNumber + secondNumber;
		
		double root1, root2;

	    // calculate the determinant (b2 - 4ac)
	    double determinant = b * b - 4 * a * c;

	    // check if determinant is greater than 0
	    if (determinant > 0) {
	    	rootArray = new String[2];
	    	rootArray[0] = "Solutiile ecuatiei sunt: ";
	      // two real and distinct roots
	      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	      root2 = (-b - Math.sqrt(determinant)) / (2 * a);
	      
	      //System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	      rootArray[0] += "x1=";
	      rootArray[0] += Double.toString(root1);
	      rootArray[1] = "x2=";
	      rootArray[1] += Double.toString(root2);
	    }

	    // check if determinant is equal to 0
	    else if (determinant == 0) {
	    	rootArray = new String[1];
	      // two real and equal roots
	      // determinant is equal to 0
	      // so -b + 0 == -b
	      root1 = root2 = -b / (2 * a);
	      rootArray[0] = "Solutii egale x1=x2= ";
	      rootArray[0] += Double.toString(root1);
	      
	      //System.out.format("root1 = root2 = %.2f;", root1);
	    
	    }

	    // if determinant is less than zero
	    else {
	    	rootArray = new String[2];
	    	rootArray[0] = "Solutiile complexe sunt : ";
	      // roots are complex number and distinct
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      rootArray[0] += "x1=";
	      rootArray[0] += Double.toString(real);
	      rootArray[0] += "+";
	      rootArray[0] += Double.toString(imaginary);
	      rootArray[0] += "i";
	      rootArray[1] = "x2=";
	      rootArray[1] += Double.toString(real);
	      rootArray[1] += "-";
	      rootArray[1] += Double.toString(imaginary);
	      rootArray[1] += "i";
 	      //System.out.format("root1 = %.2f+%.2fi", real, imaginary);
	     // System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	    }
	  
	
		
	}
	

	
	public String[] getCalculationValue(){
		
		
		return rootArray;
		
		
		
	}
	
}