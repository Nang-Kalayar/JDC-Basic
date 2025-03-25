package com.jdc.ecommerce;
import java.util.*;
public class Item implements Comparable {
	private String id;
	private String name;
	private double retail;
	private int quantity;
	private double price;
	
	Item(String idIn,String nameIn,String retailIn,String quantityIn){
		id =idIn;
		name = nameIn;
		retail = Double.parseDouble(retailIn);
		quantity = Integer.parseInt(quantityIn);
		
		if(quantity>400)
			price = retail *5D;
		else if(quantity >200)
			price = retail *6D;
		else
			price =retail*7D;
		price = Math.floor(price*100 +5)/100;
		
	}

}
