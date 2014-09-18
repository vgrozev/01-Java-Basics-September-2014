import java.io.*;
import java.util.*;

public class _09_ListOfProducts {

	public static void main(String[] args) {

		ArrayList<Product> list_of_products = new ArrayList<Product>();
		Writer fileWriter = null;

		String inputFile = "input.txt";
		String outputFile = "Output.txt";
		
		try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));) {
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					// End of file is reached
					break;
				}

				String[] lineReadSplit = line.split("\\s");
				String productName = lineReadSplit[0];
				double price = Double.parseDouble(lineReadSplit[1]);
				list_of_products.add(new Product(productName, price));
				
			}// end of while
		} // end of try
		
		catch (IOException ioex) {
			System.err.println("Cannot read the file " + inputFile);
		}// end of catch
		
		//sort by Price --> uses the "compareTo" method override in the Product class
		Collections.sort(list_of_products);
		
		try {
			fileWriter = new BufferedWriter(new FileWriter(outputFile));
			for (Product product : list_of_products) {
				//the outut is formated to preserve the original decimal placess
				fileWriter.write(String.format("%.2f",product.getPrice()) + " " + product.getName() + "\r\n");
			}
		} // end of try
		catch (Exception e) {
			System.out.println("Error");
		}

		finally {
				try {
					fileWriter.close();
				} 
				catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}// end of finally
	}
}

class Product implements Comparable<Product>{

	private String name;
	private double price;

	// constructor..
	public Product(String productName, double price) {
		this.name = productName;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override 
	public int compareTo(Product p1) {
		
	   int compareResult = Double.compare(this.getPrice(),p1.getPrice());
	   
	   //System.out.println(compareResult);
	   
	   return compareResult;
	    
	   
	   /*  if(compareResult > 0) {
	        return 1;
	     }
	     else if(compareResult < 0) {
	        return -1;
	     }
	     else {
	        return 0;
	     }*/
	}
}
