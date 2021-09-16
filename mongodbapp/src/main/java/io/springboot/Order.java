package io.springboot;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Orderlist")
public class Order {
	@Id
	public int id;
	public double total;
	public String date;
	public String customer;
		
	public Order() {
	}	

	public Order(int id, double total, String date, String customer) {
		super();
		this.id = id;
		this.total = total;
		this.date = date;
		this.customer = customer;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", total=" + total + ", date=" + date + ", customer=" + customer + "]";
	}
}