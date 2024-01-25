package entitis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitis.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> listItems=new ArrayList<>();
	private Client client;

	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status,Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client=client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public List<OrderItem> getListItems() {
		return listItems;
	}

	public void addItem(OrderItem item) {
		listItems.add(item);
	}
	public void removeItem(OrderItem item) {
		listItems.remove(item);
	}
	public double total() {
		double sum=0;
		for(OrderItem it :listItems) {
			sum+=it.subTotal();		}
		return sum;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Order moment: "+moment+"\nStatus: "+status+"\n"+client+"\nOrder Items:\n");
		for(OrderItem item:listItems) {
			sb.append(item+"\n");
		}
		sb.append("Total price: $ "+total());
		return sb.toString();
	}
}
