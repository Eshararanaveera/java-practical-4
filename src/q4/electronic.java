package q4;

public class electronic extends product{

	String brands;
	String model;
	
	public electronic(int productId, String name, double price,String brands1,String model1) {
		super(productId, name, price);
		brands=brands1;
		model=model1;
	
	}

}
