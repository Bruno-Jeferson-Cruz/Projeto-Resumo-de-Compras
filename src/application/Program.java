package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entitis.Client;
import entitis.Order;
import entitis.OrderItem;
import entitis.Product;
import entitis.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter Client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date(dd/mm/yyyy): ");
		String birthdate = sc.nextLine();
		Client c = new Client(name, email, sdf.parse(birthdate));
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order or = new Order(new Date(), status, c);
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			Product p = new Product(pName, pPrice);
			
			OrderItem oi = new OrderItem(quantity, pPrice, p);
			
			or.addItem(oi);
		}
		System.out.println();
		System.out.println(or);
		sc.close();
	}

}
