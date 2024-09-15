package q4;

public class product {

	int productId;
	String name;
	double price;
	public product(int productId, String name, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void displadetails() {
		System.out.println("produts id= " +productId);
		System.out.println("name =" +name);
		System.out.println("price =" +price);
	}
	
}
