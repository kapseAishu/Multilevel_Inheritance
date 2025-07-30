package com.prime.javaintro.multiinheritance;

public class OrderStatus extends Filpkart {
	public void pack() {
		System.out.println("your order of :"+product_name+"is packed successfully");
	}
	public void ship() {
		System.out.println("your order of :"+product_name+"of price"+price+"is shipped and ready to be delivered");
	
}
}
