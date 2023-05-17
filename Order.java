package bt1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
	private static int currentOrderID = 1;
	private static Order currentOrder;
	private int orderID;
	private LocalDate orderDate;
	private List<OrderDetail>lineItems;
	private int count = 0;
	
	public Order() {		
	}
	
	public Order (int orderID, LocalDate orderDate, int count) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.count = count;
	}
	public Order(int orderId, LocalDate orderDate, OrderDetail[] lineItems, int count) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
		this.count = count;
	}
	public Order (LocalDate orderDate) {
		if(currentOrder == null) {
			currentOrder = this;
			this.orderID = currentOrderID++;
			this.orderDate = orderDate;
			this.lineItems = new ArrayList<>();
			this.count = ++count;
		}else {
			this.orderID = currentOrder.getOrderID();
			this.orderDate = orderDate;
			this.lineItems = currentOrder.getLineItems();
			this.count = currentOrder.getCount();
		}
	}
	public static int getCurrentOrderID() {
		return currentOrderID;
	}
	public int getOrderID() {
		return orderID;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public List<OrderDetail>  getLineItems() {
		return lineItems;
	}
	public int getCount() {
		return count;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;		
	}
	public void addLineItems(Product p,int quatity) {
		if (currentOrder ==null) {
			currentOrder = new Order(LocalDate.now());
		}
		lineItems.add(new OrderDetail (quatity,p));
	}
	public double calcTotalCharge() {
		double totalCharge = 0;
		for (OrderDetail s : lineItems) {
			totalCharge += s.calcTotalPrice();
		}
		return totalCharge;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ma Order:").append(orderID).append("Ngay mua:").append(orderDate).append("\n");
		sb.append(String.format("|%-15s|%-25s|%-15s|%-20s|%-10s|%-20s|%n","STT","MaSP","Mo ta","Don Gia","So luong","Thanh tien"));
		for(int i =0;i<lineItems.size();i++) {
			OrderDetail orderDetail =lineItems.get(i);
			Product product = orderDetail.getProduct();
			sb.append(String.format("|%-15s|%-25s|%-15s|%-20s|%-10s|%-20s|%n",i+1,product.getProductID(),product.getDescription(),product.getPrice(),orderDetail.getQuality(),orderDetail.calcTotalPrice()));	
		}
		sb.append("Tong thanh toan la:").append(calcTotalCharge());
		return sb.toString();
	}

}