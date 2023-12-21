package com.omrbranch.payload.address;

import com.account.pojo.City_Input_pojo;
import com.omrbranch.pojo.address.AddUserAddress_Input_pojo;
import com.omrbranch.pojo.address.DeleteUserAddress_Input_pojo;
import com.omrbranch.pojo.address.UpdateUserAddress_Input_Pojo;

public class AddressPayload {
	public static City_Input_pojo getCityListPayload(String stateIdText) {
		City_Input_pojo city_Input_pojo = new City_Input_pojo(stateIdText);
		return city_Input_pojo;
	}
	public static AddUserAddress_Input_pojo addAddressPayload(String first_name,String last_name,String mobile,String apartment,int state,int city,int country,String zipcode,String address,String address_type ) {
		AddUserAddress_Input_pojo addUserAddress_Input_pojo = new AddUserAddress_Input_pojo(first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
		return addUserAddress_Input_pojo;
	}
	public static UpdateUserAddress_Input_Pojo updateAddress(String address_id,String first_name,String last_name,String mobile,String apartment,int state,int city,int country,String zipcode,String address,String address_type) {
		UpdateUserAddress_Input_Pojo updateUserAddress_Input_Pojo = new UpdateUserAddress_Input_Pojo(address_id, first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
		return updateUserAddress_Input_Pojo;
	}
	public static DeleteUserAddress_Input_pojo deleteAddress(String address_id) {
		DeleteUserAddress_Input_pojo deleteUserAddress_Input_pojo = new DeleteUserAddress_Input_pojo(address_id);
		return deleteUserAddress_Input_pojo;
	}
}
// sample purpose
