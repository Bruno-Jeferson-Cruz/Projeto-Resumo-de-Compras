package entitis;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	public OrderItem() {
		
	}
	public OrderItem(Integer quantity, Double price,Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double subTotal() {
		return price*quantity;
	}
	@Override
	public String toString() {
		return getProduct().getName()+", $ "+price+", Quantity: "+quantity+", Sub total: "+subTotal();
		}
}
