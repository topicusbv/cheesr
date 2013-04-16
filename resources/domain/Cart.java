package org.apache.wicket.training.cheesr.domain;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Cheese> contents = new ArrayList<Cheese>();

	private String name;
	private String street;
	private String city;
	private Integer zipcode;
	private Country country;

	public List<Cheese> getContents() {
		return contents;
	}

	public void setContents(List<Cheese> contents) {
		this.contents = contents;
	}

	public String getTotal() {
		double total = 0;
		for (Cheese item : contents) {
			total += item.getPrice();
		}
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(total);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String toString() {
		return name + " from " + city + " (" + country + ") has bought "
				+ getTotal() + " worth of cheese";
	}
}
