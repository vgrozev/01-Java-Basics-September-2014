import java.util.Scanner;


public class PointsInsideFigure {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		while (true){
					
			double x = userInput.nextDouble();
	        double y = userInput.nextDouble();
	
	        if (x < 12.5 || x > 22.5 || y < 6 || y > 13.5){
	        	
	        	System.out.println("Outside");
	        }
	        else {
	        	
	        	if ((x < 20 && x > 17.5) && (y > 8.5) ){
	        		
	        		System.out.println("Outside");
	        	}
	        	else{
	        		
	        		System.out.println("Inside");
	        	}
	        }
	        
		}//end while
	}//end of main

}// end of class
