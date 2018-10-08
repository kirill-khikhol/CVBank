package com.telran.cvBank.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressEntity {
	private String country;
	private String cityTown;
	private String street;
	private String houseBuilding;
	private String postcode;
	private String phone;
}
