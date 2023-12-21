package com.omrbranch.payload.product;

import com.omrbranch.pojo.product.Searchproduct_Input_Pojo;

public class ProductPayload {
	public static Searchproduct_Input_Pojo getProductPayload(String pName) {
		Searchproduct_Input_Pojo searchproduct_Input_Pojo = new Searchproduct_Input_Pojo(pName);
		return searchproduct_Input_Pojo;
	}

}
