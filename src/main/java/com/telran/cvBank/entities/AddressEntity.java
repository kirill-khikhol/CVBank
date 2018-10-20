package com.telran.cvBank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.telran.cvBank.dto.AddressDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressEntity implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	private String country;
	private String cityTown;
	private String street;
	private String houseBuilding;
	private String postcode;
	private String phone;

	public AddressEntity(AddressDto address) {
		this.country = address.getCountry();
		this.cityTown = address.getCityTown();
		this.street = address.getStreet();
		this.houseBuilding = address.getHouseBuilding();
		this.postcode = address.getPostcode();
		this.phone = address.getPhone();
	}
}
