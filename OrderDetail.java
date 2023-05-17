package bt1;

public class OrderDetail extends Product {
public int quality;
public Product product;
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(String description, String productID, double price) {
		super(description, productID, price);
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(int quality, Product product) {
		super();
		this.quality = quality;
		this.product = product;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
 public double calcTotalPrice() {
	double thanhtien;
	thanhtien = quality *product .getPrice();
	return thanhtien;
}

@Override
public String toString() {
	return "Ma SP: " + product.getProductID()+", Mo Ta: "+ product.getDescription()+", Don Gia:" + product.getPrice()+", so luong:"+ quality
			+ ", thanh tien:"+calcTotalPrice();
}
 
}
