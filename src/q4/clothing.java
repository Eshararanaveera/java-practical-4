package q4;

public class clothing extends product{

	String size;
	String color;
	
	public clothing(int productId, String name, double price,String size1,String color1) {
		super(productId, name, price);
		size=size1;
		color=color1;
	}

}
