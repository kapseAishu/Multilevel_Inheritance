package com.prime.javaintro.multiinheritance;

public class MainFlipkart {
   public static void main(String[] args) {
	   Filpkart f=new Filpkart();
	   f.order();
	   
	   OrderStatus os=new OrderStatus();
	   os.pack();
	   os.ship();
	   os.order();
	   
	   Delivery d=new Delivery();
	   d.delivery();
	   d.pack();
	   d.ship();
	   d.order();
	   
	   
	   
   }
}
