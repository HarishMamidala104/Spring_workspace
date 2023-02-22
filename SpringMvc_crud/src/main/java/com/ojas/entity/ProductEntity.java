package com.ojas.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class ProductEntity {
	@Id
	private int pid;
	private String pname;
	private int Qty;
	private double price;
	public ProductEntity() {}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ProductEntity(int pid, String pname, int qty, double price) {
		
		this.pid = pid;
		this.pname = pname;
		Qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductEntity [pid=" + pid + ", pname=" + pname + ", Qty=" + Qty + ", price=" + price + "]";
	}
	

}
