package com.spring.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {
	
	private int id;
	private String name;
	private long price;
	private Date dateAdded;
	
	public EProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public EProductEntity(String name, long price, Date dateAdded) {
		super();
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	public String toString() {
		return "EProductEntity [id=" + id + ", name=" + name + ", price=" + price + ", dateAdded=" + dateAdded + "]";
	}
	
	

}
