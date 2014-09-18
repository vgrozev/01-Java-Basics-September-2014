import java.io.*;
import java.util.*;

public class _10_OrderProducts {

	public static void main(String[] args) {

		ArrayList<ProductToOrder> list_of_products = new ArrayList<ProductToOrder>();
		Writer fileWriter = null;

		String productsFile = "Products.txt";
		String orderFile = "Order.txt";
		String outputFile = "Output.txt";

		double outputPrice = 0;
		
		try (BufferedReader fileReader = new BufferedReader(new FileReader(productsFile));) {
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					// End of file is reached
					break;
				}

				String[] lineReadSplit = line.split("\\s");
				String productName = lineReadSplit[0];
				double price = Double.parseDouble(lineReadSplit[1]);
				list_of_products.add(new ProductToOrder(productName, price));
			}// end of while
			fileReader.close();
		} // end of try
		catch (IOException ioex) {
			System.err.println("Cannot read the file " + productsFile);
		}// end of catch
		
		try (BufferedReader fileReader2 = new BufferedReader(new FileReader(orderFile));) {
			while (true) {
				String line = fileReader2.readLine();
				if (line == null) {
					// End of file is reached
					break;
				}
				String[] lineReadSplit = line.split("\\s");
				double quantity = Double.parseDouble(lineReadSplit[0]);
				String orderProductName = lineReadSplit[1];
				
				//loop and compare names, add add to final price of the order
				for(int i = 0; i < list_of_products.size(); i++){
					//System.out.print(list_of_products.get(i).getName() + " " +  list_of_products.get(i).getPrice() + " ");	
					if (orderProductName.equals(list_of_products.get(i).getName())){
						
						outputPrice += (list_of_products.get(i).getPrice()) * quantity; 
						
					}//end of if
				}// end of for
			}// end of while
			//System.out.print(outputPrice);
			
			fileReader2.close();
			
		} // end of try
		catch (IOException ioex) {
			System.err.println("Cannot read the file " + orderFile);
		}// end of catch
		
		try {
			fileWriter = new BufferedWriter(new FileWriter(outputFile));
			/*for (ProductToOrder product : list_of_products) {
				fileWriter.write(product.getPrice() + " " + product.getName() + "\r\n");
			}*/
			outputPrice = (double)Math.round(outputPrice * 100000) / 100000;
			fileWriter.write(Double.toString(outputPrice));
			
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

class ProductToOrder {

	private String name;
	private double price;

	// constructor..
	public ProductToOrder(String productName, double price) {
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
}// end of class
